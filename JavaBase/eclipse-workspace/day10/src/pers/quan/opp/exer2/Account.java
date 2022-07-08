package pers.quan.opp.exer2;

public class Account {
	private int id; // 账户
	private double balance; // 余额
	private double annuallnterestRate; // 年利率
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
			System.out.println("成功取出：" + amount + " 账户余额为：" + this.balance);
		} else {
			System.out.println("余额不足，取款失败");
		}
	} // 取钱
	
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
			System.out.println("成功存入：" + amount + " 账户余额为：" + this.balance);
		} else {
			System.out.println("请输入合法的数字@！");
		}
	} //存钱
	
	Account(){
		
	}
	Account(int id, double balance,double annuallnterestRate){
		this.id = id;
		this.balance = balance;
		this.annuallnterestRate = annuallnterestRate;
	}
}
 