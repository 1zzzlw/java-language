package Test_8day;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class test_8_1 {
    public static void main(String[] args) {

        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        hm.put(s1,"江苏");
        hm.put(s2,"浙江");
        hm.put(s3,"福建");

        //遍历集合
        Set<Student> set = hm.keySet();
        Iterator<Student> it = set.iterator();
        while (it.hasNext()) {
            Student key = it.next();
            String value = hm.get(key);
            System.out.println(key + "=" + value);
        }
    }

}
