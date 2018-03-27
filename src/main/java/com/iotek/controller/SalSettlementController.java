package com.iotek.controller;

import com.iotek.dao.SalSettlementDao;
import com.iotek.po.Attendance;
import com.iotek.po.Emp;
import com.iotek.po.SalSettlement;
import com.iotek.service.SalSettlementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/3/26.
 */
@Controller
@RequestMapping(value = "/salSettlement")
public class SalSettlementController{
    @Autowired
    private SalSettlementService salSettlementService;
    @RequestMapping(value = "/salSettlement.do")
    public  String addSalSettlementDo
            (@ModelAttribute SalSettlement salSettlement,
             HttpSession session, Model model){
        Emp baseSalary = (Emp) session.getAttribute("baseSalary");
        salSettlement.setBasicSalary(baseSalary.getBaseSalary());
        salSettlement.setEmpId(baseSalary.getId());
        System.out.println(baseSalary.getId());
        int count1 = (int) session.getAttribute("count1");
        salSettlement.setWorkDay(count1);
        salSettlement.setTheoryOfWages(count1*baseSalary.getBaseSalary());
        salSettlement.setRealWages(count1*baseSalary.getBaseSalary()-salSettlement.getBonusPenaltyMoney());
        boolean b = salSettlementService.additionSalSettlement(salSettlement);
        if(b){
           model.addAttribute("salSettlement1","工资结算成功");
           return "admin/homePage";
        }
        model.addAttribute("salSettlement1","工资结算失败");
        return "admin/homePage";
    }
    @RequestMapping(value = "/salaryRelease.view")
    public  String salaryReleaseView(){
        return "redirect:salaryRelease.do";
    }
    @RequestMapping(value = "/salaryRelease.do")
    public  String salaryReleaseDo
            (@ModelAttribute SalSettlement salSettlement,
             HttpSession session, Model model){

        return "";
    }
}
