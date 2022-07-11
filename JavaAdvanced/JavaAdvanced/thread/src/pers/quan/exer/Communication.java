package pers.quan.exer;

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
    int num = 1;
    @Override
    public void run() {
           while (num <100){
               synchronized (this) {
               notify();
               System.out.println(Thread.currentThread().getName() + ": " + num);
               num++;
                   try {
                       wait();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
           }

    }
}
