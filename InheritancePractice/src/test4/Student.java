package test4;

public class Student extends Person {
    private String school;
    private String id;

    public Student() {
    }


    public Student(String name, String gender, int age, String nationality, String school, String id) {
        super(name, gender, age, nationality);
        this.school = school;
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void work() {
        System.out.println(getName() + "性别为" + getGender() + "年龄为" + getAge() + "国籍为" + getNationality() + "的工作是学习");
    }
}
