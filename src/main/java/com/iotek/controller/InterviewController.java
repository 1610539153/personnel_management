package com.iotek.controller;


import com.iotek.po.Customer;
import java.util.List;
import com.iotek.po.Interview;
import com.iotek.po.PutResume;
import com.iotek.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/3/21.
 */
@Controller
@RequestMapping(value = "/interview")
public class InterviewController{
    @Autowired
    private InterviewService interviewService;
    @RequestMapping(value ="/additionInterviewMessage.do")
     public String addInterviewTwo
            (@ModelAttribute Interview interview,
             HttpSession session, Model model){
       PutResume putResume = (PutResume) session.getAttribute("checkId");
       interview.setCustomerId(putResume.getCustomerId());
        boolean b = interviewService.addInterview(interview);
            if(b){
            model.addAttribute("interview1","面试消息发布成功");
            return "admin/homePage";
          }
          model.addAttribute("interview1","面试消息发布失败");
          return "admin/homePage";
    }
    @RequestMapping(value ="/checkMyInterview.view")
    public String checkMyInterview
            (@ModelAttribute Interview interview,
             HttpSession session, Model model){
        Customer customer = (Customer) session.getAttribute("customer");//取出customer
        interview.setCustomerId(customer.getId());
        List<Interview> interviews = interviewService.checkMyInterviewMessage(interview);
        if(interviews.size()==0){
            model.addAttribute("interview2","没有你的面试消息");
            return  "resume/homePage";
        }
        model.addAttribute("interview3",interviews);
        model.addAttribute("interview4","你可以进行员工的注册");

        return "emp/register";
    }
}
