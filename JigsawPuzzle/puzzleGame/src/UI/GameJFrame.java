package UI;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    //创建二维数组
    int[][] data = new int[4][4];

    //定义XY的坐标，确定空白图片的位置
    int x = 0;
    int y = 0;

    //定义路径名，方便修改
    String path = "puzzleGame\\image\\animal\\animal3\\";
    String pathAll = "puzzleGame\\image\\animal\\animal3\\all.jpg";

    //定义步数
    int step = 0;

    //创建选项对象的几个条目,由于动作监听要用到，所以可以在外面创建
    JMenu newimageItem = new JMenu("更换图片");
    JMenu saveGameData = new JMenu("存档");
    JMenu loadGameData = new JMenu("读档");

    JMenuItem replayItem = new JMenuItem("重新开始");
    JMenuItem reloginItem = new JMenuItem("重新登录");
    JMenuItem clearData = new JMenuItem("清理存档");
    JMenuItem closeItem = new JMenuItem("退出游戏");

    JMenuItem accountItem = new JMenuItem("公众号");

    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");

    JMenuItem save0 = new JMenuItem("存档0(空)");
    JMenuItem save1 = new JMenuItem("存档1(空)");
    JMenuItem save2 = new JMenuItem("存档2(空)");
    JMenuItem save3 = new JMenuItem("存档3(空)");
    JMenuItem save4 = new JMenuItem("存档4(空)");

    JMenuItem load0 = new JMenuItem("读档0(空)");
    JMenuItem load1 = new JMenuItem("读档1(空)");
    JMenuItem load2 = new JMenuItem("读档2(空)");
    JMenuItem load3 = new JMenuItem("读档3(空)");
    JMenuItem load4 = new JMenuItem("读档4(空)");

    public GameJFrame() {

        //初始化界面
        initJFrame();
        //初始化菜单
        initJMenuBar();
        //添加图片前打乱照片
        initData();
        //添加图片到界面
        initImage();


        //使界面可见，注意要放在最后面
        this.setVisible(true);
    }

    //打乱数据
    private void initData() {
        //创建一维数组用来存放照片序号
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        //先打乱一维数组
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        //将一维数组打乱好的数据存放到二维数组中
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = arr[i];
        }
    }

    //添加图片
    private void initImage() {
        //首先清除界面的图片
        this.getContentPane().removeAll();

        if (victory()) {
            //表示victory返回的是true表示胜利
            JLabel winImage = new JLabel(new ImageIcon("puzzleGame\\image\\win.png"));
            winImage.setBounds(200, 300, 197, 73);
            this.getContentPane().add(winImage);
        }

        //添加步数标题
        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(40, 30, 50, 50);
        this.getContentPane().add(stepCount);


        //设置拼图照片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = data[i][j];
                //创建ImageIcon对象，接受图片
                ImageIcon imagePuzzle = new ImageIcon(path + num + ".jpg");
                //创建JLabel对象容器（管理容器）
                JLabel imageLabel = new JLabel(imagePuzzle);
                //设置图片大小和位置
                imageLabel.setBounds(105 * j + 90, 105 * i + 190, 105, 105);
                //优化图片边框
                imageLabel.setBorder(new BevelBorder(0));
                //由于默认居中，需要在创建界面时取消居中
                this.getContentPane().add(imageLabel);
            }
        }
        //设置背景照片
        JLabel bgJLabel = new JLabel(new ImageIcon("puzzleGame\\image\\background.png"));
        bgJLabel.setBounds(46, 95, 508, 560);
        this.getContentPane().add(bgJLabel);

        //刷新界面中的图片
        this.getContentPane().repaint();
    }

    //初始化界面
    private void initJFrame() {
        //初始化界面
        this.setSize(600, 800);
        //设置界面标题
        this.setTitle("拼图游戏");
        //使界面始终显示
        this.setAlwaysOnTop(true);
        //使界面居中
        this.setLocationRelativeTo(null);
        //设置程序关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消居中，时图片按照XY的位置摆放
        this.setLayout(null);
        //给界面添加键盘接听事件
        this.addKeyListener(this);
    }

    //设置界面上方的菜单
    public void initJMenuBar() {
        //创建整个界面的对象
        JMenuBar menuBar = new JMenuBar();
        //创建菜单上的选项对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //将条目添加到选项对象中
        functionJMenu.add(newimageItem);
        functionJMenu.add(replayItem);
        functionJMenu.add(reloginItem);
        functionJMenu.add(saveGameData);
        functionJMenu.add(loadGameData);
        functionJMenu.add(clearData);
        functionJMenu.add(closeItem);
        aboutJMenu.add(accountItem);
        newimageItem.add(girl);
        newimageItem.add(animal);
        newimageItem.add(sport);
        saveGameData.add(save0);
        saveGameData.add(save1);
        saveGameData.add(save2);
        saveGameData.add(save3);
        saveGameData.add(save4);
        loadGameData.add(load0);
        loadGameData.add(load1);
        loadGameData.add(load2);
        loadGameData.add(load3);
        loadGameData.add(load4);

        //给条目添加动作接听事件
        newimageItem.addActionListener(this);
        replayItem.addActionListener(this);
        reloginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);
        save0.addActionListener(this);
        save1.addActionListener(this);
        save2.addActionListener(this);
        save3.addActionListener(this);
        save4.addActionListener(this);
        load0.addActionListener(this);
        load1.addActionListener(this);
        load2.addActionListener(this);
        load3.addActionListener(this);
        load4.addActionListener(this);
        clearData.addActionListener(this);

        //将选项对象添加到菜单中
        menuBar.add(functionJMenu);
        menuBar.add(aboutJMenu);

        getGameInfo();

        //将菜单添加到
        this.setJMenuBar(menuBar);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        //按A查看完整图片
        if (code == 65) {
            //清理图片
            this.getContentPane().removeAll();
            //添加完整图片
            JLabel alljLabel = new JLabel(new ImageIcon(pathAll));
            //设置大小和位置
            alljLabel.setBounds(90, 190, 420, 420);
            //将管理容器添加到界面中
            this.getContentPane().add(alljLabel);
            //添加背景图片
            JLabel bgJLabel = new JLabel(new ImageIcon("puzzleGame\\image\\background.png"));
            bgJLabel.setBounds(46, 95, 508, 560);
            this.getContentPane().add(bgJLabel);
            //刷新界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //如果胜利了就不能执行下面的运动的代码了
        if (victory()) {
            return;
        }
        int code = e.getKeyCode();
        System.out.println(code);
        if (code == 37) {
            if (y == 0) {
                return;
            }
            System.out.println("向左移动");
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            initImage();
        } else if (code == 38) {
            if (x == 0) {
                return;
            }
            System.out.println("向上移动");
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        } else if (code == 39) {
            if (y == 3) {
                return;
            }
            System.out.println("向右移动");
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            initImage();
        } else if (code == 40) {
            if (x == 3) {
                return;
            }
            System.out.println("向下移动");
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            initImage();
        } else if (code == 65) {
            //当松开A键时回到原来的拼图
            initImage();
        } else if (code == 87) {
            //设置一键通关
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }
    }

    //判断胜利条件
    public boolean victory() {
        int[][] win = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 0}
        };
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (win[i][j] != data[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random r = new Random();
        Object s = e.getSource();
        boolean[] bool = new boolean[14];
        if (s == girl) {
            System.out.println("美女");
            int index = r.nextInt(13) + 1;
            pathAll = "puzzleGame\\image\\girl\\girl" + index + "\\all.jpg";
            path = "puzzleGame\\image\\girl\\girl" + index + "\\";
            initData();
            initImage();
        } else if (s == animal) {
            System.out.println("动物");
            int index = r.nextInt(8) + 1;
            pathAll = "puzzleGame\\image\\animal\\animal" + index + "\\all.jpg";
            path = "puzzleGame\\image\\animal\\animal" + index + "\\";
            initData();
            initImage();
        } else if (s == sport) {
            System.out.println("运动");
            int index = r.nextInt(10) + 1;
            pathAll = "puzzleGame\\image\\sport\\sport" + index + "\\all.jpg";
            path = "puzzleGame\\image\\sport\\sport" + index + "\\";
            initData();
            initImage();
        } else if (s == replayItem) {
            System.out.println("重新开始");
            //初始步数为0
            step = 0;
            //重新打乱数据
            initData();
            //重新加载图片
            initImage();
        } else if (s == reloginItem) {
            System.out.println("重新登录");
            //隐藏游戏界面
            this.setVisible(false);
            //打开登录界面
            try {
                new LoginJFrame();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } else if (s == closeItem) {
            System.out.println("关闭游戏");
            System.exit(0);
        } else if (s == accountItem) {
            System.out.println("公众号");
            //创建弹窗对象
            JDialog jDialog = new JDialog();
            JLabel aboutjLabel = new JLabel(new ImageIcon("puzzleGame\\image\\about.png"));
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
        } else if (s == save0 || s == save1 || s == save2 || s == save3 || s == save4) {
            System.out.println("存档");
            JMenuItem item = (JMenuItem) s;
            String str = item.getText();
            //获得指定的索引，用来创建指定的存档文件
            int index = str.charAt(2) - '0';
            //利用序列化，将游戏数据对象存储到文件中
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("puzzleGame\\save\\save" + index + ".data"));
                GameInfo gi = new GameInfo(step, x, y, path, data);
                oos.writeObject(gi);
                oos.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            //修改一下存档上的展示信息为 存档(步数:xx)
            item.setText("存档" + index + "(步数:" + step + ")");
            //修改读档上的显示信息
            loadGameData.getItem(index).setText("存档" + index + "(步数:" + step + ")");
        } else if (s == load0 || s == load1 || s == load2 || s == load3 || s == load4) {
            System.out.println("读档");
            JMenuItem item = (JMenuItem) s;
            String str = item.getText();
            int index = str.charAt(2) - '0';
            System.out.println(str);
            System.out.println(index);
            GameInfo gi;
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("puzzleGame\\save\\save" + index + ".data"));
                gi = (GameInfo) ois.readObject();
                ois.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }

            data = gi.getData();
            path = gi.getPath();
            x = gi.getX();
            y = gi.getY();
            step = gi.getStep();

            //重新刷新图片
            initImage();
        } else if (s == clearData) {
            //清空存档
            File file = new File("puzzleGame\\save");
            File[] files = file.listFiles();
            if (files == null) {
                return;
            }
            for (File f : files) {
                f.delete();
                String str = f.toString();
                int index = str.charAt(20) - '0';
                saveGameData.getItem(index).setText("存档" + index + "(空)");
                loadGameData.getItem(index).setText("读档" + index + "(空)");
            }

        }

    }

    public void getGameInfo() {
        //进入文件
        File file = new File("puzzleGame\\save");
        //获得文件中的每个信息
        File[] files = file.listFiles();
        if (files == null) {
            return;
        }
        //遍历数组获得里面的信息
        try {
            for (File f : files) {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
                GameInfo gi = (GameInfo) ois.readObject();
                ois.close();
                String name = f.getName();
                System.out.println(name);
                int index = name.charAt(4) - '0';
                int step = gi.getStep();
                saveGameData.getItem(index).setText("存档" + index + "(步数:" + step + ")");
                loadGameData.getItem(index).setText("存档" + index + "(步数:" + step + ")");
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
