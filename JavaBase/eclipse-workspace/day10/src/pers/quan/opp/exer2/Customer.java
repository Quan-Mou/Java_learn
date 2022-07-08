package pers.quan.opp.exer2;

public class Customer {
	private String firstName;
	private String lastName;
	private Account account;
	Customer() {
		
	}
	Customer(String f,String l) {
		firstName = f;
		lastName = l;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	
}
