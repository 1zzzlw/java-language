package Test4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class test4_7_4 {
    public static void main(String[] args) {
 /*     List系列集合的五种遍历方式:
        1.迭代器
        2.列表迭代器
        3.增强for
        4.Lambda表达式
        5.普通for循环*/

        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //1.迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("--------------");
        //2.列表迭代器
        //额外添加了一个方法，在遍历的过程中可以添加元素
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            String str = lit.next();
            if (str.equals("bbb")) {
                lit.add("qqq");
            }
        }
        System.out.println(list);
        System.out.println("--------------");
        //3.增强for
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------");
        //4.Lambda表达式
        list.forEach(s -> System.out.println(s));
        System.out.println("--------------");
        //5.普通for循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

    }
}
