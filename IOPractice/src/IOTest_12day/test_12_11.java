package IOTest_12day;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/*
文本文件中有以下的数据:2-1-9-4-7-8
将文件中的数据进行排序，变成以下的数据:1-2-4-7-8-9
*/
public class test_12_11 {
    public static void main(String[] args) throws IOException {
        //读取数据
        FileInputStream fis = new FileInputStream("IOPractice\\e.txt");
        StringBuilder sb = new StringBuilder();
        int b;
        while ((b = fis.read()) != -1) {
            sb.append((char) b);
        }
        fis.close();
        //排序
        ArrayList<Integer> list = new ArrayList<>();
        String s = sb.toString();
        String[] str = s.split("-");
        for (String str1 : str) {
            int j = Integer.parseInt(str1);
            list.add(j);
        }

        Collections.sort(list);
        System.out.println(list);

/*        Integer[] arr = Arrays.stream(sb.toString()
                        .split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);*/

        //写出
        FileWriter fw = new FileWriter("IOPractice\\f.txt");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                fw.write(list.get(i) + "");
            } else {
                fw.write(list.get(i) + "-");
            }
        }
        fw.close();


    }
}
