package Test_8day;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class test_8_5 {
    public static void main(String[] args) {
        String str = "aababcabcdabcde";

        //创建集合
        TreeMap<Character, Integer> map = new TreeMap<>();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                //存在
                int count = map.get(ch);
                count++;
                map.put(ch, count);
            } else {
                //不存在
                map.put(ch, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> enter = map.entrySet();
        for (Map.Entry<Character, Integer> entry : enter) {
            System.out.print(entry.getKey() + "（" + entry.getValue() + "）");
        }
    }
}
