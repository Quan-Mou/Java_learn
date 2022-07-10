package pers.quan.exer;

public class Ticket {

    public static void main(String[] args) {
        TicketSyso w1 = new TicketSyso();
        TicketSyso w2 = new TicketSyso();
        TicketSyso w3 = new TicketSyso();
// * 存在线程的安全问题，待解决。
        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }


    // 假如三个人去买票（有100张）。
}

class TicketSyso extends Thread {
    static int ticketNum = 100;
    @Override
    public void run() {
        for(int i = ticketNum;i>0;i--) {
            System.out.println(currentThread().getName()+"买票" + "第" +i + "张");
        }
    }

}




