package pers.quan.java;
public class ThreadSet2 {
    public static void main(String[] args) {
        Win w = new Win();
        Thread t1 =  new Thread(w);

        t1.setName("线程1：");
        t1.start();
    }
}

//通过实现类实现runnable接口的方式
class Win implements Runnable {
    @Override
    public void run() {
    for(int i = 0;i<10;i++) {
        System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}