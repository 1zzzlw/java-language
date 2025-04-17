package IOTest_12day;
//文件拷贝

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test_12_4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IOPractice\\a.txt");
        FileOutputStream fos = new FileOutputStream("IOPractice\\acopy.txt");

        //拷贝：边读边写
        int b;
        long startTime = System.currentTimeMillis();
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time: " + totalTime);

        /*
        //数组读取方法
        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }
*/

        //释放资源
        //先开的最后关闭
        fos.close();
        fis.close();

    }
}
