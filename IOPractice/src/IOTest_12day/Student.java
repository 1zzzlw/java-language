package IOTest_12day;

import java.io.Serializable;

public class Student implements Serializable {
    //定义版本号,便于以后修改Student类
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String gender;
    //transient:序列化关键字，不会把当前属性序列化到本地文件中
    private transient String address;

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
}
