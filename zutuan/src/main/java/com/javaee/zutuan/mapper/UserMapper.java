package com.javaee.zutuan.mapper;

import com.javaee.zutuan.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> queryAllUser();

    int registeUser(User user);//注册添加用户
}
