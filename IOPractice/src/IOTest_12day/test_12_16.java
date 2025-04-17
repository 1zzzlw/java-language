package IOTest_12day;
//读写结合

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class test_12_16 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("IOPractice\\j.txt", Charset.forName("GBK"));
        int ch;
        StringBuilder sb = new StringBuilder();
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();
        String s = sb.toString();
        FileWriter fw = new FileWriter("IOPractice\\j.txt");
        fw.write(s);
        fw.close();
    }
}
