package com.iotek.controller;

import com.iotek.po.Attendance;
import com.iotek.po.AttendanceQuestion;
import com.iotek.po.Emp;
import com.iotek.service.AttendanceQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/3/26.
 */
@Controller
@RequestMapping(value ="/attendanceQuestion")
public class AttendanceQuestionController {
    @Autowired
    private AttendanceQuestionService attendanceQuestionService;
    @RequestMapping(value ="/attendanceFine.do")
    public String AttendanceFine
            (@ModelAttribute AttendanceQuestion attendanceQuestion,
             HttpSession session, Model model){
        Emp emp2 = (Emp) session.getAttribute("jobId");
        attendanceQuestion.setEmpId(emp2.getId());
        int hours1 = (int) session.getAttribute("hours1");
        if(hours1>=3){
           attendanceQuestion.setQuestion("迟到达到3个小时，扣掉一天的工资");
            model.addAttribute("fine1","你迟到达到3个小时,扣掉一天的工资");
        }else if(hours1>=1&&hours1<3){
            attendanceQuestion.setQuestion("迟到在3个小时以内，扣掉4分之1的工资");
            model.addAttribute("fine1","你迟到在3个小时以内，扣掉4分之1的工资");
        }else{
            model.addAttribute("fine1","正常上班");
            return "emp/homePage";
        }
        boolean b = attendanceQuestionService.addAttendanceQuestionFine(attendanceQuestion);
        return "emp/homePage";

    }
    @RequestMapping(value ="/checkAttendanceQuestion.view")
    public String checkAttendanceQuestionView(){
        return "redirect:checkAttendanceQuestion.do";
    }
    @RequestMapping(value ="/checkAttendanceQuestion.do")
    public String checkAttendanceQuestionDo
            (@ModelAttribute AttendanceQuestion attendanceQuestion,
             HttpSession session, Model model){
        Emp emp3 = (Emp) session.getAttribute("emp2");
        attendanceQuestion.setEmpId(emp3.getId());
        List<AttendanceQuestion> attendanceQuestions = attendanceQuestionService.checkAttendanceQuestion(attendanceQuestion);
       if(attendanceQuestions.size()==0){
           model.addAttribute("question","没有任何问题");
           return "emp/homePage";
       }
        model.addAttribute("question1",attendanceQuestions);
        return "emp/homePage";
    }
    @RequestMapping(value ="/someoneQuestion.view")
    public String  someoneQuestionView(){
        return "redirect:someoneQuestion.do";
    }
    @RequestMapping(value ="/someoneQuestion.do")
    public String  someoneQuestionDo
            (@ModelAttribute AttendanceQuestion attendanceQuestion,
             HttpSession session, Model model){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM");
        String d=simpleDateFormat.format(new Date());
        int mouth =Integer.parseInt(d)-1;
        List<AttendanceQuestion>  aq =new ArrayList<>();
        Attendance attendance7 = (Attendance) session.getAttribute("attendance7");
        attendanceQuestion.setEmpId(attendance7.getEmpId());
        List<AttendanceQuestion> attendanceQuestions = attendanceQuestionService.checkAttendanceQuestion(attendanceQuestion);
        if(attendanceQuestions.size()==0){
            model.addAttribute("question2","没有任何问题");
            return "salSettlement/lastMonthWageCalculation";
        }
        for(AttendanceQuestion a:attendanceQuestions){
            if(Integer.parseInt(simpleDateFormat.format(a.getAttenCreateTime()))==mouth){
                aq.add(a);
            }
        }
        if(aq.size()==0){
            model.addAttribute("question4","没有任何罚款");
        }
        model.addAttribute("question3", aq);
        return "salSettlement/lastMonthWageCalculation";

    }

}
