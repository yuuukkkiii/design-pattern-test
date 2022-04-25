package com.example.design.designtest.common;

import lombok.Data;

/**
 * @Author: zhaih
 * @Date: 2022/4/25
 * @Time: 17:36
 * @Description:
 */
@Data
public class User {
    public String name;

    public Integer age;

    public User(){
        System.out.println("非基本类型：USER被创建");
    }
}
