package FileTest_11day;

import java.io.File;

public class test_11_5 {
    public static void main(String[] args) {
        File file = new File("FilePractice\\aaa");
        long len = getLen(file);
        System.out.println(len);
    }

    public static long getLen(File file) {
        int len = 0;
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                len += f.length();
            } else {
                len += getLen(f);
            }
        }
        return len;
    }
}
