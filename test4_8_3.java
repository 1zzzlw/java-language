package Test5;
//双列集合map的hashMap练习

import java.util.HashMap;
import java.util.Map;

public class test4_8_3 {
    public static void main(String[] args) {
        //创建Map集合的对象，因为要学习Map接口中的方法，所以使用多态的方式
        Map<String, String> m = new HashMap<>();

        //添加元素
        //put的功能：添加/覆盖
        //在如果添加数据的时候，如果键不存在，那么直接把键值对对像添加到map集合里
        //如果存在，会把原有的键值对对象覆盖并把被覆盖的值返回
        m.put("a", "A");
        m.put("b", "B");
        m.put("c", "C");
        m.put("d", "D");

        //String value1 = m.put("a", "AA"); //{a=AA, b=B, c=C, d=D}
        //System.out.println(value1); //A

        //删除元素
        //String result = m.remove("a");
        //System.out.println(result); //会将键对应的值返回

        //清空元素
        //m.clear();

        //判读是否包含键和值
        boolean keyResult = m.containsKey("a");
        System.out.println(keyResult);

        boolean valueResult = m.containsValue("A");
        System.out.println(valueResult);

        //判断集合是否为空
        boolean result = m.isEmpty();
        System.out.println(result);

        //集合的长度
        int size = m.size();
        System.out.println(size);

        //打印集合
        System.out.println(m);

    }
}
