package com.javaee.zutuan.controller;

//import com.javaee.zutuan.dao.GroupDao;
//import com.javaee.zutuan.dao.MembersDao;
import com.javaee.zutuan.mapper.GroupMapper;
import com.javaee.zutuan.mapper.LeaderMapper;
import com.javaee.zutuan.mapper.MemberMapper;
import com.javaee.zutuan.pojo.Group;
import com.javaee.zutuan.pojo.Leader;
import com.javaee.zutuan.pojo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;

@Controller
public class MemberController {
    String user="user";
    @Autowired
    MemberMapper memberMapper;
    Member member=new Member();
    @Autowired
    GroupMapper groupMapper;
    @Autowired
    LeaderMapper leaderMapper;

    @RequestMapping("/addmem/{id}")
    public void list2(@PathVariable("id")int id, Model model,
                      HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        PrintWriter out1=response.getWriter();

        List<Group> groups = groupMapper.queryAllGroup();
        List<Leader> leaderList=leaderMapper.queryAllLeader();
        for(Leader leader:leaderList){
            user=leader.getLeadername();
        }
        for(Group group:groups){
            if(group.getGroupid()==id){
                member.setMemid(id);
                member.setGrpname(group.getGroupname());
                member.setMemname(user);
                memberMapper.addMember(member);
            }
        }
        out.print("<Script>alert('加入成功');window.location.href='/addgrplist';</Script>");
        out.close();
        out.flush();

    }


    @RequestMapping("/mems")
    public String list(Model model){
        Collection<Member>members = memberMapper.queryAllMember();
        model.addAttribute("mems",members);
        return "mem/allmembers";
    }

//    @GetMapping("/mem")
//    public String toAddpage(Model model){
//        Collection<Member>members = memberMapper.queryAllMember();
//        model.addAttribute("mems",members);
//        return "mem/addmem";
//    }
//    @PostMapping("/mem")
//    public String addMember(Member member){
//        memberMapper.addMember(member);        //增加成员到团
//        return "redirect:/mems";
//    }

}