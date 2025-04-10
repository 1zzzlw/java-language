package Test_9day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test_9_2 {
    public static void main(String[] args) {
      /*  班级里有N个学生要求:
        70%的概率随机到男生
        30%的概率随机到女生
        "范闲""范建","范统","杜子腾","宋合泛","侯笼藤","朱益群”,"朱穆朗玛峰"
        "杜琦燕","袁明媛",“李猜”,“田蜜蜜"，*/
        ArrayList<Integer> list = new ArrayList<Integer>();

        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0);
        Collections.shuffle(list);
        System.out.println(list);
        Random r = new Random();
        int index = r.nextInt(list.size());
        int number = list.get(index);
        System.out.println(number);

        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList,"范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰");
        Collections.addAll(girlList,"杜琦燕","袁明媛","李猜","田蜜蜜");

        if (number == 1) {
            System.out.println(boyList.get(r.nextInt(boyList.size())));
        } else {
            System.out.println(girlList.get(r.nextInt(girlList.size())));
        }
    }
}
