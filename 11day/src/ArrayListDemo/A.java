package ArrayListDemo;

import java.util.ArrayList;

public class A {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        //boolean result = list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        //System.out.println(result);
        System.out.println(list);
        //删除元素
        //list.remove("aaa");
        String str = list.remove(0); //删除索引为0的元素,返回被删除的元素
        System.out.println(str);
        System.out.println(list);
        //修改元素
        list.set(0,"ccc");
        System.out.println(list);
        //查询元素
        String s = list.get(0);
        System.out.println(s);
        //查询集合的长度
        int size = list.size();
        System.out.println(size);


    }
}
