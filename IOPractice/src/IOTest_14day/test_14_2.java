package IOTest_14day;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test_14_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("IOPractice\\src\\IOTest_14day\\随机点名器一.txt"));
        ArrayList<Integer> listNum = new ArrayList<>();
        ArrayList<String> listBoyName = new ArrayList<>();
        ArrayList<String> listgirlName = new ArrayList<>();
        Collections.addAll(listNum, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0);
        Collections.shuffle(listNum);
        String line;
        while ((line = br.readLine())!= null) {
            if ("男".contains(line.split("-")[1])) {
                listBoyName.add(line);
            } else {
                listgirlName.add(line);
            }
        }
        br.close();
        Random r = new Random();
        int boyCount = 0;
        int girlCount = 0;
        for (int i = 0; i < 1000000000; i++) {
            int index = r.nextInt(listNum.size());
            int number = listNum.get(index);

            if (number == 1) {
                int boyIndex = r.nextInt(listBoyName.size());
                boyCount++;
                System.out.println("随机到的男生姓名为：" + listBoyName.get(boyIndex));
            } else {
                int girlIndex = r.nextInt(listgirlName.size());
                girlCount++;
                System.out.println("随机到的女生的姓名为：" + listgirlName.get(girlIndex));
            }
        }
        System.out.println("男生随机的次数为" + boyCount);
        System.out.println("女生随机的次数为" + girlCount);
    }
}
