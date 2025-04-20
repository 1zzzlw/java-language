package ThrTest_17day;

public class Foodie extends Thread {
    @Override
    public void run() {

        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodFlag == 0) {
                        //桌子上没有面条，需要等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        //把吃的面条总数减一
                        Desk.count--;
                        //桌子上有面条
                        System.out.println(getName() + "在吃面条，还能再吃" + Desk.count + "碗");
                        //唤醒所有线程
                        Desk.lock.notifyAll();
                        //修改桌子的状态为没有面条
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}
