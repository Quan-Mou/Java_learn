package pers.quan.opp.exer;

public class Account {
	private int id; // 账户
	private double balance;// 余额
	private double annualInterestRate; // 月利率
	
	public Account (int id, double balance, double annualInterestRate ) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		System.out.println("调用account");
		
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
	//	返回月利率
	public double getMonthlyInterest() {
		return 1.10;
	}
	// 取款方法	
	public void withdraw (double amount) {
		if (amount > this.balance) {
			System.out.println("余额不足");
			return;
		}
		this.balance -= amount;
		System.out.println("成功取出，账户余额为：" + this.balance);
	}
	// 存款方法
	public void deposit (double amount) {
		
	}
}


	
