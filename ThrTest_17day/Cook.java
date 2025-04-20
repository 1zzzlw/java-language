package ThrTest_17day;

public class Cook extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodFlag == 1) {
                        //桌子上有食物，等待吃完
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        //桌子上没有食物
                        System.out.println(getName() + "做了一碗面条");
                        Desk.foodFlag = 1;
                        Desk.lock.notifyAll();
                    }

                }

            }
        }

    }
}
