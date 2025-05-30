package Test_10day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test_10_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "zhangsan,23", "lisi,24", "wangwu,25");

/*
        Map<String, Integer> map = list.stream()
                .filter(s -> (Integer.parseInt(s.split(",")[1]) >= 24))
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {

                        return s.split(",")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split(",")[1]);
                    }
                }));
*/

        //lambda表达式写法
        Map<String, Integer> map = list.stream()
                .filter(s -> (Integer.parseInt(s.split(",")[1]) >= 24))
                .collect(Collectors.toMap(s -> s.split(",")[0]
        , s -> Integer.parseInt(s.split(",")[1])));

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }



    }

}
