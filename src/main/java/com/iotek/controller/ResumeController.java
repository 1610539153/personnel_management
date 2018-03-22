package com.iotek.controller;

import com.iotek.po.Customer;
import com.iotek.po.Resume;
import com.iotek.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/3/17.
 */
@Controller
@RequestMapping(value = "/resume")
public class ResumeController{
    @Autowired
    private ResumeService resumeService;
    @RequestMapping(value = "/write.view")
    public   String   regPage()
    {
        return "resume/business";
    }

    @RequestMapping(value = "/write.do")
    public   String   resumeRefer(
            @ModelAttribute Resume resume, HttpSession session,Model model){
        Customer customer = (Customer) session.getAttribute("customer");//取出customer
        resume.setCustomerId(customer.getId());//设置简历对应的游客的Id
        boolean addFlag = resumeService.addResume(resume);
            if (addFlag){
                session.setAttribute("resume",resume);
                return "resume/homePage";
            }
          model.addAttribute("resume1","添加成功");
          return "resume/business";
    }

    @RequestMapping(value = "/checkResume.view")
    public String resumeCheck(@ModelAttribute Resume resume,
                              HttpSession session,Model model
                            ){
        Customer customer = (Customer) session.getAttribute("customer");//取出customer
        resume.setCustomerId(customer.getId());

       List<Resume> resume1 = resumeService.checkMyResume(resume);
        if(resume1.size()==0){
            model.addAttribute("info8","你还没有提交任何简历");
        }else{
            model.addAttribute("info1",resume1);
        }
        return  "resume/MyResume";
    }
    @RequestMapping(value = "/homePage.view")
    public   String   homeBack()
    {
        return "resume/homePage";
    }
    @RequestMapping(value = "/update.view")
    public String CheckResumeExist(){
        return "resume/CheckResumeExist";
    }
    @RequestMapping(value = "/exist.do")
    public String checkMyResumeExist
            (@ModelAttribute Resume resume,
             HttpSession session,Model model){
        Customer customer = (Customer) session.getAttribute("customer");//取出customer
        resume.setCustomerId(customer.getId());//设置简历对应的游客的Id
        Resume resume1 = resumeService.checkAppointResumeByResumeId(resume);
        if(resume1==null){
            model.addAttribute("info2","请查看你是否有这个简历");
            return  "resume/homePage";
        }
        session.setAttribute("resume",resume);
        return "resume/updateMyResume";
    }
    @RequestMapping(value = "/update.do")
    public String updateMyResume
            (@ModelAttribute Resume resume,
             HttpSession session,Model model){
        Resume resume1 = (Resume) session.getAttribute("resume");
        resume.setId(resume1.getId());
        resume.setResumeModifiedTime(new Timestamp(new Date().getTime()));
        boolean b = resumeService.updateResume(resume);
        if(b){
            model.addAttribute("info3","修改成功");
        }
        return  "resume/homePage";
    }
    @RequestMapping(value = "/putResume.view")
    public String putResume(@ModelAttribute Resume resume,
                              HttpSession session,Model model
    ){
        Customer customer = (Customer) session.getAttribute("customer");//取出customer
        resume.setCustomerId(customer.getId());
        List<Resume> resume2 = resumeService.checkMyResume(resume);
        if(resume2.size()==0){
            model.addAttribute("putResume6","对不起请先填写简历");
            return  "resume/homePage";
        }
        System.out.println(resume2);
        return  "putResume/putResumePage";
    }
}
