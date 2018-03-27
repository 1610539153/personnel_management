package com.iotek.controller;


import com.iotek.po.Customer;
import com.iotek.po.Emp;
import com.iotek.po.TrainWordList;
import com.iotek.service.TrainWordListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/3/23.
 */
@Controller
@RequestMapping(value = "/trainWordList")

public class TrainWordListController {
    @Autowired
    private TrainWordListService trainWordListService;
    @RequestMapping(value = "/apply.view")
    public  String applyTrain
            (@ModelAttribute TrainWordList trainWordList,
             HttpSession session, Model model){
        Emp emp = (Emp) session.getAttribute("emp2");
        trainWordList.setEmpId(emp.getId());
        TrainWordList trainWordList2= trainWordListService.queryTrainWordListById(trainWordList);
        if(trainWordList2==null) {
            boolean b = trainWordListService.additionTrainWordList(trainWordList);
            if (b) {
                model.addAttribute("trainWordList1", "报名成功");
                return "emp/homePage";
            }
            model.addAttribute("trainWordList1", "报名失败");
            return "emp/homePage";
        }
        model.addAttribute("trainWordList1", "报名失败,你可能已经报名");
        return "emp/homePage";
    }
}
