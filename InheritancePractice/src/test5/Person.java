package test5;

public class Person {
    private String name;
    private String workId;
    private double salary;

    public Person() {
    }

    public Person(String name, String workId, double salary) {
        this.name = name;
        this.workId = workId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + "工作");
    }
}
