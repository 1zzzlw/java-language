package ThrTest_20day;

public class test_20_2 {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();

        m1.setName("窗口一");
        m2.setName("窗口二");

        m1.start();
        m2.start();
    }
}
