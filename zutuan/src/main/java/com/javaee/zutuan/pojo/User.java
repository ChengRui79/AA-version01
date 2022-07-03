package com.javaee.zutuan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String rename;
    private String repassword;
    private String username;
    private String password;
}
