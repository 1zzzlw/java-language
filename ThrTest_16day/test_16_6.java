package ThrTest_16day;
/*
    final void setDaemon(boolean on) 设置守护线程

    当其他非守护线程执行完毕之后，守护线程会陆续结束
    即当非守护线程结束，守护线程就就会逐渐结束

*/
public class test_16_6 {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        MyThread2 m2 = new MyThread2();

        m1.setName("女神");
        m2.setName("备胎");

        m2.setDaemon(true);

        m1.start();
        m2.start();


    }
}
