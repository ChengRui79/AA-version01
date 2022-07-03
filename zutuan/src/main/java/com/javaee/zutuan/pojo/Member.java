package com.javaee.zutuan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//团员表
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private Integer memid;
    private String memname;
//    private String gender;
    private String grpname;
}


