package IOTest_12day;
//IO流中的异常捕获练习

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test_12_5 {
    public static void main(String[] args) {


        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("IOPractice\\a.txt");
            fos = new FileOutputStream("IOPractice\\acopy.txt");
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }




    }
}