package Test4;

import java.util.HashSet;
import java.util.Objects;

public class test4_7_9 {
    public static void main(String[] args) {

        Student1 s1 = new Student1("zhangsan",28);
        Student1 s2 = new Student1("lisi",29);
        Student1 s3 = new Student1("wangwu",30);
        Student1 s4 = new Student1("wangwu",30);

        HashSet<Student1> hs = new HashSet<>();

        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4)); //如果没有重写hashCode则这里可以添加返回true 如果重写了则不可以添加返回false

        System.out.println(hs);
    }

}

class Student1 {
    private String name;
    private int age;

    public Student1() {
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student = (Student1) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}