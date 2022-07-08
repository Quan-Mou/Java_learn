package pers.quan.opp.exer;

public class CheckAccountTest {
	public static void main(String[] args) {
		CheckAccount check = new CheckAccount(1122,20000,4.5,5000);
		check.withdraw(5000);
		System.out.println("’Àªß”‡∂Ó£∫" + check.getBalance());
		System.out.println("ø…Õ∏÷ß”‡∂Ó£∫" + check.overfraft);
		System.out.println();
		check.withdraw(18000);
		System.out.println("’Àªß”‡∂Ó£∫" + check.getBalance());
		System.out.println("ø…Õ∏÷ß”‡∂Ó£∫" + check.overfraft);
		System.out.println();
		check.withdraw(3000);
		System.out.println("’Àªß”‡∂Ó£∫" + check.getBalance());
		System.out.println("ø…Õ∏÷ß”‡∂Ó£∫" + check.overfraft);
	}
}
