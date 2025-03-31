package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener, ActionListener {

    //创建账号集合，等以后学了IO在补注册
    static ArrayList<User> list = new ArrayList();

    //添加账号到集合中
    static {
        list.add(new User("zhangsan", "123456zhangsan"));
        list.add(new User("lisi", "123456lisi"));
    }

    //加载登录按钮图片
    JLabel login = new JLabel(new ImageIcon("puzzleGame\\image\\login\\登录按钮.png"));

    //加载注册按钮照片
    JLabel register = new JLabel(new ImageIcon("puzzleGame\\image\\login\\注册按钮.png"));

    //加载显示密码按钮
    JLabel passwordBound = new JLabel(new ImageIcon("puzzleGame\\image\\login\\显示密码.png"));

    //设置验证码
    String code = creatCode.getCode();
    JLabel codeShow = new JLabel();

    //设置验证码文本框
    JTextField codeUtilText = new JTextField();

    //设置密码文本框
    JPasswordField passwordText = new JPasswordField();

    //设置用户名文本框
    JTextField usernameText = new JTextField();

    //设置密码可见状态
    boolean passwordValid = false;

    JMenuItem jMenuItem = new JMenuItem("账号");

    public LoginJFrame() {
        //设置界面
        initJFrame();
        //加载图片
        initImage();
        //加载菜单
        initJMenu();

        this.setVisible(true);
    }

    private void initJMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu jMenu = new JMenu("账号");
        jMenu.add(jMenuItem);
        menuBar.add(jMenu);
        //添加动作事件
        jMenuItem.addActionListener(this);
        this.setJMenuBar(menuBar);
    }

    //加载图片
    private void initImage() {
        //清理一下界面图片
        this.getContentPane().removeAll();

        //显示验证码图片
        JLabel codeUtil = new JLabel(new ImageIcon("puzzleGame\\image\\login\\验证码.png"));
        codeUtil.setBounds(80, 230, 47, 17);
        this.getContentPane().add(codeUtil);

        //验证码
        codeShow.setText(code);
        codeShow.setBounds(250, 230, 47, 17);
        this.getContentPane().add(codeShow);

        //验证码文本框
        codeUtilText.setBounds(150, 230, 100, 20);
        this.getContentPane().add(codeUtilText);

        //加载密码图片
        JLabel password = new JLabel(new ImageIcon("puzzleGame\\image\\login\\密码.png"));
        password.setBounds(80, 180, 47, 17);
        this.getContentPane().add(password);

        //显示密码
        passwordBound.setBounds(350, 175, 18, 29);
        this.getContentPane().add(passwordBound);

        //密码文本框
        passwordText.setBounds(150, 180, 180, 20);
        this.getContentPane().add(passwordText);

        //加载用户名图片
        JLabel userName = new JLabel(new ImageIcon("puzzleGame\\image\\login\\用户名.png"));
        userName.setBounds(80, 130, 47, 17);
        this.getContentPane().add(userName);

        //用户名文本框
        usernameText.setBounds(150, 130, 180, 20);
        this.getContentPane().add(usernameText);

        //注册
        register.setBounds(260, 280, 128, 47);
        this.getContentPane().add(register);

        //登录
        login.setBounds(80, 280, 128, 47);
        this.getContentPane().add(login);

        //加载背景图片到容器里
        JLabel loginBg = new JLabel(new ImageIcon("puzzleGame\\image\\login\\background.png"));
        //设置图片大小和位置
        loginBg.setBounds(0, 0, 470, 390);
        this.getContentPane().add(loginBg);

        //添加鼠标监听事件
        login.addMouseListener(this);
        register.addMouseListener(this);
        passwordBound.addMouseListener(this);
        codeShow.addMouseListener(this);

        //刷新一下界面
        this.getContentPane().repaint();
    }

    //设置界面
    private void initJFrame() {
        this.setSize(484, 450);
        this.setAlwaysOnTop(true);
        this.setTitle("登录");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object s = e.getSource();
        if (s == login) {
            System.out.println("单击登录");

            //判断用户名，密码是否正确
            boolean flagName = checkNameCorrect(list);
            boolean flagPassword = checkPasswordCorrect(list);
            boolean flagCode = checkCodeCorrect();
            if (flagName && flagPassword && flagCode) {
                new GameJFrame();
                this.setVisible(false);
            }
            if (!flagName) {
                showJDialog("用户名错误");
                code = creatCode.getCode();
                codeShow.setText(code);
                codeShow.repaint();
            }
            if (!flagPassword) {
                showJDialog("密码错误");
                code = creatCode.getCode();
                codeShow.setText(code);
                codeShow.repaint();
            }
            if (!flagCode) {
                showJDialog("验证码错误");
                code = creatCode.getCode();
                codeShow.setText(code);
                codeShow.repaint();
            }

        } else if (s == register) {
            System.out.println("单击注册");
            new RegisterJFrame();
            this.setVisible(false);
        } else if (s == passwordBound) {
            System.out.println("单击显示密码按钮");
            if (passwordValid) {
                //首先将图标改成验证码原来的照片
                passwordBound.setIcon(new ImageIcon("puzzleGame\\image\\login\\显示密码.png"));
                passwordBound.repaint();
                //给密码加密，首先清除JTextField
                passwordText.setEchoChar('*');
                /*String passwordStr = getPassword(passwordArr);
                System.out.println(passwordStr);
                JPasswordField passwordNew = new JPasswordField(passwordText);
                passwordNew.setBounds(150, 180, 180, 20);
                getContentPane().add(passwordNew);
                //让文本窗口显示在最上层，不然会被盖住
                getContentPane().setComponentZOrder(passwordNew, 0);
                getContentPane().revalidate();
                getContentPane().repaint();*/
                passwordValid = false;
            } else {
                //首先将图标改成验证码被按下的照片
                passwordBound.setIcon(new ImageIcon("puzzleGame\\image\\login\\显示密码按下.png"));
                passwordBound.repaint();
                passwordText.setEchoChar((char) 0);
      /*          //将密码解密，首先清除JPasswordField
                getContentPane().remove(passwordText);
                //获得密码并变成字符串
                String passwordStr = getPassword(passwordArr);
                System.out.println(passwordStr);
                JTextField passwordNew = new JTextField(passwordStr);
                passwordNew.setBounds(150, 180, 180, 20);
                getContentPane().add(passwordNew);
                //让文本窗口显示在最上层，不然会被盖住
                getContentPane().setComponentZOrder(passwordNew, 0);
                getContentPane().revalidate();
                getContentPane().repaint();*/
                passwordValid = true;
            }

        } else if (s == codeShow) {
            System.out.println("单击验证码");
            code = creatCode.getCode();
            codeShow.setText(code);
            codeShow.repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object s = e.getSource();
        if (s == login) {
            System.out.println("按下登录");
            login.setIcon(new ImageIcon("puzzleGame\\image\\login\\登录按下.png"));
            login.repaint();
        } else if (s == register) {
            System.out.println("按下注册");
            register.setIcon(new ImageIcon("puzzleGame\\image\\login\\注册按下.png"));
            register.repaint();
        } else if (s == passwordBound) {
            System.out.println("按下显示密码");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object s = e.getSource();
        if (s == login) {
            System.out.println("松开登录");
            login.setIcon(new ImageIcon("puzzleGame\\image\\login\\登录按钮.png"));
            login.repaint();
        } else if (s == register) {
            System.out.println("松开注册");
            register.setIcon(new ImageIcon("puzzleGame\\image\\login\\注册按钮.png"));
            register.repaint();
        } else if (s == passwordBound) {
            System.out.println("松开显示密码");
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    //判断用户名输入是否正确
    public boolean checkNameCorrect(ArrayList<User> list) {
        String usernameInput = usernameText.getText();
        for (int i = 0; i < list.size(); i++) {
            if (usernameInput.equals(list.get(i).getUsername())) {
                return true;
            }
        }
        return false;
    }

    //判断密码输入是否正确
    public boolean checkPasswordCorrect(ArrayList<User> list) {
        String passwordInput = passwordText.getText();
        for (int i = 0; i < list.size(); i++) {
            if (passwordInput.equals(list.get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }

    //判断验证码输入是否正确
    public boolean checkCodeCorrect() {
        String codeInput = codeUtilText.getText();
            if (codeInput.equals(code)) {
                return true;
            } else {
                return false;
            }
    }

    //设置错误弹窗提醒
    public void showJDialog(String title) {
        //创建弹窗对象
        JDialog jd = new JDialog();
        //设置弹窗大小
        jd.setSize(200, 150);
        //弹窗始终显示
        jd.setAlwaysOnTop(true);
        //弹窗不关闭无法进行其他操作
        jd.setModal(true);
        //弹窗默认居中
        jd.setLocationRelativeTo(null);

        //创建文本对象
        JLabel errText = new JLabel(title);
        //设置文本位置大小
        errText.setBounds(0, 0, 200, 150);
        jd.getContentPane().add(errText);

        //弹窗显示
        jd.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object s = e.getSource();
        if (s == jMenuItem) {
            //创建弹窗对象
            JDialog jDialog = new JDialog();
            JLabel aboutjLabel = new JLabel(new ImageIcon("puzzleGame\\image\\account.png"));
            //设置照片在弹框中的位置和大小
            aboutjLabel.setBounds(0, 0, 258, 258);
            //将图片添加到弹窗中
            jDialog.getContentPane().add(aboutjLabel);
            //给弹窗设置大小
            jDialog.setSize(344, 344);
            //使弹窗默认居中
            jDialog.setLocationRelativeTo(null);
            //使弹窗始终可见不会被其他应用覆盖
            jDialog.setAlwaysOnTop(true);
            //设置不关闭弹窗无法进行其他操作
            jDialog.setModal(true);
            //使弹窗可见
            jDialog.setVisible(true);
        }
    }
}
