package pers.quan.sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *
 * ExecutorService : 线程池接口
 *  Executors: 线程池的工具类，用于创建并返回不同类型的线程池
 *
 */
public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(6);
        ThreadPoolExecutor service = (ThreadPoolExecutor)es;

//        开启
        service.submit(new PoolTest());
        service.submit(new PoolTest());

//        关闭
        service.shutdown();
    }

}

class PoolTest implements Runnable {
    @Override
    public void run() {
        for(int i = 0;i<10;i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}





