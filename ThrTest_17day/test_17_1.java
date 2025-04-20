package ThrTest_17day;
//完成生产者和消费者（等待唤醒机制）的代码实现线程轮流交替执行的效果

public class test_17_1 {
    public static void main(String[] args) {
        Cook c = new Cook();
        Foodie f = new Foodie();

        c.setName("厨师");
        f.setName("吃货");

        c.start();
        f.start();
    }
}
