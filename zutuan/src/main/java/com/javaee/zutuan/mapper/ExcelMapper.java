package com.javaee.zutuan.mapper;

import com.javaee.zutuan.pojo.Cost;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface ExcelMapper {
    List<Cost> list();

}
