package pers.quan.opp.exer;

public class CheckAccountTest {
	public static void main(String[] args) {
		CheckAccount check = new CheckAccount(1122,20000,4.5,5000);
		check.withdraw(5000);
		System.out.println("�˻���" + check.getBalance());
		System.out.println("��͸֧��" + check.overfraft);
		System.out.println();
		check.withdraw(18000);
		System.out.println("�˻���" + check.getBalance());
		System.out.println("��͸֧��" + check.overfraft);
		System.out.println();
		check.withdraw(3000);
		System.out.println("�˻���" + check.getBalance());
		System.out.println("��͸֧��" + check.overfraft);
	}
}
