package pers.quan.opp.exer3;

public class Bank {
	private Customer customers[]; // 客户数组
	private int numberOfCustomer;  // 客户数量
	Bank() {
		customers = new Customer[10];
	}
	public void addCustomer(String f,String l) { // 添加客户
		Customer cust1 = new Customer(f,l);
		customers[numberOfCustomer] = cust1;
		numberOfCustomer++;
	}
	public Customer getCustomer(int index) { // 获取指定索引客户
//		System.out.println(this);
//		return null;
		// return customers[index];//可能报异常
	if (index >= 0 && index < numberOfCustomer) {
		return customers[index];
	}
	System.out.println("索引不存在");
	return null;
	}
	public int getNumberOfCustomer() { // 获取客户数量
		return numberOfCustomer;
	}
	
	
}
 