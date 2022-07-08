package pers.quan.preject2;

public class CustomerList {
	private Customer cust[]; // 用户对象数组
	private int total; // 已保存用户对象的数量
	
	public static void main(String[] args) {
		CustomerList custList = new CustomerList(3);
		custList.addCustomer(new Customer("Curry",32,"男","123","123@qq.com"));
		custList.addCustomer(new Customer("卫庄",32,"男","123","123@qq.com"));
		Customer c1 = custList.getCustomer(1);
		System.out.println(c1.getName());
		Customer c2[] = custList.getAllCustomers();
		System.out.println(c2[0].getName());
		System.out.println(c2[1].getName());
		custList.deleteCustomer(0);
		System.out.println(c2[0]);
		
	}
	
	//添加客户
	CustomerList() {
		
	}
	
	public int getTotal() {
		return this.total;
	}
	// 用来初始化对象数组的大小构造器
	CustomerList(int totalCustomer) {
		cust = new Customer[totalCustomer];
	}
	//	添加客户
	public boolean addCustomer(Customer cust) {
		if (this.total < this.cust.length) {
			this.cust[total] = cust;
			this.total++;
			System.out.println("添加成功！");
			return true;
		} else {
			System.out.println("数组长度不够");
			return false;	
		}
	}
	public boolean replaceCustomer(int index,Customer cust) {
//		if (this.total < this.cust.length) {
//			this.cust[index] = cust;
//		} else if (this.cust[index] == null) {
//			return false;
//		}
//		return false;
		
		 if (index < 0 || index >= total) {
	            return false;
	        }
		 	this.cust[index] = cust;
	        return true;
	}
	
	//	删除指定index客户对象
	public boolean deleteCustomer(int index) {
		if (index < 0 || index >= total) {
			System.out.println("要删除的对象不存在！");
            return false;
        } else {
        	
//        	暂时删除了的为null
        	cust[index] = null;
        }
       
        return true;
//		return false;
	}
	// 返回数组所有客户对象
	public Customer[] getAllCustomers() {
		return cust;
	}
	
	public Customer getCustomer(int index) {
		
		return cust[index];
	}
	
	
	
	
	
	
	
	
	
	
	

	
	
}
