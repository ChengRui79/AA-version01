package com.javaee.zutuan.controller;

import com.javaee.zutuan.mapper.GroupMapper;
import com.javaee.zutuan.mapper.LeaderMapper;
import com.javaee.zutuan.mapper.MemberMapper;
import com.javaee.zutuan.pojo.Group;
import com.javaee.zutuan.pojo.Leader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.List;

@Controller
public class GroupController {
    private static int id=1007;
    @Autowired
    GroupMapper groupMapper;
    Group group=new Group();
    @Autowired
    LeaderMapper leaderMapper;

    @RequestMapping("/grps")
    public String list(Model model){
        Collection<Group>groups = groupMapper.queryAllGroup();
        model.addAttribute("grps",groups);
        return "grp/list";
    }

    @RequestMapping("/events")
    public String list3(Model model){
        Collection<Group>groups = groupMapper.queryAllGroup();
        model.addAttribute("events",groups);
        return "grp/eventslist";
    }

    @RequestMapping("/orgs")
    public String list2(Model model){
        String x = "x";
        List<Leader> leaderList = leaderMapper.queryAllLeader();
        for(Leader leader:leaderList){
            x=leader.getLeadername();
        }
        Collection<Group>groups = groupMapper.queryGroupsByLeader(x);
        model.addAttribute("orgs",groups);
        return "grp/organize";
    }

    @GetMapping("/grp")
    public String toAddpage(Model model){
        Collection<Group>groups = groupMapper.queryAllGroup();
        model.addAttribute("grps",groups);
        return "grp/add";
    }

    @PostMapping("/grp")


    public String addGrp(@RequestParam("leader")String leader,
                         @RequestParam("groupname")String groupname,
                         @RequestParam("grouplocation")String grouplocation,
                         @RequestParam("events")String events,Model model){

        group.setEvents(events);
        group.setGroupid(id);
        group.setGrouplocation(grouplocation);
        group.setGroupname(groupname);
        group.setLeader(leader);
        groupMapper.addGroup(group);                //增加信息到数据库
        return "redirect:/grps";
    }

//    @RequestMapping("/")
//    public String addtuan(@PathVariable("groupid")Integer groupid,Model model){
//        Group group =groupMapper.queryGroupNameById(groupid);
//        model.addAttribute("",group);
//
//    }




    @GetMapping("/grp/{groupid}")
    public String toUpdateGroup(@PathVariable("groupid")Integer groupid,Model model){
        //查出原来的数据
        Group group = groupMapper.queryGroupById(groupid);
        model.addAttribute("grp",group);

        return "grp/update";
    }
    @PostMapping("/updateGrp")
    public String updateGrp(Group group){
        groupMapper.updateGroup(group);
        return "redirect:/orgs";
    }

    //删除
    @GetMapping("/delgrp/{groupid}")
    public String deleteGrp(@PathVariable("groupid")int groupid){
        groupMapper.deleteGroup(groupid);
        return "redirect:/orgs";
    }
}

