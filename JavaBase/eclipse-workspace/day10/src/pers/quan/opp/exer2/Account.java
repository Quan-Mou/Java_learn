package pers.quan.opp.exer2;

public class Account {
	private int id; // �˻�
	private double balance; // ���
	private double annuallnterestRate; // ������
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnuallnterestRate() {
		return annuallnterestRate;
	}
	public void setAnnuallnterestRate(double annuallnterestRate) {
		this.annuallnterestRate = annuallnterestRate;
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
		if(amount > 0) {
			this.balance += amount;
			System.out.println("�ɹ����룺" + amount + " �˻����Ϊ��" + this.balance);
		} else {
			System.out.println("������Ϸ�������@��");
		}
	} //��Ǯ
	
	Account(){
		
	}
	Account(int id, double balance,double annuallnterestRate){
		this.id = id;
		this.balance = balance;
		this.annuallnterestRate = annuallnterestRate;
	}
}
 