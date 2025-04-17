package IOTest_12day;
//文件加密

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test_12_10 {
    public static void main(String[] args) throws IOException {
        //创建对象关联原始文件
        FileInputStream fis = new FileInputStream("IOPractice\\image.jpg");
        //创建对象关联加密文件
        FileOutputStream fos = new FileOutputStream("IOPractice\\ency.jpg");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b ^ 2);
        }

        fos.close();
        fis.close();


    }
}
