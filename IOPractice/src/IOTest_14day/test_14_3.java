package IOTest_14day;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class test_14_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br1 = new BufferedReader(new FileReader("IOPractice\\src\\IOTest_14day\\随机点名器一.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("IOPractice\\src\\IOTest_14day\\计数.txt"));

        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br1.readLine()) != null) {
            list.add(line);
        }
        br1.close();
        Collections.shuffle(list);
        String str = br2.readLine();
        int n = Integer.parseInt(str);
        n++;
        if (n == 3) {
            System.out.println("随机点名：张三");
        } else {
            System.out.println("随机点名：" + list.get(0).split("-")[0]);
        }
        br2.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("IOPractice\\src\\IOTest_14day\\计数.txt"));
        bw.write(n + "");
        bw.close();


    }
}
