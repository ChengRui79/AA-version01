package com.javaee.zutuan.mapper;

import com.javaee.zutuan.pojo.Group;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GroupMapper {
    List<Group> queryGroupsByLeader(String leader);
    List<Group> queryAllGroup();
    Group queryGroupById(int groupid);
    int addGroup(Group group);
    int updateGroup(Group group);
    int deleteGroup( int groupid);
    Group queryGroupNameById(int groupid);
}
