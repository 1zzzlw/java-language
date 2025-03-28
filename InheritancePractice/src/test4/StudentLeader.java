package test4;

public class StudentLeader extends Student{
    private String job;

    public StudentLeader() {
    }

    public StudentLeader(String name, String gender, int age, String nationality, String school, String id, String job) {
        super(name, gender, age, nationality, school, id);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void meeting() {
        System.out.println(getName() + "性别为" + getGender() + "年龄为" + getAge() + "国籍为" + getNationality() + "的特有方法开会");
    }
}
