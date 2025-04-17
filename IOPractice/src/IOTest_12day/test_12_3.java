package IOTest_12day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test_12_3 {
    public static void main(String[] args) throws IOException {
        //创建对象
        //如果文件不存在则直接报错
        //因为就算创建出文件也是空白文件，没有任何意义
        FileInputStream fis = new FileInputStream("IOPractice\\a.txt");

        //读取数据
        //一次读一个数据，读出来的数据是ASCLL码表对应的数字
        //读到文件末尾，read方法返回-1
/*        int b1 = fis.read();
        System.out.println(b1);
        int b2 = fis.read();
        System.out.println(b2);
        //字节输入流循环读取
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }*/
        //一次读取多个字节
        byte[] bytes = new byte[2];
        //一次读取多少个字节，具体读多少，跟数组的长度有关
        //返回值：本次读取到多少个字节数据
        int len;
        len = fis.read(bytes);
        System.out.println(len); //2
        String str = new String(bytes);
        System.out.println(str);
        len = fis.read(bytes);
        String str1 = new String(bytes,0,len);
        System.out.println(str1);
        //释放资源
        fis.close();
    }
}
