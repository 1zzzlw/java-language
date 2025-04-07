package Test4;
//增强for循环

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class test4_7_2 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("lisi");
        coll.add("zhangsan");
        coll.add("wangwu");

        for (String str : coll) {
            System.out.println(str);
        }

        //lambda表达式进行遍历
        coll.forEach(new Consumer<String>() {
            @Override
            //s一次表示集合中的每一个数据
            public void accept(String s) {
                System.out.println(s);
            }
        });

        coll.forEach(s -> System.out.println(s));


    }
}
