package pers.quan.opp.exer2;

public class AccountCustomerTest {
	public static void main(String[] args) {
		Customer cust1 = new Customer("Jane","Smith"); // �ͻ�
		Account acco1 = new Account(1000,2000,1.23); // �˻�
		// ����Ĺ�ϵ���ɿͻ�ȥ��Ǯ���˻�����
		cust1.setAccount(acco1);
		// ��������ʹ�ù��������δ����˻���Ϣ
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
