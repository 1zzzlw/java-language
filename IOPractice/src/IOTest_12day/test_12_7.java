package IOTest_12day;
//IO流中的字符集练习

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*第一步:创建对象
public FileReader(File file)创建字符输入流关联本地文件
public FileReader(string pathname)创建字符输入流关联本地文件
第二步:读取数据
public int read()读取数据，读到末尾返回-1
public int read(char[] buffer)读取多个数据，读到末尾返回-1
第三步:释放资源
public void close()
释放资源/关流*/

public class test_12_7 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileReader fr = new FileReader("IOPractice\\c.txt");
        //read()
        //字符流的底层也是字节流，默认是一个字节一个字节的读取
        //如果遇到中文就会一次读取多个，GBK一次读取两个字节，UTF-8一次读取三个字节

        //read()细节：
        //1.默认也是一个字节一个字节的读取，如果遇到中文就会一次读取多个
        //2.在读取之后，方法的底层还会进行解码并转换成十进制，最终以十进制进行返回，这个十进制的数字也表示字符集上的数字
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }

        char[] chars = new char[2];
        int len;
        while ((len = fr.read(chars)) != -1) {
            System.out.print(new String(chars,0,len));
        }

        fr.close();
    }

}
