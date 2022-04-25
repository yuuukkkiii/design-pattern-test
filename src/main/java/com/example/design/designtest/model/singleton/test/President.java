package com.example.design.designtest.model.singleton.test;

/**
 * @Author: zhaih
 * @Date: 2022/4/8
 * @Time: 16:00
 * @Description:
 */
//    懒汉模式实际练习
public class President {

    private static volatile President instance=null;

    private President(){
        System.out.println("产生了一位总统");
    }

    public static synchronized President getInstance(){
        if(instance==null){
            instance=new President();
        }else{
            System.out.println("已经有了一个总统，不能再产生一个总统");
        }
        return instance;
    }
    public void getName(){
        System.out.println("我是总统，总统a");
    }
}
