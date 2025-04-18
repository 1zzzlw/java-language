package com.others.ui;

import javax.swing.*;

//注册界面
public class RegisterJFrame extends JFrame {

    public RegisterJFrame() {
        this.setSize(488,500);
        //设置窗口标题
        this.setTitle("拼图 注册");
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
