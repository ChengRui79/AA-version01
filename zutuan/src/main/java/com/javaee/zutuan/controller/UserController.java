package com.javaee.zutuan.controller;

import com.javaee.zutuan.mapper.UserMapper;
import com.javaee.zutuan.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    UserMapper userMapper;
    @PostMapping("/registeUser") //注册添加用户信息
    public String registeUser(User user){
        userMapper.registeUser(user);
        return "login";
    }
}
