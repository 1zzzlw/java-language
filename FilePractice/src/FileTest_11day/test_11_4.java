package FileTest_11day;
//删除一个多级文件夹

import java.io.File;

public class test_11_4 {
    public static void main(String[] args) {
        File file = new File("FilePractice\\bbb");
        delete(file);
    }

    public static void delete(File file) {
        //进入文件夹
        File[] files = file.listFiles();
            //遍历数组
            for (File f : files) {
                //判断是不是文件
                if (f.isFile()) {
                    //如果是文件就删除
                    f.delete();
                } else {
                    //如果是文件夹就递归
                    delete(f);
                }
            }
        //最后在删除自己
        file.delete();
    }

}
