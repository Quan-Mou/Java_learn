package pers.quan.opp.exer3;

public class Account {
	private double balance; // ���

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		if (this.balance > amount) {
			this.balance -= amount;
			System.out.println("�ɹ�ȡ����" + amount + " �˻����Ϊ��" + this.balance);
		} else {
			System.out.println("���㣬ȡ��ʧ��");
		}
	} // ȡǮ
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance+=amount;
			System.out.println("��Ǯ�ɹ�");
		}
	} //��Ǯ
	
	Account(){
		
	}
	Account(double init_balance){
		this.balance = init_balance;
	}
}
 