package ThrTest_20day;

import java.util.Random;

public class MyThread1 extends Thread {
    static int count = 3;
    static double money = 100;
    static final double MIN = 0.01;

    @Override
    public void run() {
        synchronized (MyThread1.class) {
            if (count == 0) {
                //红包已经被抢完了
                System.out.println(getName() + "没有抢到红包");
            } else {
                double prize = 0;
                if (count == 1) {
                    //就剩最后一个红包，金额就等于money
                    prize = money;
                } else {
                    //还有两个红包需要随机分配金额
                    Random r = new Random();
                    double bounds = money - (count - 1) * MIN;
                    prize = r.nextDouble(bounds);
                    if (prize < MIN) {
                        prize = MIN;
                    }
                }
                money = money - prize;
                count--;
                System.out.println(getName() + "抽中了" + prize + "元");
            }
        }
    }
}
