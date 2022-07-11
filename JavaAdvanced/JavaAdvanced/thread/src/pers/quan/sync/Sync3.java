package pers.quan.sync;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题的方式三：lock锁---》JDK5.0新增
 *  Lock锁：-- ReentrantLock对象
 * 注意：如果同步代码有异常，要将unlock()写入finally语句块
 *
 * 1. 面试题：synchronized 与 Lock的异同？
 *    相同：二者都可以解决线程安全问题
 *    不同：synchronized机制在执行完相应的同步代码以后，自动的释放同步监视器
 *         Lock需要手动的启动同步（lock()），同时结束同步也需要手动的实现（unlock()）
 *
 * 2.优先使用顺序：
 *      Lock 同步代码块（已经进入了方法体，分配了相应资源）同步方法（在方法体之外）
 *
 * 面试题：如何解决线程安全问题？有几种方式
 */

public class Sync3 {

    public static void main(String[] args) {
        Win win = new Win();
        Thread t1 = new Thread(win);
        Thread t2 = new Thread(win);
        Thread t3 = new Thread(win);

        t1.setName("线程1");
        t2.setName("线程2");
        t3.setName("线程3");

        t1.start();
        t2.start();;
        t3.start();


    }
}

class Win implements Runnable {
    int ticket = 100;
    ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            try {
                lock.lock();  // 加锁
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ":" + "买票" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                lock.unlock(); // 解锁
            }


        }
    }
}
