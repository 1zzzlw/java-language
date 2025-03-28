package test5;

public class manager extends Person {
    private double bonous;

    public manager() {
    }

    public manager(String name, String workId, double salary, double bonous) {
        super(name, workId, salary);
        this.bonous = bonous;
    }

    public void work() {
        System.out.println(getName() + "工作是管理项目");
    }
}
