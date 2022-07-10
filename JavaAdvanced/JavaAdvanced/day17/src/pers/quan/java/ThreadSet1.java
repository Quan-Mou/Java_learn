package pers.quan.java;
public class ThreadSet1 {
    public static void main(String[] args) {
//    2.子类重写thread中run方法
//    3.子类对象运行start():吃方法会自动调用run();不可以越过start直接调用run
//        ThreadD1 t1 = new ThreadD1("ThreadD1");
//        t1.start();
//        System.out.println(Thread.currentThread().getName() + "main");

//      注意：
//        t1.start(); //一个线程对象不可以多次调用，需要再创建一个线程对象。

//        for(int i = 0;i<20;i++) {
//            System.out.println(Thread.currentThread().getName() + ":"+ i);
//        }



        System.out.println("-----join()------");
        Demo new1 = new Demo();
        new1.setName("Demo");
        new1.start();

        for(int key = 0; key < 20; key++) {
            System.out.println(Thread.currentThread().getName() + ":" + key);
            if (key == 5) {
                try {
                    new1.join();
                    // a线程在b线程中调用a线程的join;b线程开始阻塞，等到a线程执行完毕（阻塞结束）再执行b线程
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

//    1.使用继承thread类的方式创建多线程
class ThreadD1 extends Thread {
    public ThreadD1(String name) {
        super(name);
    }

    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName() +"启动了一个线程");

        // Thread 类有关的方法：
        // start() 启动线程
        // run() 通常要重写的方法。里面是在这个线程要执行的代码。
        // currentThread() 静态方法返回当前代码执行的线程
        // getName() 获取当前线程的名字
        // setName() 设置当前线程的名字
        // yield(); 释放当前线程的执行权、
        // join() // 阻塞线程；a线程在b线程中调用a线程的join;b线程开始阻塞，等到a线程执行完毕（阻塞结束）再执行b线程
        // sleep(int n) // 阻塞当前线程的执行，参数为毫秒，阻塞过程中该线程不再执行


        for(int i =0 ;i<20;i++) {
            if (i % 2 == 0) {
//                yield();
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(currentThread().getName() + ":" + i);
        }
    }
}

class Demo extends Thread {
    @Override
    public void run() {
        for(int i = 0;i<20;i++){
            System.out.println(currentThread().getName() + i);
        }
    }
}