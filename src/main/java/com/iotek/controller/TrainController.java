package com.iotek.controller;

import com.iotek.po.Admin;
import com.iotek.po.Train;
import com.iotek.service.TrainService;
import com.sun.javafx.sg.prism.NGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/3/23.
 */
@Controller
@RequestMapping(value = "/train")
public class TrainController{
    @Autowired
    private TrainService trainService;
    @RequestMapping(value = "/additionTrain.view")
    public   String   additionTrainView(){
        return  "train/trainHomePage";
    }
    @RequestMapping(value = "/additionTrain.do")
    public String additionTrainDo
            (@ModelAttribute Train train,
             HttpSession session,Model model){
        Admin admin2 = (Admin) session.getAttribute("adminId");
        train.setAdminId(admin2.getId());
        boolean b = trainService.addTrainDao(train);
        if(b){
            model.addAttribute("train1","培训内容发送成功");
          return "admin/homePage" ;
        }
        model.addAttribute("train1","培训内容发送失败");
        return "admin/homePage" ;
    }
    @RequestMapping(value = "/checkTrainContent.view")
    public String checkTrainContentView
            (@ModelAttribute Train train,
             HttpSession session,Model model){
        List<Train> trains = trainService.checkTrainContent();
        if(trains.size()==0){
            model.addAttribute("train3","暂时没有培训内容");
            return "emp/homePage";
        }
        model.addAttribute("train4",trains);
        return "train/checkTrain";
    }
    @RequestMapping(value = "/checkMyTrain.view")
    public  String checkMyTrainList
            (@ModelAttribute Train train,
             HttpSession session,Model model){
        Admin admin2 = (Admin) session.getAttribute("adminId");
        train.setAdminId(admin2.getId());
        List<Train> trains = trainService.checkMyTrain(train);
        if(trains.size()==0){
            model.addAttribute("train5","你没有发布内容");
            return  "admin/homePage";
        }
        model.addAttribute("train6",trains);
        return  "admin/homePage";
    }
    @RequestMapping(value = "/deleteMyTrain.view")
    public  String deleteMyTrainView(){
        return  "train/deleteMyTrainById";
    }
    @RequestMapping(value = "/deleteMyTrain.do")
    public  String deleteMyTrainDo
            (@ModelAttribute Train train,
             HttpSession session,Model model){
        Train trains = trainService.queryMyTrain(train);
        if(trains==null){
            model.addAttribute("train7","你没有发布这条培训消息");
            return  "admin/homePage";
        }
        boolean b = trainService.deleteMyTrain(train);
        if(b){
            model.addAttribute("train7","删除成功");
            return  "admin/homePage";
        }
        model.addAttribute("train7","删除失败");
        return "admin/homePage";
    }
    @RequestMapping(value = "/updateMyTrain.view")
    public String  updateMyTrainView(){
     return  "train/updateMyTrainById";
    }
    @RequestMapping(value = "/updateMyTrainById.do")
    public String updateMyTrainByIdDo
            (@ModelAttribute Train train,
             HttpSession session,Model model){
        Train trains = trainService.queryMyTrain(train);
        if(trains==null){
            model.addAttribute("train7","你没有发布这条培训消息");
            return  "admin/homePage";
        }
        train.setTrainModifiedTime(new Timestamp(new Date().getTime()));
        boolean b = trainService.updateMyTrain(train);
        if(b){
            model.addAttribute("train7","更新成功");
            return  "admin/homePage";
        }
        model.addAttribute("train7","更新失败");
        return  "admin/homePage";
    }
}
