package IOTest_12day;
//换行写:
//再次写出一个换行符就可以了
//windows:\r\n
//Linux: \n
//Mac:  \r
//细节:在windows操作系统当中，java对回车换行进行了优化。虽然完整的是\r\n，
//但是我们写其中一个\r或者\n,java也可以实现换行，因为java在底层会补全。
//建议:不要省略，写全
//
// 续写：
//如果想要续写，打开续写开关即可开关位置:
//创建对象的第二个参数默认false:表示关闭续写，
//此时创建对象会清空文件手动传递true:表示打开续写，此时创建对象不会清空文件

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test_12_2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("IOPractice\\b.txt",true);

        String str1 = "zhulinwei";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);

        String str2 = "\r\n";
        byte[] bytes2 = str2.getBytes();
        fos.write(bytes2);

        String str3 = "666";
        byte[] bytes3 = str3.getBytes();
        fos.write(bytes3);

        fos.close();

    }
}
