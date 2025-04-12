package Test_10day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test_10_3 {
    public static void main(String[] args) {
        ArrayList<String> boyList = new ArrayList<String>();
        ArrayList<String> girlList = new ArrayList<String>();

        Collections.addAll(boyList, "蔡坤坤,24", "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");
        Collections.addAll(girlList, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");

        List<String> newBoyList = boyList.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2)
                .collect(Collectors.toList());

        List<String> newGirlList = girlList.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1)
                .collect(Collectors.toList());

/*        Stream.concat(newBoyList.stream(), newGirlList.stream()).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                String name = s.split(",")[0];
                String age = s.split(",")[1];
                return new Actor(name, Integer.parseInt(age));
            }
        });*/

        //lambda表达式写法，上面的是匿名内部类的写法
        List<Actor> allList = Stream.concat(newBoyList.stream(), newGirlList.stream())
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());

        System.out.println(allList);
    }
}
