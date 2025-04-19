package ThrTest_16day;
//多线程的第一种启动方式

public class test_16_1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("线程一");
        t2.setName("线程二");

        t1.start();
        t2.start();
    }
}
