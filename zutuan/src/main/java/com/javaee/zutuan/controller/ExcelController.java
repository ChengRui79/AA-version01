package com.javaee.zutuan.controller;

import com.javaee.zutuan.mapper.ExcelMapper;
import com.javaee.zutuan.pojo.Cost;
import com.javaee.zutuan.util.WebExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class ExcelController {
    @Autowired
    ExcelMapper excelMapper;

    @RequestMapping("/costlist/export")
    public void export(HttpServletResponse response) {
        List<Cost> list = excelMapper.list();
        WebExcelUtil.exportExcel(list, "活动账单", "sheet1", Cost.class, "活动账单.xls", response);
    }


}
