package Test_10day;
//定义一个集合，添加一些整数，过滤奇数，保留偶数，并将结果保存下来


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class test_10_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        //将结果保存下来
        List<Integer> newList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(newList);

    }
}
