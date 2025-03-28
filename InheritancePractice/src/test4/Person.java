package test4;

public class Person {
    private String name;
    private String gender;
    private int age;
    private String nationality;

    public Person() {
    }

    public Person(String name, String gender, int age, String nationality) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void eat() {
        System.out.println(getName() + "性别为" + getGender() + "年龄为" + getAge() + "国籍为" + getNationality() + "在吃饭");
    }

    public void sleep() {
        System.out.println(getName() + "性别为" + getGender() + "年龄为" + getAge() + "国籍为" + getNationality() + "在睡觉");
    }

    public void work() {
        System.out.println(getName() + "性别为" + getGender() + "年龄为" + getAge() + "国籍为" + getNationality() + "在工作");
    }

}
