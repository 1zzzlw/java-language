package Test5;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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



    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    //this：表示当前要添加的元素
    //o：表示已经在红黑树中存在的元素
    //返回值是负数：表示当前要添加的元素是小的，要添加到左边
    //返回值是正数：表示当前要添加的元素是大的，要添加到右边
    //返回值是0，则舍去
    //方式一
    @Override
    public int compareTo(Student o) {
        System.out.println("-------------");
        System.out.println("this:" + this);
        System.out.println("o:" + o);
        return this.getAge() - o.getAge();
    }
}
