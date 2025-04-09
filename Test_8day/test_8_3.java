package Test_8day;
//TreeMap练习

import java.util.Comparator;
import java.util.TreeMap;

public class test_8_3 {
    public static void main(String[] args) {
        //Integer Double 这些类型的数都是默认按照升序进行排列的
        //按照id的升序排列
        TreeMap<Integer, String> map1 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        //按照id的降序排列
        TreeMap<Integer, String> map2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1表示当前要添加的元素
                //o2表示红黑树中存在的元素
                return o2 - o1;
            }
        });

        map1.put(5, "商品5");
        map1.put(1, "商品1");
        map1.put(4, "商品4");
        map1.put(2, "商品2");
        map1.put(3, "商品3");

        System.out.println(map1);

        map2.put(5, "商品5");
        map2.put(1, "商品1");
        map2.put(4, "商品4");
        map2.put(2, "商品2");
        map2.put(3, "商品3");

        System.out.println(map2);
    }
}
