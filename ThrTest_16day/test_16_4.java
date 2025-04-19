package ThrTest_16day;
/*
String getName() 返回此线程的名称
void setName(string name) 设置线程的名字(构造方法也可以设置名字)
细节：
1 如果没有给线程设置名字，线程也是有默认名字的
 格式：Thread-X（X序号，从0开始）
2 如果我们要给线程设置名字，可以用set方法设置，也可以用构造方法来设置

static Thread currentThread() 获取当前线程的对象
细节
 当JVM虚拟机启动之后，会自动启动多个线程
 其中有一条线程叫做main线程
 他的作用就是调用main方法，并执行里面的代码
 在以前写的所有代码都是运行在main线程当中的

static void sleep(long time) 让线程休眠指定的时间，单位为毫秒
    哪条线程执行到这个方法，哪个线程就会在这里执行停留的时间
    执行的时间和参数有关
    当时间到了，线程会自动的醒来并继续执行下面的其他方法

*/

public class test_16_4 {
    public static void main(String[] args) throws InterruptedException {

        //创建线程的对象，如果要设置名字，需要在MyThread中重写Thread的构造方法，因为构造方法不能被继承，否则会报错
        MyThread t1 = new MyThread("飞机");
        MyThread t2 = new MyThread("坦克");

        t1.start();
        t2.start();

        //哪条线程执行到这个方法，此时获取的就是哪条线程的对象，在这里，t表示执行main方法的那条线程的对象
        Thread t = Thread.currentThread();
        System.out.println(t.getName()); //main

        System.out.println("11111111");
        Thread.sleep(5000);
        System.out.println("22222222");


    }

}
