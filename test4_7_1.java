package Test4;
//迭代器的使用

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test4_7_1 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String  str = it.next();
            System.out.println(str);
        }


    }
}
