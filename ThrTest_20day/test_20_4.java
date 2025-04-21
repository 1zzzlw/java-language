package ThrTest_20day;

public class test_20_4 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        MyThread1 t3 = new MyThread1();
        MyThread1 t4 = new MyThread1();
        MyThread1 t5 = new MyThread1();

        t1.setName("一");
        t2.setName("二");
        t3.setName("三");
        t4.setName("四");
        t5.setName("五");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}