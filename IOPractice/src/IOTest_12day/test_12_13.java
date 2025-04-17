package IOTest_12day;

/*
字符缓冲输入流:
构造方法:
public BufferedReader(Reader r)
特有方法:
public string readLine()读一整行
*/

import java.io.*;

/*字符缓冲输出流构造方法:
public BufferedWriter(Writer r)
特有方法:
public void newLine()
跨平台的换行*/

public class test_12_13 {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流的对象
        BufferedReader br = new BufferedReader(new FileReader("IOPractice\\c.txt"));
        //读取数据
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        //释放资源
        br.close();
        //创建字符缓冲输入流的对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("IOPractice\\h.txt"));
        //写入数据
        bw.write("2025年4月12日");
        bw.newLine();
        bw.write("大一");
        bw.newLine();
        //释放资源
        bw.close();
    }
}
