package com.example.design.designtest.model.singleton;

import com.example.design.designtest.model.singleton.test.President;

/**
 * @Author: zhaih
 * @Date: 2022/4/8
 * @Time: 15:41
 * @Description: 单例模式练习
 */

/*
* 单例模式有 3 个特点：
*1.单例类只有一个实例对象；
*2.该单例对象必须由单例类自行创建；
*3.单例类对外提供一个访问该单例的全局访问点。
* */

//    懒汉式单例
public class LazySingleton {
//    添加volatile保证实例在所有线程中同步
    private static volatile LazySingleton instance=null;

//    私有构造函数，防止在外部被实例化
    private LazySingleton(){

    }
//    获取实例
    public static synchronized LazySingleton getInstance(){/*线程同步*/
        if(instance==null){
            instance= new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
//        懒汉模式
        President zt1=President.getInstance();
        zt1.getName();
        President zt2=President.getInstance();
        zt2.getName();
        if(zt1==zt2){
            System.out.println("他们是一个人");/*输出这个表示两者是同一个对象*/
        }else{
            System.out.println("他们不是一个人");
        }
    }


}
