package test2;

public class Teacher extends Persion {
    private String departName;

    public Teacher() {
    }

    public Teacher(String name, int age, String departName) {
        super(name, age);
        this.departName = departName;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public void putProblem() {
        System.out.println(getName() + "老师发布问题");
    }
}
