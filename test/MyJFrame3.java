package test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {

    JButton j = new JButton("1");

    public MyJFrame3() {

        this.setSize(603,800);
        this.setTitle("键盘监听");
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        j.setBounds(0,0,100,100);

        this.addKeyListener(this);

        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开");
        int code = e.getKeyCode();
        if (code == 65) {
            System.out.println("按的是A键");
        } else if (code == 66) {
            System.out.println("按的是B键");
        }
    }
}
