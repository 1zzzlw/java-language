package IOTest_12day;
//解压缩流

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class test_12_20 {
    public static void main(String[] args) throws IOException {
        //创建一个File表示要解压的压缩包
        File src = new File("IOPractice\\aaa.zip");
        //创建一个File表示压缩路径
        File dest = new File("IOPractice\\");

        unzip(src,dest);
    }

    public static void unzip(File src,File dest) throws IOException {
        //创建一个解压缩流用来读取压缩包中的数据
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));

        //表示当前在压缩包中获得文件或者文件夹
        ZipEntry ze = zis.getNextEntry();
        //当压缩包为空是结束循环
        while (ze != null) {
            //判断是否文件夹
            if (ze.isDirectory()) {
                //是文件夹，需要在dest目的地创建一个同样的文件夹
                File dir = new File(dest, ze.getName());
                dir.mkdirs();
            } else {
                //不是文件夹是文件，需要在该文件夹下创建该文件
                FileOutputStream fos = new FileOutputStream(new File(dest, ze.getName()));
                int b;
                while ((b = zis.read()) != -1) {
                    //写道目的地
                    fos.write(b);
                }
                fos.close();
                zis.closeEntry();
            }
        }
        zis.close();
    }

}
