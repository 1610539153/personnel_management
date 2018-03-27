package com.iotek.controller;

import com.iotek.po.Customer;
import com.iotek.po.PutResume;
import com.iotek.service.PutResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/3/22.
 */
@Controller
@RequestMapping(value = "/putResume")
public class PutResumeController {
    @Autowired
    private PutResumeService putResumeService;
    @RequestMapping(value = "/putResume.do")
    public String putResumeDo(@ModelAttribute PutResume putResume,
                              HttpSession session, Model model){
        Customer customer = (Customer) session.getAttribute("customer");//取出customer
        putResume.setCustomerId(customer.getId());//设置简历对应的游客的Id
        boolean b = putResumeService.addPutResume(putResume);
        if(b){
            model.addAttribute("putResume2","简历投放成功");
            return "resume/homePage";
        }
        model.addAttribute("putResume2","简历投放失败");
        return "resume/homePage";
    }
    @RequestMapping(value ="/checkPutResume.view")
    public String checkPutResumeView
            (@ModelAttribute PutResume putResume,
             HttpSession session, Model model){
        List<PutResume> putResume1 = putResumeService.checkResume();
        if(putResume1.size()==0){
            model.addAttribute("putResume1","没有任何人投放简历");
            return "admin/homePage";
        }
//        session.setAttribute("putResume3",putResume1);
        model.addAttribute("putResume1", putResume1);
        return "admin/homePage";
    }
    @RequestMapping(value ="/additionInterview.view")
    public  String checkPutResumeByCustomerIdView(){
        return "interview/additionInterview";
    }
    @RequestMapping(value ="/additionInterview.do")
    public  String checkPutResumeByCustomerId
            (@ModelAttribute PutResume putResume,
             HttpSession session, Model model){
        List<PutResume> putResumes = putResumeService.checkResumeByCustomerId(putResume);
        if(putResumes.size()==0){
            model.addAttribute("putResume4","该游客没有投放简历");
            return "admin/homePage";
        }
        session.setAttribute("checkId", putResume);
        return   "interview/canAdditionInterview";

    }
}
