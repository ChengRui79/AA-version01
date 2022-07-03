package com.javaee.zutuan.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cost {
    @Excel(name = "用户名", width = 25,orderNum = "0")
    private String uname;
    @Excel(name = "团队名", width = 25,orderNum = "0")
    private String grpname;
    @Excel(name = "缴费金额", width = 25,orderNum = "0")
    private double amount;
}
