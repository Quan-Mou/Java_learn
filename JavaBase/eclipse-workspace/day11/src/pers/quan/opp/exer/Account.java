package pers.quan.opp.exer;

public class Account {
	private int id; // �˻�
	private double balance;// ���
	private double annualInterestRate; // ������
	
	public Account (int id, double balance, double annualInterestRate ) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		System.out.println("����account");
		
	}

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

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	//	����������
	public double getMonthlyInterest() {
		return 1.10;
	}
	// ȡ���	
	public void withdraw (double amount) {
		if (amount > this.balance) {
			System.out.println("����");
			return;
		}
		this.balance -= amount;
		System.out.println("�ɹ�ȡ�����˻����Ϊ��" + this.balance);
	}
	// ����
	public void deposit (double amount) {
		
	}
}


	
