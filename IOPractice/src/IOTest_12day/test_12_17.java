package IOTest_12day;
//利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码

import java.io.*;

public class test_12_17 {
    public static void main(String[] args) throws IOException {
/*
        FileInputStream fis = new FileInputStream("IOPractice\\c.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        System.out.println(line);
        br.close();
*/

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("IOPractice\\c.txt")));
        String line = br.readLine();
        System.out.println(line);
        br.close();


    }
}
