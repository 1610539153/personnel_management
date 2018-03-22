package com.iotek.controller;

import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Created by xiaohuang on 2018/3/8.
 * ----------------The heart withered--------
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @RequestMapping(value = "/HomePage.view")
    public   String   regHomePage()
    {
        return "customer/index";
    }
    @RequestMapping(value = "/reg.view")
    public   String   regPage()
    {
        return "customer/register";
    }
    @RequestMapping(value = "/reg.do")
     public   String    customerRegister(
            @ModelAttribute Customer customer, HttpSession session){
        Customer customer1 = customerService.queryCustomerState(customer);
        if(customer1==null) {
            boolean addFlag = customerService.addCustomer(customer);
            if (addFlag) {
                session.setAttribute("customer", customer);
                return "customer/success";
            }
            return "customer/index";
        }
        return "customer/customerExist";
    }

    @RequestMapping(value = "/login.view")
    public   String  loginPage(){
        return "customer/login";
    }
    @RequestMapping(value = "/login.do")
    public   String  login
            (@ModelAttribute  Customer customer,
                           HttpSession  session, Model model,
                           @RequestParam(value = "isremember" ,
                                   required = false) String isremember,
                           HttpServletResponse response)
    {
        customer = customerService.queryCustomerByName(customer);
        session.setAttribute("customer",customer);//浏览器里面存入一个
        if (customer==null){
            return "customer/UserOrPasswordError";
        }
        return "resume/homePage";
    }
}
