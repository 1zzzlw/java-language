package Test3;

import java.util.ArrayList;

public class test4_6_1 {
    public static void main(String[] args) {
        //需求：定义一个方法利用基本查找，查询每个元素在数组中的索引
        //要求：考虑到数组中元素有重复的可能性
        ArrayList<Integer> list1 = new ArrayList<>();
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79, 81};
        list1 = basicSearch(81,arr);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }

    public static ArrayList<Integer> basicSearch(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 81) {
                list.add(i);
            }
        }
        return list;
    }

}
