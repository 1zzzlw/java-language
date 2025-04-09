package Test_8day;

import java.util.Comparator;
import java.util.TreeMap;

public class test_8_4 {
    public static void main(String[] args) {

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("zhangsan", 23);

        //按照学生年龄进行排序，如果年龄一样就按照名字首字母进行排序，如果两个都相同则按照一个人处理
        TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });

        tm.put(s1, "广州");
        tm.put(s2, "河南");
        tm.put(s3, "江西");
        tm.put(s4, "广州");

        System.out.println(tm);




    }
}
