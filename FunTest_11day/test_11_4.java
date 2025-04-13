package FunTest_11day;
//引用静态方法
//使用类名引用成员方法

import java.util.ArrayList;
import java.util.Collections;

public class test_11_4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");

        list.stream().map(Integer::parseInt).forEach(System.out::println);
    }
}
