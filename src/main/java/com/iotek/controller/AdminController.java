package com.iotek.controller;

import com.iotek.po.Admin;
import com.iotek.po.Department;
import com.iotek.service.AdminService;
import com.iotek.service.DepartmentService;
import com.iotek.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/3/20.
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping(value = "/adminLogin.view")
    public   String   regPage()
    {
        return "admin/login";
    }
    @RequestMapping(value = "/login.do")
    public   String    adminLogin
            (@ModelAttribute Admin admin,
             HttpSession session, Model model){
        Admin admin1 = adminService.findAdminByName(admin);
       if(admin1==null){
           model.addAttribute("admin1","账号或密码有错误");
           session.setAttribute("admin2", admin);
           return "admin/login";
       }
        session.setAttribute("adminId",admin1);
        model.addAttribute("admin1","欢迎管理员");
        return "admin/homePage";
     }

}
