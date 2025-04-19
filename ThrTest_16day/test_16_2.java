package ThrTest_16day;
//多线程的第二种启动方式

public class test_16_2 {
    public static void main(String[] args) {
        //创建MyRun的对象
        //表示多线程要执行的任务
        MyRun r1 = new MyRun();
        //创建线程对象
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        //给线程设置名字
        t1.setName("线程1");
        t2.setName("线程2");
        //开启线程
        t1.start();
        t2.start();

    }
}
