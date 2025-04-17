package IOTest_13day;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class test_13_1 {
    public static void main(String[] args) throws IOException {
        //创建一个File对象用来表示压缩的对象
        File src = new File("IOPractice\\bbb");
         //创建一个File对象用来表示压缩包存放在哪里（父级路径）
        File destParent = src.getParentFile();
        //创建一个File对象用来表示压缩包的路径
        File dest = new File(destParent, src.getName() + ".zip");
        //创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //获取src里面的每一个文件，变成ZipEntry对象，放入到压缩包里面
        toZip(src, zos, src.getName());
        //释放资源
        zos.close();
    }

    //String name 表示压缩包内部的路径
    public static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        //进入src文件夹
        File[] files = src.listFiles();
        //遍历数组
        for (File file : files) {
            if (file.isFile()) {
                //是文件,变成ZipEntry对象，并放入压缩包中
                ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
                //将对象放入到压缩包中
                zos.putNextEntry(entry);
                //读取文件并写入压缩包中
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            } else {
                //是文件夹，进行递归，并创建文件夹
                toZip(file, zos, name + "\\" + file.getName());
            }

        }


    }

}
