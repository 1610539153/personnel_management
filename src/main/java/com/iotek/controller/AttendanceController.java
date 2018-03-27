package com.iotek.controller;

import com.iotek.po.Attendance;
import com.iotek.po.Emp;
import com.iotek.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.security.provider.certpath.PKIXTimestampParameters;
import sun.util.calendar.BaseCalendar;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * Created by Administrator on 2018/3/25.
 */
@Controller
@RequestMapping(value ="/attendance")
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;
    @RequestMapping(value = "/startWorkAttendance.view")
    public String startWorkAttendanceView(){
     return "redirect:startWorkAttendance.do";
    }
    @RequestMapping(value = "/startWorkAttendance.do")
    public String startWorkAttendanceDo
            (@ModelAttribute Attendance attendance,
             HttpSession session, Model model){
        Emp emp3 = (Emp) session.getAttribute("emp2");
        attendance.setEmpId(emp3.getId());
        List<Attendance> attendances =attendanceService.checkAttendance(attendance);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        if(attendances.size()!=0){
         for(Attendance a: attendances){
             if(simpleDateFormat.format(a.getClockInTime())
                     .equals(simpleDateFormat.format(new Date()))){
                 model.addAttribute("attendance3","请不要重复打上班卡");
                 return "emp/homePage";
             }
           }
        }
        SimpleDateFormat sdf = new SimpleDateFormat( "HH:mm:ss");
        String str=sdf.format(new Date());
        String intNumber =str.substring(0,str.indexOf(":"));
        if(7<=Integer.parseInt(intNumber)&&Integer.parseInt(intNumber)<=8){
            Emp emp2 = (Emp) session.getAttribute("emp2");
            attendance.setEmpId(emp2.getId());
            attendance.setClockInTime(new Date());
            boolean b = attendanceService.addAttendance(attendance);
            if (b){
                model.addAttribute("attendance1", "打卡成功");
                return "emp/homePage";
            }
        }
        if(Integer.parseInt(intNumber)>8){
            Emp emp2 = (Emp) session.getAttribute("emp2");
            attendance.setEmpId(emp2.getId());
            attendance.setClockInTime(new Date());
            attendance.setClockInLate(new Date());
            int hours= Integer.parseInt(intNumber)-8;
            boolean b = attendanceService.addAttendance(attendance);
            if(b){
                session.setAttribute("jobId",emp2);
                session.setAttribute("hours1",hours);
                return "redirect:/attendanceQuestion/attendanceFine.do";
            }
        }
        model.addAttribute("attendance1","不是打卡时间");
        return "emp/homePage";
    }
    @RequestMapping(value = "/closedAttendance.view")
    public String closedAttendanceView(){
        return "redirect:closedAttendance.do";
    }
    @RequestMapping(value = "/closedAttendance.do")
    public String closedAttendanceDo
            (@ModelAttribute Attendance attendance,
             HttpSession session, Model model){
        int c= 0;
        Emp emp3 = (Emp) session.getAttribute("emp2");
        attendance.setEmpId(emp3.getId());
        List<Attendance> attendances =attendanceService.checkAttendance(attendance);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        if(attendances.size()!=0) {
            for (Attendance a : attendances) {
                if (simpleDateFormat.format(a.getClockInTime())
                        .equals(simpleDateFormat.format(new Date()))) {
                    c = a.getId();
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                    String str = sdf.format(new Date());
                    String intNumber = str.substring(0, str.indexOf(":"));
                    if (12 < Integer.parseInt(intNumber) && Integer.parseInt(intNumber)<14) {
                        attendance.setClockOutTime(new Date());
                        Emp emp2 = (Emp) session.getAttribute("emp2");
                        attendance.setEmpId(emp2.getId());
                        attendance.setId(c);
                        boolean b = attendanceService.updateClosedAttendance(attendance);
                        if (b) {
                            model.addAttribute("attendance2", "下班打打卡卡成功");
                            return "emp/homePage";
                        }
                    }
                    model.addAttribute("attendance2", "不是打卡时间");
                    return "emp/homePage";
                }
            }
        }
        model.addAttribute("attendance2","请先打上班卡班卡");
       return "emp/homePage";
    }
    @RequestMapping(value = "/checkAllAttendance.view")
    public String checkAllAttendanceView()
    {
        return "redirect:checkAllAttendance.do";
    }
    @RequestMapping(value = "/checkAllAttendance.do")
    public String checkAllAttendanceDo
            (@ModelAttribute Attendance attendance,
             HttpSession session, Model model){
        List<Attendance> attendances = attendanceService.checkAllAttendance();
        if(attendances.size()==0){
            model.addAttribute("attendance3","没有任何的考情记录");
            return "admin/homePage";
        }
        model.addAttribute("attendance3",attendances);
        return "attendance/checkAllAttendance";
    }
    @RequestMapping(value = "/checkSomeoneAttendance.view")
    public String checkSomeoneAttendanceView(){
        return "attendance/checkSomeoneAttendance";
    }
    @RequestMapping(value = "/checkSomeoneAttendance.do")
    public String checkSomeoneAttendanceDo
            (@ModelAttribute Attendance attendance,
             HttpSession session, Model model){
        List<Attendance> attendances = attendanceService.checkAttendance(attendance);
        if(attendances.size()==0){
            model.addAttribute("attendance4","这员工没有任何考情记录");
            return "admin/homePage";
        }
        model.addAttribute("attendance5",attendances);
        return "admin/homePage";
    }
    @RequestMapping(value = "/wageCalculation.view")
    public String  wageCalculationView(){
        return "attendance/lastMonth";
    }
    @RequestMapping(value ="/lastMonth.do")
    public String  lastMonthDo
            (@ModelAttribute Attendance attendance,
             HttpSession session, Model model){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM");
        String d=simpleDateFormat.format(new Date());
        int mouth =Integer.parseInt(d)-1;
        int count=0;
        List<Attendance> attendances =attendanceService.checkAttendance(attendance);
        if(attendances.size()==0){
            model.addAttribute("attendance6","这员工没有任何考情记录");
            return "admin/homePage";
        }
        session.setAttribute("attendance7",attendance);
        for(Attendance a:attendances){
            if(Integer.parseInt(simpleDateFormat.format(a.getClockInTime()))==mouth){
                ++count;
            }
        }
        if(count==0){
            model.addAttribute("attendance6","这员工上月没有任何考情记录");
            return "admin/homePage";
        }
        System.out.println(count);
        session.setAttribute("count1",count);
//        return "redirect:/attendanceQuestion/someoneQuestion.view";
        return "redirect:/emp/checkBaseSalary.do";
    }
}
