package Test_8day;

import java.util.*;

public class test_8_2 {
    public static void main(String[] args) {
        String[] arr = {"A","B","C","D"};

        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
        System.out.println(list);

        HashMap<String, Integer> hm = new HashMap<>();

        for (String name : list) {
            if (hm.containsKey(name)) {
                //存在
                int count = hm.get(name);
                hm.put(name, count + 1);
            } else {
                //不存在
                hm.put(name, 1);
            }
        }

        System.out.println(hm);

        //找出最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> set = hm.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        System.out.println(max);
        //是否有和最大值相同的值并打印出对应的键
        for (Map.Entry<String, Integer> entry : set) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        }
        
    }
}
