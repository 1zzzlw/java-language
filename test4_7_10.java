package Test4;
//TreeSet练习

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class test4_7_10 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(4);
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(5);

        System.out.println(ts); //[1, 2, 3, 4, 5] 默认排序

        //迭代器遍历
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("----------------");
        //增强for循环遍历
        for (Integer i : ts) {
            System.out.println(i);
        }
        System.out.println("----------------");
        //lambda遍历
        ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("----------------");
        //lambda省略遍历
        ts.forEach(integer -> System.out.println(integer));

    }

}
