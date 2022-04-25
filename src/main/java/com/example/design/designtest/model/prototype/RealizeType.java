package com.example.design.designtest.model.prototype;

import com.example.design.designtest.common.User;
import com.example.design.designtest.common.UserCloneable;
import lombok.Data;

/**
 * @Author: zhaih
 * @Date: 2022/4/25
 * @Time: 17:25
 * @Description:
 */
@Data
public class RealizeType implements Cloneable{
    private User user;

    private UserCloneable userCloneable;

    public RealizeType() {
        user=new User();
        user.setAge(18);
        userCloneable=new UserCloneable();
        userCloneable.setName("1111");
        userCloneable.setAge(11);
        System.out.println("具体原型创建成功");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

//        在此要明白复制的意义，先拷贝父类，再把拷贝的子类放入，反过来就没什么意义。
        System.out.println("具体原型复制成功！");
        RealizeType cloneF=(RealizeType) super.clone();
        UserCloneable cloneC=(UserCloneable) this.userCloneable.clone();
        cloneF.setUserCloneable(cloneC);
        return cloneF;
    }

}
