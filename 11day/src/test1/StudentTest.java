package test1;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19);

        //把学生对象添加到集合中
        list.add(s1);
        list.add(s2);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + ", " + s.getAge());
        }
    }
}
