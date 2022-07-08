package pers.quan.opp.exer3;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addCustomer("Stephen", "Curry");
		
//		bank.getCustomer(0)°£
bank.getCustomer(0).setAccount(new Account(2000)); // ¥Ê«Æ
		
bank.getCustomer(0).getAccount().withdraw(1900); // »°«Æ
	
	}
	
}
