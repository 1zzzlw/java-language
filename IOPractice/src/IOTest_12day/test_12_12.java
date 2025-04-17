package IOTest_12day;
/*
需求:
利用字节缓冲流拷贝文件
字节缓冲输入流的构造方法:
public BufferedInputstream(Inputstream is)
字节缓冲输出流的构造方法:
public Bufferedoutputstream(outputstream os)
*/

import java.io.*;

public class test_12_12 {
    public static void main(String[] args) throws IOException {
        //创建缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("IOPractice\\c.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IOPractice\\g.txt"));
        //循环读取并写到目的地
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

/*
        //读取多个字节
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
*/

        //释放资源
        bos.close();
        bis.close();
    }
}
