package IOTest_14day;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class test_14_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("IOPractice\\src\\IOTest_14day\\随机点名器一.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();
        Collections.shuffle(list);
        System.out.println("随机点名：" + list.get(0).split("-")[0]);


    }
}
