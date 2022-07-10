package pers.quan.exer;

public class ThreadExer {

    public static void main(String[] args) {
        Exer e = new Exer();

        e.setName("Exer"); // 设置线程名
        e.start();

        int i1 = e.getPriority();
        System.out.println(i1);
        e.setPriority(Thread.MAX_PRIORITY);
        System.out.println("------");
        for(int i = 0;i<5;i++) {
            System.out.println("当前线程是：" + Thread.currentThread().getName() + ":" +i);
        }
    }

}

class Exer extends Thread {

    @Override
    public void run() {
    // 输出100以内的偶数
        for(int i = 0;i<100;i++) {
            if (i % 2 == 0) {
                System.out.println("当前线程：" +currentThread().getName()+":"+i);
            }
        }

    }
}


