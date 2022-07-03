package com.javaee.zutuan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    private int groupid;
    private String leader;
    private String groupname;
    private String grouplocation;
    private String events;

}
