package pers.quan.opp.exer3;

public class Bank {
	private Customer customers[]; // �ͻ�����
	private int numberOfCustomer;  // �ͻ�����
	Bank() {
		customers = new Customer[10];
	}
	public void addCustomer(String f,String l) { // ��ӿͻ�
		Customer cust1 = new Customer(f,l);
		customers[numberOfCustomer] = cust1;
		numberOfCustomer++;
	}
	public Customer getCustomer(int index) { // ��ȡָ�������ͻ�
//		System.out.println(this);
//		return null;
		// return customers[index];//���ܱ��쳣
	if (index >= 0 && index < numberOfCustomer) {
		return customers[index];
	}
	System.out.println("����������");
	return null;
	}
	public int getNumberOfCustomer() { // ��ȡ�ͻ�����
		return numberOfCustomer;
	}
	
	
}
 