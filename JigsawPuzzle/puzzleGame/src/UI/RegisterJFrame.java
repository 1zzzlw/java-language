package UI;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterJFrame extends JFrame implements MouseListener {

    ArrayList<User> allUsers;
    //添加注册用户名文本框
    JTextField usernameText = new JTextField();

    //添加注册密码文本框
    JTextField onePasswordText = new JTextField();

    //添加再次输入密码文本框
    JTextField twoPasswordText = new JTextField();

    //加载注册按钮
    JButton register = new JButton();

    //加载重置按钮
    JButton reInupt = new JButton();

    public RegisterJFrame(ArrayList<User> allUsers) throws IOException {
        this.allUsers = allUsers;
        //初始化界面
        initJFrame();
        //添加图片
        InitImage();
        //使窗口显示
        this.setVisible(true);
    }

    public void InitImage() {
        //清空
        this.getContentPane().removeAll();

        //添加注册用户名文本框
        usernameText.setBounds(180, 130, 180, 20);
        this.getContentPane().add(usernameText);

        //添加注册密码文本框
        onePasswordText.setBounds(180, 180, 180, 20);
        this.getContentPane().add(onePasswordText);

        //添加再次输入密码文本框
        twoPasswordText.setBounds(180, 230, 180, 20);
        this.getContentPane().add(twoPasswordText);

        //加载注册用户名图像
        JLabel registerJLabel = new JLabel(new ImageIcon("puzzleGame\\image\\register\\注册用户名.png"));
        registerJLabel.setBounds(80, 130, 79, 17);
        this.getContentPane().add(registerJLabel);

        //加载注册密码图像
        JLabel passwordJLabel = new JLabel(new ImageIcon("puzzleGame\\image\\register\\注册密码.png"));
        passwordJLabel.setBounds(95, 180, 64, 16);
        this.getContentPane().add(passwordJLabel);

        //加载再次输入密码图像
        JLabel reInputPasswordJLabel = new JLabel(new ImageIcon("puzzleGame\\image\\register\\再次输入密码.png"));
        reInputPasswordJLabel.setBounds(65, 230, 96, 17);
        this.getContentPane().add(reInputPasswordJLabel);

        //加载注册按钮
        register.setBounds(120, 280, 128, 47);
        register.setIcon(new ImageIcon("puzzleGame\\image\\register\\注册按钮.png"));
        //去除注册按钮边框
        register.setBorderPainted(false);
        //去除按钮背景
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);
        //给注册按钮添加鼠标监听事件
        register.addMouseListener(this);

        //加载重置按钮
        reInupt.setBounds(260, 280, 128, 47);
        reInupt.setIcon(new ImageIcon("puzzleGame\\image\\register\\重置按钮.png"));
        //去除按钮边框
        reInupt.setBorderPainted(false);
        //去除按钮背景
        reInupt.setContentAreaFilled(false);
        this.getContentPane().add(reInupt);
        //给重置按钮添加鼠标监听事件
        reInupt.addMouseListener(this);

        //加载背景图片
        ImageIcon bg = new ImageIcon("puzzleGame\\image\\register\\background.png");
        JLabel bgJLabel = new JLabel(bg);
        bgJLabel.setBounds(0, 0, 470, 390);
        this.getContentPane().add(bgJLabel);

        //刷新
        this.getContentPane().repaint();
    }

    public void initJFrame() {
        this.setSize(485, 427);
        //设置窗口标题
        this.setTitle("拼图 注册");
        //设置窗口始终显示
        this.setAlwaysOnTop(true);
        //设置窗口居中
        this.setLocationRelativeTo(null);
        //设置程序关闭
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
    }

    //判断用户名是否符合规则
    //用户名规则：长度3~15，只能是数字加字母的组合，不能有其他符号
    public boolean checkUsername() {
        String username = usernameText.getText();
        //定义正则表达式规则
        String regex = "[a-zA-Z0-9]{4,16}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(username);
        return m.matches();
    }

    //判断再次输入密码是否和第一次输入密码相同
    public boolean checkTwoPassword() {
        String onePassword = onePasswordText.getText();
        String twoPassword = twoPasswordText.getText();
        return onePassword.equals(twoPassword);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("鼠标点击");
        Object s = e.getSource();
        if (s == register) {
            System.out.println("注册按钮点击");
            //判断用户名格式是否正确，还要判断密码不能为空
            boolean flagUsername = checkUsername();
            boolean flagPassword = checkTwoPassword();
            boolean containsName = containsName(usernameText.getText());
            boolean flagPasswordIsempty = onePasswordText.getText().isEmpty();

            //判断用户名不能为空
            if (usernameText.getText().isEmpty()) {
                showJDialog("用户名不能为空");
                return;
            }

            //判断密码不能为空
            if (flagPasswordIsempty) {
                showJDialog("密码不能为空");
                return;
            }

            //判断用户名是否存在
            if (containsName) {
                showJDialog("用户名存在");
                return;
            }

            //判断用户名格式
            if (!flagUsername) {
                //用户名格式错误
                showJDialog("用户名格式输入错误");
                return;
            }

            //判断确认密码是否正确
            if (!flagPassword) {
                //第二次密码输入错误
                showJDialog("确认密码输入错误");
            }

            //注册成功
            if (flagUsername && flagPassword && !flagPasswordIsempty) {
                //添加写入数据对象
                showJDialog("注册成功");
                //注册成功开始存储数据
                File file = new File("puzzleGame\\src\\账户密码存档.txt");
                //将注册的用户名和密码添加到集合中
                allUsers.add(new User(usernameText.getText(), onePasswordText.getText()));
                //将集合写入到文件中
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                    for (User str : allUsers) {
                        System.out.println(str);
                        bw.write(str.getUsername() + "&" + str.getPassword());
                        bw.newLine();
                    }
                    bw.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                //重新打开登录界面
                this.setVisible(false);
                try {
                    new LoginJFrame();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }

        } else if (s == reInupt) {
            System.out.println("重置按钮点击");
            //清空三个文本框
            usernameText.setText("");
            onePasswordText.setText("");
            twoPasswordText.setText("");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("鼠标按下");
        //获取触发鼠标按下事件的组件对象
        Object s = e.getSource();
        if (s == register) {
            System.out.println("按下注册按钮");
            //图片要改变成被按下的状态
            register.setIcon(new ImageIcon("puzzleGame\\image\\register\\注册按下.png"));
            //刷新
            register.repaint();
        } else if (s == reInupt) {
            System.out.println("按下重置按钮");
            //图片要改变成被按下的状态
            reInupt.setIcon(new ImageIcon("puzzleGame\\image\\register\\重置按下.png"));
            //刷新
            reInupt.repaint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("鼠标松开");
        //获取触发鼠标按下事件的组件对象
        Object s = e.getSource();
        if (s == register) {
            System.out.println("按下注册按钮");
            //图片要改变成被按下的状态
            register.setIcon(new ImageIcon("puzzleGame\\image\\register\\注册按钮.png"));
            //刷新
            register.repaint();
        } else if (s == reInupt) {
            System.out.println("按下重置按钮");
            //图片要改变成被按下的状态
            reInupt.setIcon(new ImageIcon("puzzleGame\\image\\register\\重置按钮.png"));
            //刷新
            reInupt.repaint();
        }
    }

    //鼠标划入
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标划入");
    }

    //鼠标划出
    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标划出");
    }

    //设置错误弹窗提醒
    public void showJDialog(String title) {
        //创建弹窗对象
        JDialog jDialog = new JDialog();
        //设置弹窗大小
        jDialog.setSize(200, 150);
        //使弹窗居中
        jDialog.setLocationRelativeTo(null);
        //使弹窗不会被覆盖
        jDialog.setAlwaysOnTop(true);
        //设置不关闭弹窗无法进行其他操作
        jDialog.setModal(true);

        //给弹窗添加文本
        JLabel jLabel = new JLabel(title);
        jLabel.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(jLabel);

        //使弹窗显示
        jDialog.setVisible(true);
    }

    //判断用户名唯一
    public boolean containsName(String name) {

        for (User nameStr : allUsers) {
            if (name.contains(nameStr.getUsername())) {
                return true;
            }
        }
        return false;
    }


}
