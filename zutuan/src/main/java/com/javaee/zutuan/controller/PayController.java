package com.javaee.zutuan.controller;

import com.javaee.zutuan.mapper.CostMapper;
import com.javaee.zutuan.pojo.Cost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class PayController {
    @Autowired
    CostMapper costMapper;
    @RequestMapping("/pay")
    public String zf(){
        return "Pay/pay";
    }

    @RequestMapping("/paylist")
    public String paylist(Model model){
        Collection<Cost> costs = costMapper.queryAllCost();
        model.addAttribute("pay",costs);
        return "Pay/paylist";
    }

    @PostMapping("/pay")
    public String addcost(Cost cost){
        costMapper.addCost(cost);
        return "redirect:/paylist";
    }
}
