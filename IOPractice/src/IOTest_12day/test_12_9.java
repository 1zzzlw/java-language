package IOTest_12day;
//拷贝多级文件夹

import java.io.*;

public class test_12_9 {
    public static void main(String[] args) throws IOException {
        //源头
        File ccc = new File("FilePractice\\ccc");
        //目的地
        File dest = new File("IOPractice\\dest");
        //创建方法
        copydir(ccc, dest);


    }

    private static void copydir(File ccc, File dest) throws IOException {
        //创建目的地文件夹
        dest.mkdir();
        //进入数据源
        File[] files = ccc.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                //是文件，进行拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));
                byte[] buf = new byte[1024];
                int len;
                while ((len = fis.read()) != -1) {
                    fos.write(buf,0,len);
                }
                fos.close();
                fis.close();
            } else {
                //是文件夹，进行递归
                copydir(file, new File(dest, file.getName()));
            }
        }

    }
}
