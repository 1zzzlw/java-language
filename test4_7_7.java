package Test4;
//set集合练习 元素不可以重复且无序，所以添加元素是可以进行判断如果存在就返回false不存在就返回true

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class test4_7_7 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("张三");
        //set.add("张三"); false
        set.add("李四");
        set.add("王五");

        //迭代器遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //增强for循环遍历
        for (String s : set) {
            System.out.println(s);
        }

        //lambda表达式遍历
        set.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}
