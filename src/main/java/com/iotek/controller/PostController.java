package com.iotek.controller;

import com.iotek.po.Admin;
import com.iotek.po.Department;
import com.iotek.po.Post;
import com.iotek.service.PostService;
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
@RequestMapping(value = "/post")
public class PostController{
    @Autowired
    private PostService postService;
    @RequestMapping(value = "/additionPost.View")
    public  String additionPostView(){
        return  "department/queryDepartment";
    }
    @RequestMapping(value = "/additionPost.do")
    public  String additionPostDo
            (@ModelAttribute Post post,
             HttpSession session, Model model){
        Post post1 = postService.checkPost(post);
        if(post1==null){
            Department departmentId = (Department) session.getAttribute("departmentId");
            post.setDepartmentId(departmentId.getId());
            Admin adminId = (Admin) session.getAttribute("adminId");
            post.setAdminId(adminId.getId());
            boolean b = postService.addPost(post);
            if (b) {
                model.addAttribute("post1", "职位添加成功");
                return "admin/homePage";
            }
        }
        model.addAttribute("post1","职位添加失败,可能已经存在");
        return "admin/homePage";
    }
}
