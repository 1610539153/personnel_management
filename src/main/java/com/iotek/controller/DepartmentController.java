package com.iotek.controller;

import com.iotek.po.Department;
import com.iotek.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

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
    @RequestMapping(value ="/additionPostDepartment.do")
    public String additionPostDepartment
            (@ModelAttribute Department department,
             HttpSession session, Model model){
        Department department1=departmentService.queryDepartmentByName(department);
        session.setAttribute("department7",department1);
        return "post/postAddition";
    }
    @RequestMapping(value = "/checkDepartment.view")
    public String checkDepartmentView
            (@ModelAttribute Department department,
             HttpSession session, Model model){
        List<Department> departments = departmentService.checkDepartment();
        if(departments.size()==0){
            model.addAttribute("department8", "没有任何部门" );
            return "admin/homepage";
        }
        model.addAttribute("department4", departments );
        return "department/existingDepartment";
    }
     @RequestMapping(value = "/additionPost.View")
     public  String additionPostView
            (@ModelAttribute Department department,
             HttpSession session, Model model){
        List<Department> departments = departmentService.checkDepartment();
        if(departments.size()==0){
            model.addAttribute("department6","还没有部门请先添加部门" );
            return "admin/homepage";
        }
        model.addAttribute("department5",departments );
        return  "department/queryDepartment";
    }
    @RequestMapping(value = "/checkDepartmentUpdateEmp.view")
    public  String updateEmpView
            (@ModelAttribute Department department,
             HttpSession session, Model model){
        List<Department> departments = departmentService.checkDepartment();
        session.setAttribute("department10",departments);
        return  "redirect:/post/checkPostUpdateEmp.view";
    }
}
