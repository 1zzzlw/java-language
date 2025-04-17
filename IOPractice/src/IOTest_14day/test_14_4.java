package IOTest_14day;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class test_14_4 {
    public static void main(String[] args) throws IOException {
        File file = new File("IOPractice\\src\\IOTest_14day\\随机点名器二.txt");
        //获得名字的备份
        File fileNew = new File("IOPractice\\src\\IOTest_14day\\随机点名器二(存档).txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        Collections.shuffle(list);
        System.out.println("随机点名：" + list.get(0).split("-")[0]);
        list.remove(0);
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
        if (file.length() == 0) {
            BufferedReader bwNew = new BufferedReader(new FileReader(fileNew));
            while ((line = bwNew.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            bwNew.close();
        }
        bw.close();
    }
}
