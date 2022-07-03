package com.javaee.zutuan.controller;

import com.javaee.zutuan.mapper.GroupMapper;
import com.javaee.zutuan.pojo.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class AddGrpController {
    @Autowired
    GroupMapper groupMapper;
    @RequestMapping("/addgrplist")
    public String list(Model model){
        Collection<Group> groups = groupMapper.queryAllGroup();
        model.addAttribute("grps",groups);
        return "grp/addgrplist";
    }
}
