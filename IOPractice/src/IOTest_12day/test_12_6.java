package IOTest_12day;
/*Java中编码的方法
public byte[] getBytes() 使用默认方式进行编码
public byte[] getBytes(string charsetName) 使用指定方式进行编码
Java中解码的方法
String(byte[] bytes) 使用默认方式进行解码
String(byte[l bytes,string charsetName) 使用指定方式进行解码
*/


import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class test_12_6 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        //编码
        String str = "ai你呦";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1)); //8

        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2)); //6

        //解码
        String str2 = new String(bytes1);
        System.out.println(str2); //ai你呦

        String str3 = new String(bytes1, "GBK");
        System.out.println(str3); //ai浣犲懄
    }
}
