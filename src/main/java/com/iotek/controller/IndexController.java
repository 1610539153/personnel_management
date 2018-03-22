package com.iotek.controller;

import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by xiaohuang on 2018/3/9.
 * ----------------The heart withered--------
 */
@Controller
public class IndexController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value ="")
    public   String   indexPage(){
      /*  if (true){
            throw  new  NullPointerException();
        }*/
        return "customer/index";
    }
}
