package com.iotek.controller;
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
        model.addAttribute("emp1","登陆成功");
        return "emp/index";
    }

}
