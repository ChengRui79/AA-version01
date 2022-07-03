package com.javaee.zutuan.mapper;

import com.javaee.zutuan.pojo.Group;
import com.javaee.zutuan.pojo.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MemberMapper {
    void addMember(Member member);
    List<Member> queryAllMember();
//    Member queryMemById(int memid);
//    int updateMember(Member member);
//    int deleteMember( int memid);
}
