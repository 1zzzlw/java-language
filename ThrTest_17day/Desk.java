package ThrTest_17day;

public class Desk {
    //作用：控制生产者和消费者的执行

    //判断桌子上有没有面条， 0为没有，1为有
    public static int foodFlag = 0;

    //吃面条的总数
    public static int count = 10;

    //定义锁的对象
    public static Object lock = new Object();
}
