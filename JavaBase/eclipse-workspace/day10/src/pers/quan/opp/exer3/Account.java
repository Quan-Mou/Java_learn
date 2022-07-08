package pers.quan.opp.exer3;

public class Account {
	private double balance; // 余额

	public double getBalance() {
		return balance;
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
		if (amount > 0) {
			balance+=amount;
			System.out.println("存钱成功");
		}
	} //存钱
	
	Account(){
		
	}
	Account(double init_balance){
		this.balance = init_balance;
	}
}
 