package pers.quan.sync;


public class SyncBlack2 {

//    通过同步方法解决线程不安全的问题
public static void main(String[] args) {

    //1. 继承的解决线程安全
//    Win1 w1 = new Win1();
//    Win1 w2 = new Win1();
//    Win1 w3 = new Win1();
//
//    w1.setName("线程1");
//    w2.setName("线程2");
//    w3.setName("线程3");
//
//    w1.start();
//    w2.start();
//    w3.start();


//    2.实现类解决线程安全
    Win2 w1 = new Win2();

    Thread thread1 = new Thread(w1);
    Thread thread2 = new Thread(w1);
    Thread thread3 = new Thread(w1);

    thread1.setName("线程1");
    thread2.setName("线程2");
    thread3.setName("线程3");

    thread1.start();
    thread2.start();
    thread3.start();


}

}

class Win2 implements Runnable {
    int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private synchronized void show(){
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ":" + "买票" + ticket);
            ticket--;
        }
    }
}


class Win1 extends  Thread {
    static int ticket = 100;

    @Override
    public void run() {
        while (true) {
        show();
        }
    }
    public static synchronized void show() {  // 默认的同步监视器 this。这里的this是w1,w2,w3,错误，需要加上static
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ":" + "买票" + ticket);
                ticket--;
            }
    }
}
