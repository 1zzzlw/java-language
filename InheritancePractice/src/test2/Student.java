package test2;

public class Student extends Persion {
    String className;

    public Student() {
    }

    public Student(String name, int age, String className) {
        super(name, age);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void lecture() {
        System.out.println(getName() + "学生的听课反馈");
    }
}
