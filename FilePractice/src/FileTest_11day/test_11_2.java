package FileTest_11day;
//定义一个方法找某一个文件夹中，是否存在以avi结尾的电影
//（暂时不需要考虑子文件夹）

import java.io.File;

public class test_11_2 {
    public static void main(String[] args) {

        File file = new File("FilePractice\\aaa");
        boolean b = file.mkdirs();
        System.out.println(b);
    }

    public static boolean haveAVI(File file) {
        //进入aaa文件夹并且获取所以内容
        File[] files = file.listFiles();
        //遍历数组获得每一个元素
        for (File f : files) {
            //f:依次表示aaa文件夹里面每一个文件或者文件夹的路径
            if (f.isFile() && f.getName().endsWith(".avi")) {
                return true;
            }
        }
        return false;
    }
}
