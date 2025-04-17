package IOTest_12day;
//压缩

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class test_12_21 {
    public static void main(String[] args) throws IOException {
        File src = new File("IOPractice\\k.txt");
        File dest = new File("IOPractice\\");
        toZip(src,dest);

    }

    public static void toZip(File src, File dest) throws IOException {
        //创建压缩关联的压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "a.zip")));
        //创建zipEntry对象，表示压缩包里面的每一个文件和文件夹
        ZipEntry entry = new ZipEntry("a.txt");
        //把ZipEntry对象放到压缩包中
        zos.putNextEntry(entry);
        //把src中的数据写到压缩包中
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1) {
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();
    }
}
