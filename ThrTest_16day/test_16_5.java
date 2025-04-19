package ThrTest_16day;

/*
    setPriority(int newPriority) 设置线程的优先级
    final int getPriority() 获取线程的优先级
*/

public class test_16_5 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr, "飞机");
        Thread t2 = new Thread(mr, "坦克");

        t1.setPriority(1);
        t2.setPriority(10);

        //获得默认优先级
        //System.out.println(t1.getPriority()); //5
        //System.out.println(t2.getPriority()); //5

        t1.start();
        t2.start();

    }

}
