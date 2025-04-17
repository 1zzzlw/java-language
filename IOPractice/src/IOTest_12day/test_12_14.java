package IOTest_12day;

/*实现一个验证程序运行次数的小程序，要求如下:
1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用~
2.程序运行演示如下:
第一次运行控制台输出:欢迎使用本软件，第1次使用免费~
第二次运行控制台输出:欢迎使用本软件,第2次使用免费~
第三次运行控制台输出:欢迎使用本软件,第3次使用免费~
第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~*/

import java.io.*;

public class test_12_14 {
    public static void main(String[] args) throws IOException {
        //创建缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("IOPractice\\count.txt"));
        //获得数字
        String line = br.readLine();
        br.close();
        int n = Integer.parseInt(line);
        n++;
        if (n > 3) {
            System.out.println("本软件只能免费使用3次,欢迎您注册会员后继续使用~");
        } else {
            System.out.println("欢迎使用本软件,第" + n + "次使用免费~");
        }
        //创建缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("IOPractice\\count.txt"));
        bw.write(n + "");
        bw.close();
    }
}
