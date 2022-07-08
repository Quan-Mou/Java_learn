package pers.quan.opp.exer;

public class CheckAccount extends Account{
	double overfraft; // ͸֧���
	public CheckAccount(int id,double balance,double annualInterestRte,double overfraft) {
		super(id,balance,annualInterestRte);
		this.overfraft = overfraft;
	}
	
	// ��д
	public void withdraw (double amount) { 
		if(amount < super.getBalance()) {
			setBalance(getBalance() - amount); 
		} else if (overfraft >= amount - getBalance()) {
			 overfraft = overfraft - (amount - getBalance());
			 setBalance(0);
		} else {
			System.out.println("��Ȳ���");
		}
	}
}
