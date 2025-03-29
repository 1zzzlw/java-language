package test;
//事件练习

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        //设置界面大小
        jFrame.setSize(603,800);
        //设置界面标题
        jFrame.setTitle("事件练习");
        //设置界面始终出现
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置界面关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消组件默认居中模式
        jFrame.setLayout(null);

        //创建一个按钮
        JButton jtb = new JButton("点我");
        //设置按钮的位置宽高
        jtb.setBounds(0,0,100,50);
        //给按钮添加动作监听
        //jtb：组件对象，表示你要给哪个组件添加监听事件
        //ActionListener 动作监听：鼠标点击，键盘空格
        //jtb.addActionListener(new MyActionListener());
        //匿名内部类的写法
        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被点击了");
            }
        });

        jFrame.getContentPane().add(jtb);

        //显示界面窗口
        jFrame.setVisible(true);
    }

}

/*
class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("按钮被点击了");
    }
}*/
