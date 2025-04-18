package com.others.ui;

import javax.swing.*;

//表示登录界面
public class LoginJFrame extends JFrame {

    //构造方法
    public LoginJFrame() {
        this.setSize(488,430);
        //设置窗口标题
        this.setTitle("拼图 登录");
        //设置窗口始终显示
        this.setAlwaysOnTop(true);
        //设置窗口居中
        this.setLocationRelativeTo(null);
        //设置程序关闭
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //使窗口显示
        this.setVisible(true);
    }
}
