package com.example.design.designtest.common;

import com.example.design.designtest.model.prototype.RealizeType;
import lombok.Data;

/**
 * @Author: zhaih
 * @Date: 2022/4/25
 * @Time: 17:36
 * @Description:
 */
@Data
public class UserCloneable implements Cloneable{
    private String name;

    private Integer age;

    public UserCloneable(){
        System.out.println("非基本类型：UserCloneable被创建");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("UserCloneable复制成功！");
        return (UserCloneable) super.clone();
    }
}
