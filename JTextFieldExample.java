package test;
import javax.swing.*;
import java.awt.*;

public class JTextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField示例");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // 创建JTextField组件，指定初始文本和列数
        JTextField textField = new JTextField("请输入内容", 20);

        // 将JTextField添加到窗口中
        frame.getContentPane().add(textField, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
