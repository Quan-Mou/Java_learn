package pers.quan.exer;

/**
 * 银行有一个账户。
 * 有两个储户分别向同一个账户存3000元，每次存1000，存3次。
 * 每次存完打印账户余额。
 *
 * 分析：
 *      1.是否是多线程问题？是，两个储户线程
 *      2.是否有共享数据？有，账户（或账户余额）
 *      3.是否有线程安全问题？有
 *      4.需要考虑如何解决线程安全问题？同步机制：有三种方式。
 */

public class AccountTest {
    public static void main(String[] args) {
//        1.Runnable接口
//        Account account = new Account(0);
//        Custommer c1 = new Custommer(account);
//
//        Thread thread1 = new Thread(c1);
//        Thread thread2 = new Thread(c1);
//
//        thread1.setName("线程1");
//        thread2.setName("线程2");
//
//        thread1.start();
//        thread2.start();

        System.out.println("----------------");

//        繼承
        Account2 a = new Account2(0);

        Custommer2 cu1 = new Custommer2(a);
        Custommer2 cu2 = new Custommer2(a);

        cu1.setName("cu1线程");
        cu2.setName("cu2线程");

        cu1.start();
        cu2.start();

    }

}

class Account2  {
    private double balance;
    public Account2(double num) {
        this.balance = num;
    }

    public synchronized void deposit(int balance) {
        this.balance += balance;
        System.out.println(Thread.currentThread().getName() + "存了:" + balance + "余额：" + this.balance);
    }

    public double getBalance() {
        return balance;
    }

}

class Custommer2 extends Thread{
    Account2 acc;
    public Custommer2(Account2 acc) {
        this.acc = acc;
    }
    @Override
    public void run() {
        for(int i = 0;i<3;i++) {
            if (this.acc.getBalance() >= 0) {
                this.acc.deposit(1000);
            }
        }
    }
}


class Account{

    private double balance;

    public Account(double num) {
        this.balance = num;
    }

    public synchronized void deposit(double balance) {
        this.balance+=balance;
        System.out.println(Thread.currentThread().getName() + "存了:" + balance + "余额：" + this.balance);
    }

    public double getBalance() {
        return balance;
    }

}

class Custommer implements Runnable{
    Account account;
    public Custommer(Account acc) {
        this.account = acc;
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            if (this.account.getBalance() >= 0) {
                account.deposit(1000);
            }
        }
    }
}