package ThrTest_20day;

public class MyRun implements Runnable{

    static int i = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (MyRun.class) {
                if (i <= 100) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
    }
}
