package com.iotek.controller;
import com.iotek.po.Attendance;
import com.iotek.po.Emp;
import com.iotek.service.EmpService;
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
 * Created by Administrator on 2018/3/21.
 */
@Controller
@RequestMapping(value = "/emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping(value = "/reg.view")
    public   String   regPage()
    {
        return "emp/register";
    }
    @RequestMapping(value = "/login.view")
    public   String  loginPage(){
        return "emp/login";
    }

    @RequestMapping(value ="/reg.do")
    public   String    empRegister
            (@ModelAttribute Emp emp,
             HttpSession session, Model model,
             @RequestParam(value = "isremember" , required = false) String isremember,
             HttpServletResponse response){
        Emp emp1 = empService.findEmp(emp);
        if(emp1==null){
            boolean b = empService.addEmp(emp);
            if (b) {
                model.addAttribute("emp1", "注册成功");
                return "emp/login";
            }
        }
        model.addAttribute("emp1","注册失败,用户可能已经存在");
        return "emp/index";
    }

    @RequestMapping(value = "/login.do")
    public   String  login
            (@ModelAttribute Emp emp,
             HttpSession  session, Model model,
             @RequestParam(value = "isremember" , required = false) String isremember,
             HttpServletResponse response){
          emp=empService.findEmpByName(emp);
        if(emp==null){
            model.addAttribute("emp1","登陆失败");
            return "emp/index";
        }
        session.setAttribute("emp2",emp);
        model.addAttribute("emp1","登陆成功");
        return "emp/homePage";
    }
    @RequestMapping(value = "/checkEmp.view")
    public String checkEmpView
            (@ModelAttribute Emp emp,
             HttpSession  session, Model model){
        List<Emp> emps = empService.checkEmp();
        if(emps.size()==0){
            model.addAttribute("emp3","没有任何员工");
            return "admin/homePage";
        }
        model.addAttribute("emp4",emps);
        return "admin/homePage";
    }
    @RequestMapping(value = "/updateEmp.view")
    public  String updateEmpView(){
        return "emp/updateOneEmp";
    }
    @RequestMapping(value = "/updateEmp.do")
    public  String updateEmpDo
            (@ModelAttribute Emp emp,
             HttpSession  session, Model model){
        List<Emp>emps=empService.checkEmp();
        for(Emp em:emps){
            if(emp.getId()==em.getId()){
                emp.setEntryTime(new Timestamp(new Date().getTime()));
                emp.setEmpModifiedTime(new Timestamp(new Date().getTime()));
                boolean b = empService.updateEmp(emp);
                if(b){
                    model.addAttribute("emp5","修改成功");
                    return "admin/homePage";
                }
            }
        }
        model.addAttribute("emp5","没有这个员工");
        return "admin/homePage";
    }
    @RequestMapping(value = "/frostEmp.view")
    public  String frostEmpView(){
        return "emp/frostEmp";
    }
    @RequestMapping(value = "/frostEmp.do")
    public  String frostEmpDo
            (@ModelAttribute Emp emp,
             HttpSession  session, Model model) {
        List<Emp> emps = empService.checkEmp();
        for (Emp em : emps){
            if (emp.getId() == em.getId()){
                emp.setEmpModifiedTime(new Timestamp(new Date().getTime()));
                boolean b = empService.frostEmp(emp);
                if (b) {
                    model.addAttribute("emp6", "冻结成功");
                    return "admin/homePage";
                }
            }
        }
        model.addAttribute("emp6", "没有这个员工");
        return "admin/homePage";
    }
    @RequestMapping(value = "/PostEmp.do")
    public  String  PostEmpDo
            (@ModelAttribute Emp emp,
             HttpSession  session, Model model){
        List<Emp> emps = empService.checkEmpByPostName(emp);
        if(emps.size()==0){
            model.addAttribute("emp7","该职位下没有员工");
            return "admin/homePage";
        }
        model.addAttribute("emp8",emps);
        return "emp/postEmp";
    }
    @RequestMapping(value = "/checkBaseSalary.do")
    public  String  checkBaseSalaryDo
            (@ModelAttribute Emp emp,
             HttpSession  session, Model model){
        Attendance attendance7 = (Attendance) session.getAttribute("attendance7");
        emp.setId(attendance7.getEmpId());
        Emp emp1 = empService.checkEmpById(emp);
        if(emp==null){
            return "admin/homePage";
        }
        session.setAttribute("baseSalary",emp1);
        return "redirect:/attendanceQuestion/someoneQuestion.view";
    }
}
