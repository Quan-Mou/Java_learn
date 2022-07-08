package customerList;

import customer.Customer;
public class CustomerList {
	private Customer cust[]; // ��������ͻ����������
	private int total; // ��¼�ѱ���ͻ����������
	
//	public static void main(String[] args) {
//		CustomerList cust1 = new CustomerList(5);
//		cust1.addCustomer(new Customer("����",'��',18,"18279407034","qq231@163.com"));
//		cust1.addCustomer(new Customer("����",'��',18,"18279407034","qq231@163.com"));
//		cust1.addCustomer(new Customer("����",'��',18,"18279407034","qq231@163.com"));
//		cust1.replaceCustomer(0, new Customer("lisi",'��',18,"18279407034","qq231@163.com"));
//		cust1.deleteCustomer(3);
//
//	}
	
//	��ʼ�� Customers�����С
	public CustomerList(int totalCustomer) {
		cust = new Customer[totalCustomer];
	}
	
	/**
	 * ��ӿͻ�
	 * @param customer
	 * @return true:��ӳɹ� false:��ʾ�����������ʧ��
	 */
	public boolean addCustomer(Customer customer) {
		if (total < cust.length) {
			cust[total] = customer;
			total++;
			System.out.println("��ӳɹ�");
			return true;
		} 
		return false;
	}
	
	/***
	  * �޸Ŀͻ�
	  * @param index
	  * @return �滻�ɹ�����true��false��ʾ������Ч���޷��滻
	  */
	public boolean replaceCustomer(int index, Customer cust) {
		if (index > this.total || index < 0 ) {
			return false;
		}
		
		this.cust[index] =cust;
		return true;
	}
	
	/**
	 * ɾ���ͻ�
	 * @param index
	 * @return ɾ���ɹ�����true��false��ʾ������Ч���޷�ɾ��

	 */
	public boolean deleteCustomer(int index) {
		index -=1;
		if (index > this.total || index < 0) {
			return false;
		}
		for(int i = index; i< this.cust.length -1;i++) {
			this.cust[i] = this.cust[i+1];			
		}
		this.total--;
		this.cust[this.cust.length -1 ] = null;
		return true;
	}
	/**
	 * ��������Customer����
	 * @return
	 */
	public Customer[] getAllCustomers() {
		return this.cust;
	}
	/**
	 * 
	 * @param index
	 * @return ����ָ��������customer����
	 */
	public Customer getCustomer(int index) {
		if (index > this.total || index < 0 ) {
			return null;
		}
		return this.cust[index];
	}
	public int getTotal() {
		return this.total;
	}

}
