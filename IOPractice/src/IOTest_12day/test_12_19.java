package IOTest_12day;
//反序列化流

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class test_12_19 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建反序列化流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IOPractice\\myio.txt"));

        //读取数据
        Student s = (Student)ois.readObject();

        //打印数据
        System.out.println(s);
        ois.close();
    }
}
