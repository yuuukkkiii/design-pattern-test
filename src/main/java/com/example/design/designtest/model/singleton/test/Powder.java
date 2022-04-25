package com.example.design.designtest.model.singleton.test;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: zhaih
 * @Date: 2022/4/8
 * @Time: 16:11
 * @Description:
 */
//饿汉式单例测试
public class Powder extends JPanel {
    private static final Powder instance=new Powder();

    private Powder(){
        JLabel l1=new JLabel(new ImageIcon("src/main/resources/static/img/powder.jpg"));
        this.add(l1);
    }

    public static Powder getInstance(){
        return instance;
    }
}
