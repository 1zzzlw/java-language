package ThrTest_20day;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//public static ExecutorService newcachedThreadPool() 创建一个没有上限的线程池
//public static ExecutorService newFixedThreadPool (int nThreads) 创建有上限的线程池

public class test_20_5 {
    public static void main(String[] args) {
        //创建没有上限的线程池
        ExecutorService pool1 = Executors.newCachedThreadPool();

        //提交任务
        pool1.submit(new MyRunnable());

        //结束线程池
        pool1.shutdown();

    }
}
