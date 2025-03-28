package test5;

public class test {
    public static void main(String[] args) {
        manager m1 = new manager("张三","001",6000.0,1000.0);
        programmer p1 = new programmer("李四","002",7000.0);

        m1.work();
        p1.work();
    }
}
