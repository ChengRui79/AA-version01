package com.javaee.zutuan.controller;

import com.javaee.zutuan.mapper.LeaderMapper;
import com.javaee.zutuan.mapper.UserMapper;
import com.javaee.zutuan.pojo.Leader;
import com.javaee.zutuan.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

public class LoginController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    LeaderMapper leaderMapper;
    private Leader leader = new Leader();

    @RequestMapping("/user/login")
    public String login(@RequestParam("username")String username,
                        @RequestParam("password") String password,
                        Model model){
        //具体的业务：
        leaderMapper.deleteLeader();
        leader.setLeadername(username);
        leaderMapper.addLeader(leader);

        String flag="false";
        List<User> userList = userMapper.queryAllUser();
        for(User user:userList){
            if(user.getUsername().equals(username)&&user.getPassword().equals(password)){
                flag="success";
            }
        }
        if(flag.equals("success")) {
            return "welcome";
        }else {
            model.addAttribute("msg1","用户名或密码错误或");
            model.addAttribute("msg2","用户不存在请先注册");

            return "login";
        }
    }
}
