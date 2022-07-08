package pers.quan.opp.exer2;

public class AccountCustomerTest {
	public static void main(String[] args) {
		Customer cust1 = new Customer("Jane","Smith"); // 客户
		Account acco1 = new Account(1000,2000,1.23); // 账户
		// 这里的关系是由客户去存钱到账户里面
		cust1.setAccount(acco1);
		// 下面三步使用构造器传参传入账户信息
//		cust1.getAccount().setId(1000);
//		cust1.getAccount().setBalance(2000);;
//		cust1.getAccount().setAnnuallnterestRate(1.23);
		
		
		cust1.getAccount().deposit(100);
		cust1.getAccount().withdraw(960);
		cust1.getAccount().withdraw(2000);
		
		System.out.println("Customer [" + cust1.getLastName() + "," + cust1.getFirstName() + "] has a" +
		"account: id is " + acco1.getId() + "," + " annualInterestRate is " + acco1.getAnnuallnterestRate()  +"%," +
		"balance is " + acco1.getBalance()
				);
		
	}
}
