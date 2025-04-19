package ThrTest_16day;
/*
多线程的第三种实现方式
特点:可以获取到多线程运行的结果
1.创建一个类MyCallable实现callable接口
2.重写ca11 (是有返回值的，表示多线程运行的结果)
3.创建MyCallable的对象(表示多线程要执行的任务)
4.创建FutureTask的对象(作用管理多线程运行的结果)
5.创建Thread类的对象，并启动(表示线程)
*/

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class test_16_3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //表示要执行的任务
        MyCallable mc = new MyCallable();
        //管理运行结果
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);
        t1.start();

        Integer sum = ft.get();

        System.out.println(sum);

    }
}
