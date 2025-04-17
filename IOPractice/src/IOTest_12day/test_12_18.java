package IOTest_12day;
/*
需求:
利用序列化流/对象操作输出流，把一个对象写到本地文件中
构造方法:
public objectoutputstream(outputstream out) 把基本流变成高级流
成员方法:
public final void writeobject(object obj) 把对象序列化(写出)到文件中去
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class test_12_18 {
    public static void main(String[] args) throws IOException {

        Student s = new Student("zhangsan", 23);

        //创建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IOPractice\\myio.txt"));

        //写出数据
        oos.writeObject(s);

        oos.close();
    }

}
