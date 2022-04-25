package com.example.design.designtest.model.prototype.test;

import com.example.design.designtest.model.prototype.RealizeType;

/**
 * @Author: zhaih
 * @Date: 2022/4/25
 * @Time: 17:28
 * @Description:
 */
public class ProtoType {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType1=new RealizeType();
        RealizeType realizeType2=(RealizeType) realizeType1.clone();
        System.out.println("obj1==obj2?"+(realizeType1==realizeType2));
        System.out.println("obj1内的引用 user==obj2内的引用：user?"+(realizeType1.getUser()==realizeType2.getUser()));

        System.out.println("硬拷贝：obj1内的引用 user==obj2内的引用：user?"+(realizeType1.getUserCloneable()
                    ==realizeType2.getUserCloneable()));
    }
}
