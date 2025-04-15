package FileTest_11day;
//在当前模块下的aaa文件夹中创建一个a.txt文件

import java.io.File;
import java.io.IOException;

public class test_11_1 {
    public static void main(String[] args) throws IOException {
        //创建a.txt文件的父级路径
        File file = new File("FilePractice\\aaa");
        //创建父级文件夹
        //如果父级文件夹已经存在了则返回false
        //如果不存在则返回true
        file.mkdirs();
        //拼接父级路径和子级路径
        File src = new File(file, "a.txt");
        boolean b = src.createNewFile();
        if (b) {
            System.out.println("创建成功");
        } else {
            System.out.println("创建失败");
        }

    }
}
