package Test_9day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test_9_1 {
    public static void main(String[] args) {
        //班级里有N个学生，学生属性:姓名，年龄，性别。实现随机点名器。
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan", "lisi", "wangwu", "zhaoliu", "zhaohua", "zhangxiao", "xiaoshishi");
        //随机点名
        //方法一：生成随机数
        Random r = new Random();
        int index = r.nextInt(list.size());
        System.out.println(list.get(index));
        //方法二：打乱集合
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
