package com.iotek.controller;

import com.iotek.po.Admin;
import com.iotek.po.RecruitMessage;
import com.iotek.service.RecruitMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/3/21.
 */
@Controller
@RequestMapping(value = "/recruitMessage")
public class RecruitMessageController{
    @Autowired
    private RecruitMessageService recruitMessageService;

    @RequestMapping(value = "/recruit.view")
    public String addRecruitMessageView(){
        return  "recruitMessage/recruitMessageAddition";
    }

    @RequestMapping(value = "/recruit.do")
    public String addRecruitMessageDo
            (@ModelAttribute RecruitMessage recruitMessage,
             HttpSession session, Model model){
        Admin admin =(Admin) session.getAttribute("adminId");
        recruitMessage.setAdminId(admin.getId());
        boolean b = recruitMessageService.addRecruitMessage(recruitMessage);
        if(b){
            model.addAttribute("recruit1", "发布成功");
           return "admin/homePage";
        }
        model.addAttribute("recruit1", "发布失败");
        return "admin/homePage";
    }
      @RequestMapping(value = "/checkRecruit.view")
      public  String checkRecruit
              (@ModelAttribute RecruitMessage recruitMessage,
               HttpSession session, Model model){
          List<RecruitMessage> recruitMessage1 = recruitMessageService.seekRecruitMessage();
          if(recruitMessage1==null){
              model.addAttribute("recruit2", "没有任何招聘信息");
              return "resume/homePage";
          }
          model.addAttribute("recruit3",recruitMessage1);
          return "resume/homePage";
      }
    @RequestMapping(value = "/checkMyRecruit.view")
    public  String checkMyRecruit
            (@ModelAttribute RecruitMessage recruitMessage,
             HttpSession session, Model model){
        Admin admin =(Admin) session.getAttribute("adminId");
        recruitMessage.setAdminId(admin.getId());
        List<RecruitMessage> recruitMessage1 = recruitMessageService.seekMyRecruitMessage(recruitMessage );
        if(recruitMessage1==null){
            model.addAttribute("recruit4", "没有任何招聘信息");
            return "admin/homePage";
        }
        model.addAttribute("recruit5",recruitMessage1);
        return "admin/homePage";
    }
    @RequestMapping(value = "/deleteMyRecruit.view")
    public String deleteMyRecruitView(){
        return  "recruitMessage/deleteMyRecruitDo";
    }
    @RequestMapping(value = "/deleteMyRecruit.do")
    public  String deleteMyRecruitDo
            (@ModelAttribute RecruitMessage recruitMessage,
             HttpSession session, Model model){

        boolean b = recruitMessageService.deleteMyRecruitMessage(recruitMessage);
        if(b){
            model.addAttribute("deleteMyRecruitMessage1", "删除成功");
            return "admin/homePage";
        }
        model.addAttribute("deleteMyRecruitMessage1", "删除失败，你是否发布过这个招聘");
         return "admin/homePage";
    }

}
