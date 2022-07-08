package customerList;

import customer.Customer;
public class CustomerList {
	private Customer cust[]; // 用来保存客户对象的数组
	private int total; // 记录已保存客户对象的数量
	
//	public static void main(String[] args) {
//		CustomerList cust1 = new CustomerList(5);
//		cust1.addCustomer(new Customer("张三",'男',18,"18279407034","qq231@163.com"));
//		cust1.addCustomer(new Customer("张三",'男',18,"18279407034","qq231@163.com"));
//		cust1.addCustomer(new Customer("张三",'男',18,"18279407034","qq231@163.com"));
//		cust1.replaceCustomer(0, new Customer("lisi",'男',18,"18279407034","qq231@163.com"));
//		cust1.deleteCustomer(3);
//
//	}
	
//	初始化 Customers数组大小
	public CustomerList(int totalCustomer) {
		cust = new Customer[totalCustomer];
	}
	
	/**
	 * 添加客户
	 * @param customer
	 * @return true:添加成功 false:表示数组已满添加失败
	 */
	public boolean addCustomer(Customer customer) {
		if (total < cust.length) {
			cust[total] = customer;
			total++;
			System.out.println("添加成功");
			return true;
		} 
		return false;
	}
	
	/***
	  * 修改客户
	  * @param index
	  * @return 替换成功返回true；false表示索引无效，无法替换
	  */
	public boolean replaceCustomer(int index, Customer cust) {
		if (index > this.total || index < 0 ) {
			return false;
		}
		
		this.cust[index] =cust;
		return true;
	}
	
	/**
	 * 删除客户
	 * @param index
	 * @return 删除成功返回true；false表示索引无效，无法删除

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
	 * 返回所有Customer对象
	 * @return
	 */
	public Customer[] getAllCustomers() {
		return this.cust;
	}
	/**
	 * 
	 * @param index
	 * @return 返回指定索引的customer对象
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
