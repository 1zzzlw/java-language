package FileTest_11day;

import java.io.File;

public class test_11_3 {
    public static void main(String[] args) {

        findAVI();
        System.exit(0);
    }

    public static void findAVI() {
        //获取本地所有的盘符
        File[] arr = File.listRoots();
        for (File f : arr) {
            findAVI(f);
        }
    }

    public static void findAVI(File file) {
        //1.进入文件夹
        File[] files = file.listFiles();
        if (files != null) {
            //2.遍历数组
            for (File f : files) {
                //3.判断
                if (f.isFile()) {
                    //判断是否文件,是文件就可以寻找avi后缀的电影
                    String name = f.getName();
                    if (name.endsWith(".avi")) {
                        System.out.println(name);
                    }
                } else {
                    //4.判断
                    //不是文件，则是文件夹，再次调用findAVI进行递归
                    findAVI(f);
                }
            }
        }
    }

}
