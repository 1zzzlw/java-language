package IOTest_12day;
//字节输出流FileOutputStream
//写出一段文字到本地文件中

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test_12_1 {
    public static void main(String[] args) throws IOException {

        //创建对象
        //参数是字符串表示的路径或者File对象都是可以的
        //如果文件不存在会创建一个新的文件，但是要保证父级路径是正确的
        //如过文件已经存在，会清空文件
        FileOutputStream fos = new FileOutputStream("IOPractice\\a.txt");

        //写出数据(三种)
        //参数是整数，但是实际上写到本地上的是ASCLL码表上对应的字符
        fos.write(97); //a
        byte[] bytes = {97, 98, 99, 100, 101};
        fos.write(bytes); //abcde
        fos.write(bytes,1,2); //bc

        //释放资源
        //每次使用完流之后都要释放资源
        fos.close();


    }
}
