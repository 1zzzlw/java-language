package IOTest_12day;
//IO流中的字符集练习

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*第一步:创建对象
public FileWriter(File file) 创建字符输出流关联本地文件
public FileWriter(string pathname) 创建字符输出流关联本地文件
public FileWriter(File file, boolean append) 创建字符输出流关联本地文件
public FileWriter(string pathname, boolean append) 创建字符输出流关联本地文件
第二步:读取数据
vid write(int c) 写出一个字符
void write(string str) 写出一个字符串
void write(String str, int off, int len) 写出一个字符串的一部分
void write(char[] cbuf) 写出一个字符数组
void write(char[] cbuf, int off, int len) 写出字符数组的一部分
第三步:释放资源
public void close()
释放资源/关流*/

public class test_12_8 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("IOPractice\\d.txt",true);

        fw.write(25105); //我
        fw.write("你好？"); //"你好？

        char[] chars = {'a','b','c','我'};
        fw.write(chars);

        fw.close();

    }
}
