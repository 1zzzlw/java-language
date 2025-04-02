package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {

    JButton j1 = new JButton("1");
    JButton j2 = new JButton("2");

    public MyJFrame() {
        this.setSize(603, 800);
        this.setTitle("标题");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        j1.setBounds(0, 0, 100, 50);
        j2.setBounds(100, 0, 100, 50);

        j1.addActionListener(this);
        j2.addActionListener(this);

        this.getContentPane().add(j1);
        this.getContentPane().add(j2);

        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object s = e.getSource();
        if (s == j1) {
            j1.setSize(200, 200);
        } else if (s == j2) {
            Random r = new Random();
            j2.setLocation(r.nextInt(500), r.nextInt(500));
        }

    }
}
