package com.iotek.controller;

import com.iotek.po.Department;
import com.iotek.service.DepartmentService;
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
@RequestMapping(value = "/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @RequestMapping(value = "/additionDepartment.view")
    public String additionDepartment(){
        return  "department/departmentAddition";
    }
    @RequestMapping(value = "/additionDepartment.do")
    public String additionDepartmentDo
            (@ModelAttribute Department department,
             HttpSession session, Model model){
        Department department1 =departmentService.queryDepartmentByName(department);
        if(department1==null){
            boolean b = departmentService.addDepartment(department);
            if (b){
                model.addAttribute("department3", "部门添加成功");
                return "admin/homePage";
            }
        }
        model.addAttribute("department3","部门已存在");
        return "admin/homePage";
    }


    @RequestMapping(value = "/additionPostDepartment.do")
    public String additionPostDepartment
            (@ModelAttribute Department department,
             HttpSession session, Model model){
        department =departmentService.queryDepartmentByName(department);
        if(department==null){
            model.addAttribute("department2", "请确认部门是否存在");
            return "admin/homePage";
        }
        session.setAttribute("departmentId", department);

        model.addAttribute("department2", "部门存在");
        return "post/postAddition";
    }
}
