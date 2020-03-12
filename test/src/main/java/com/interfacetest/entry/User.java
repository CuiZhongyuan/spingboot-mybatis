package com.interfacetest.entry;

import lombok.Data;

@Data //引入lombok
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
}
