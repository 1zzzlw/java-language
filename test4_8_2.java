package Test5;
//方法二：创建TreeSet对象的时候，传递比较器Comparator指定规则
//要求规则先按照长度进行排序，如果长度一样就按照首字母进行排序

import java.util.Comparator;
import java.util.TreeSet;

public class test4_8_2 {
    public static void main(String[] args) {
        /*TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            //o1:表示当前要添加的元素
            //o2：表示已经在红黑树中存在的元素
            @Override
            public int compare(String o1, String o2) {
                int i = o1.length() - o2.length();
                //当i=0时表示长度一样，则按照默认的首字母进行排序
                i = i== 0 ? o1.compareTo(o2) : i;
                return i;
            }
        });
*/
        //可以改成lambda表达式
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
                int i = o1.length() - o2.length();
                //当i=0时表示长度一样，则按照默认的首字母进行排序
                i = i== 0 ? o1.compareTo(o2) : i;
                return i;
            }
        );

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts); //默认排序，因为已经在String中写好了排序规则
    }
}
