package com.javaee.zutuan.mapper;

import com.javaee.zutuan.pojo.Leader;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LeaderMapper {
    List<Leader> queryAllLeader();
    int addLeader(Leader leader);
    int deleteLeader();
}
