package Test3;

import java.util.Arrays;
import java.util.Comparator;

public class test4_6_8 {
    public static void main(String[] args) {
        String[] arr = {"a", "aaaa", "aaa", "aa"};

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //字符串的长度进行排列
                return o1.length() - o2.length();
            }
        });

        //lambda表达式的完整写法
        Arrays.sort(arr, (String o1, String o2) -> {
                //字符串的长度进行排列
                return o1.length() - o2.length();
            }
        );
        //lambda表达式的简写模式
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());


        System.out.println(Arrays.toString(arr));
    }
}
