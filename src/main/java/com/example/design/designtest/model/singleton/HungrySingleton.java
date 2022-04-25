package com.example.design.designtest.model.singleton;

import com.example.design.designtest.model.singleton.test.Powder;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: zhaih
 * @Date: 2022/4/8
 * @Time: 15:53
 * @Description:
 */

//饿汉式单例
public class HungrySingleton {
//    在调用getInstance方法之前就已经实例化
    private static final HungrySingleton instance=new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        JFrame jf =new JFrame("饿汉单例模式测试");
        jf.setLayout(new GridLayout(1,2));
        Container container=jf.getContentPane();
        Powder powder1=Powder.getInstance();
        container.add(powder1);
        Powder powder2=Powder.getInstance();
        container.add(powder2);
        if(powder1==powder2){
            System.out.println("他们是一个人");
        }else{
            System.out.println("他们不是一个人");
        }
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
