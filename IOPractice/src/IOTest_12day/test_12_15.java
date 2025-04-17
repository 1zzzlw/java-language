package IOTest_12day;
//利用转化流按照指定字符编码读取和写出

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class test_12_15 {
    public static void main(String[] args) throws IOException {
        //读取
        FileReader fr = new FileReader("IOPractice\\i.txt", Charset.forName("GBK"));
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
        //写出
        FileWriter fw = new FileWriter("IOPractice\\i.txt",Charset.forName("GBK"),true);
        fw.write("你好");
        fw.close();
    }
}
