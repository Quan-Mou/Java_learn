package pers.quan.exer;

import java.util.concurrent.locks.ReentrantLock;

public class Communication {

    public static void main(String[] args) {
        Show s = new Show();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();

    }
}

class Show implements Runnable{



     int number = 1;


    @Override
    public void run() {

        while (true){
            synchronized (this) {
                notify();
                if(number <= 100){
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;
                    try {
                        //使得调用如下wait()方法的线程进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else{
                    break;
                }
            }
        }



    }


}
