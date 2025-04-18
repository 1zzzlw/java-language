package com.others.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

//GameJFrame表示游戏的主界面
public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //JFrame里面有界面，窗体，则子类也表示界面和窗体

    int[][] date = new int[4][4];

    //记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;

    //定义一个变量，用于记录当前展示图片的路径
    String path = "jigsawgame\\image\\animal\\animal3\\";

    //定义获胜的数组
    int[][] win = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //定义变量来统计步数
    int step = 0;

    //创建选项对象下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reloginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");

    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据（打乱）
        initDate();

        //初始化图片（根据打乱之后的结果来加载图片）
        initImage();

        //让窗口显示出来，写在最后
        this.setVisible(true);
    }

    private void initDate() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        //打乱一维数组里面的数据
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        //将打乱的数据存放到二维数组里面
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            date[i / 4][i % 4] = arr[i];
        }
    }

    private void initImage() {
        //清空原本已经出现的所以图片
        this.getContentPane().removeAll();

        //先判断是否胜利，如果胜利了则打印胜利
        if (victory()) {
            ImageIcon imageWin = new ImageIcon("jigsawgame\\image\\win.png");
            JLabel Win = new JLabel(imageWin);
            Win.setBounds(203, 283, 197, 73);
            this.getContentPane().add(Win);
        }

        //在界面添加 步数
        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);

        //在界面添加照片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //获取当前要加载图片的序号
                int num = date[i][j];
                //创建一个图片ImageIcon的对象,图片默认在正中间
                ImageIcon icon = new ImageIcon(path + num + ".jpg");
                //创建一个JLable的对象（管理容器）
                JLabel jLabel = new JLabel(icon);
                //指定图片的位置，一定要在图片添加到容器之前指定文件位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                //0:表示让图片凸起来
                //1:表示让图片凹下去
                jLabel.setBorder(new BevelBorder(0));
                //把管理容器添加到对象中,由于ContentPane已经在JFrame中创建了对象，所以在这里可以直接调用
                //this.add(jLabel);
                this.getContentPane().add(jLabel);
            }
        }

        //添加背景图片
        ImageIcon background = new ImageIcon("jigsawgame\\image\\background.png");
        JLabel jLbel = new JLabel(background);
        jLbel.setBounds(40, 40, 508, 560);
        this.getContentPane().add(jLbel);

        //刷新一下界面
        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        //创建整个菜单的对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //将选项对象下面的条目对象添加到对应的选项对象里面
        functionJMenu.add(replayItem);
        functionJMenu.add(reloginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //给条目对象绑定动作事件
        replayItem.addActionListener(this);
        reloginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);


        //将选项对象添加到整个菜单里面
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //最后给界面设置已经创建好的菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(603, 680);
        //设置界面标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶(点击其他界面时窗口不会隐藏，不会被其他窗口给盖住)
        this.setAlwaysOnTop(true);
        //设置界面居中，界面默认是在左上角的 Location relative 意思是位置相对
        this.setLocationRelativeTo(null);
        //设置游戏关闭模式，因为关闭窗口IDEA运行不会结束 default adj. 默认的
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置方式，只有取消了才会按照xy轴的形式添加组件
        this.setLayout(null);
        //给整个界面添加键盘接听事件
        this.addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            //清理界面中的所有图片
            this.getContentPane().removeAll();
            //加载完整的图片
            ImageIcon imagAll = new ImageIcon(path + "all.jpg");
            JLabel all = new JLabel(imagAll);
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            //加载背景图片
            ImageIcon background = new ImageIcon("jigsawgame\\image\\background.png");
            JLabel jLbel = new JLabel(background);
            jLbel.setBounds(40, 40, 508, 560);
            this.getContentPane().add(jLbel);
            //刷新界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利，如果胜利则此方法需要直接结束，不能继续执行下面的代码了
        if (victory()) {
            //结束方法
            return;
        }

        //对上下左右进行判断
        int code = e.getKeyCode();
        if (code == 37) {
            System.out.println("向左移动");
            if (y == 3) {
                return;
            }
            date[x][y] = date[x][y + 1];
            date[x][y + 1] = 0;
            y++;
            //每走一下步数加一
            step++;
            initImage();
        } else if (code == 38) {
            System.out.println("向上移动");
            if (x == 3) {
                return;
            }
            date[x][y] = date[x + 1][y];
            date[x + 1][y] = 0;
            x++;
            //每走一下步数加一
            step++;
            initImage();
        } else if (code == 39) {
            System.out.println("向右移动");
            if (y == 0) {
                return;
            }
            date[x][y] = date[x][y - 1];
            date[x][y - 1] = 0;
            y--;
            //每走一下步数加一
            step++;
            initImage();
        } else if (code == 40) {
            System.out.println("向下移动");
            if (x == 0) {
                return;
            }
            date[x][y] = date[x - 1][y];
            date[x - 1][y] = 0;
            x--;
            //每走一下步数加一
            step++;
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            date = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }

    }

    //判断是否胜利
    public boolean victory() {

        for (int i = 0; i < date.length; i++) {
            for (int j = 0; j < date[i].length; j++) {
                if (date[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == replayItem) {
            System.out.println("重新开始游戏");
            //初始化步数
            step = 0;
            //重新打乱数据
            initDate();
            //重新打开一个界面
            initImage();
        } else if (source == reloginItem) {
            System.out.println("重新登录");
            //隐藏游戏界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();
        } else if (source == closeItem) {
            System.out.println("关闭游戏");
            System.exit(0);
        } else if (source == accountItem) {
            System.out.println("关于我们");
            //创建一个弹窗对象
            JDialog jDialog = new JDialog();
            ImageIcon imagAbout = new ImageIcon("jigsawgame\\image\\about.png");
            JLabel jLabel = new JLabel(imagAbout);
            //设置图片在弹出中的位置
            jLabel.setBounds(0,0 ,258 ,258 );
            //将图片添加到弹窗中
            jDialog.getContentPane().add(jLabel);
            //设置弹窗的大小
            jDialog.setSize(344,344);
            //设置弹窗始终居中
            jDialog.setLocationRelativeTo(null);
            //设置弹窗始终显示
            jDialog.setAlwaysOnTop(true);
            //设置弹窗不关闭无法进行其他操作
            jDialog.setModal(true);
            //让弹窗显示出来
            jDialog.setVisible(true);
        }
    }

}
