package test3;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //读书
    public void read(Book book) {
        System.out.println(this.age + "岁的" + this.name + "正在阅读" + book.getTitle() + "，作者是" + book.getAuthor());
    }

}
