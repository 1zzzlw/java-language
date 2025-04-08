package Test5;
//TreeSet练习

import java.util.TreeSet;

public class test4_8_1 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        //打印前需要先写一下指定的比较规则
        //方法一：JavaBean类实现Comparable接口指定比较规则
        //方法二：创建TreeSet对象的时候，传递比较器Comparator指定规则
        //使用原则：默认使用第一种方式，如果第一种方式不能满足需求就使用第二种方式
        System.out.println(ts);
    }
}

