package Test4;
//list系类的集合

import java.util.ArrayList;
import java.util.List;

public class test4_7_3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //void add(int index, E element)
        //细节：原来索引上的元素会向后移动
        list.add(1, "eee");

        //E remove = list.remove(0); 删除指定索引处的元素，返回被删除的元素
        String remove = list.remove(0);
        System.out.println(remove);

        //E set(int index, E element) 修改指定索引处的元素，返回被修改的元素

        //E get(int index) 返回指定索引处的元素

        System.out.println(list);
    }
}
