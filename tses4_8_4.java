package Test5;
//Map集合的遍历方式

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class tses4_8_4 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("a", "A");
        m.put("b", "B");
        m.put("c", "C");
        m.put("d", "D");

        //方式一：通过键找值
        //先获取所有的键，将这些键放在一个单列集合中
        Set<String> keys = m.keySet();
        //键的遍历
        for (String key : keys) {
            System.out.println(key);
            //利用map集合中的键获取对应的值 get
            String value = m.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("--------------------");

        //方式二：通过键值对进行遍历
        //通过一个方法获得键值对对象，返回一个set集合 Entry就是键值对对象
        Set<Map.Entry<String, String>> entries = m.entrySet();
        //遍历获得每个键值对对象
        for (Map.Entry<String, String> entry : entries) {
            //利用entry调用get方法获取键和值
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println("--------------------");

        //方式三：利用lambda表达式进行遍历
        m.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "=" + value);
            }
        });
        System.out.println("--------------------");

        //简化
        m.forEach(( key, value) -> System.out.println(key + "=" + value));


    }
}
