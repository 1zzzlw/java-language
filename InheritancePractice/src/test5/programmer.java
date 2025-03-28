package test5;

public class programmer extends Person {

    public programmer() {
    }

    public programmer(String name, String workId, double salary) {
        super(name, workId, salary);
    }

    public void work() {
        System.out.println(getName() + "工作是完成项目");
    }
}
