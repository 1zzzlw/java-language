package ThrTest_20day;

public class MyThread extends Thread{

    static int ticket = 0;

    public MyThread() {
    }

    public MyThread(Runnable task) {
        super(task);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (ticket < 1000) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                } else {
                    break;
                }
            }
        }
    }
}
