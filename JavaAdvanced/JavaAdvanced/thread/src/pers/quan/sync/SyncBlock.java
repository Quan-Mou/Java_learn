package pers.quan.sync;

public class SyncBlock {

    // 同步代码块解决线程不安全（例如买票）
    public static void main(String[] args) {

//        1.使用继承的方式解决多线程不安全的问题
//        Ticket t1 = new Ticket();
//        Ticket t2 = new Ticket();
//        t1.setName("线程1");
//        t2.setName("线程2");
//        t1.start();
//        t2.start();

//        2.使用实现类实现runnable接口的方式解决多线程不安全
        Ticket2 t1 = new Ticket2();
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t1);
        Thread th3 = new Thread(t1);

        th1.setName("线程1");
        th2.setName("线程2");
        th3.setName("线程3");

        th1.start();
        th2.start();
        th3.start();


    }


}

class Ticket2 implements Runnable {
    int ticket = 100;
    @Override
    public void run() {
           while (true) {
                synchronized (this) {  // 此时的this是同一个对象
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (ticket > 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + "买票" + ticket);
                        ticket--;
                    } else {
                        break;
                    }
                }
           }
    }
}




//使用继承的方式解决多线程不安全的问题
class Ticket extends Thread{

     static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (Ticket.class) {
                if (ticket > 0) {
//                try {
//                    sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }


                    System.out.println(currentThread().getName() + ":" + "买票" + ticket);
                    ticket--;

                } else {
                    break;

                }
            }
        }
    }
}


