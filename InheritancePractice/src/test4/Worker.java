package test4;

public class Worker extends Person {
    private String unit;
    private int workAge;

    public Worker() {
    }

    public Worker(String name, String gender, int age, String nationality, String unit, int workAge) {
        super(name, gender, age, nationality);
        this.unit = unit;
        this.workAge = workAge;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public void work() {
        System.out.println(getName() + "性别为" + getGender() + "年龄为" + getAge() + "国籍为" + getNationality() + "的工作是盖房子");
    }
}
