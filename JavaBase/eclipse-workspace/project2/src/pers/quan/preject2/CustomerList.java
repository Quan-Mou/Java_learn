package pers.quan.preject2;

public class CustomerList {
	private Customer cust[]; // �û���������
	private int total; // �ѱ����û����������
	
	public static void main(String[] args) {
		CustomerList custList = new CustomerList(3);
		custList.addCustomer(new Customer("Curry",32,"��","123","123@qq.com"));
		custList.addCustomer(new Customer("��ׯ",32,"��","123","123@qq.com"));
		Customer c1 = custList.getCustomer(1);
		System.out.println(c1.getName());
		Customer c2[] = custList.getAllCustomers();
		System.out.println(c2[0].getName());
		System.out.println(c2[1].getName());
		custList.deleteCustomer(0);
		System.out.println(c2[0]);
		
	}
	
	//��ӿͻ�
	CustomerList() {
		
	}
	
	public int getTotal() {
		return this.total;
	}
	// ������ʼ����������Ĵ�С������
	CustomerList(int totalCustomer) {
		cust = new Customer[totalCustomer];
	}
	//	��ӿͻ�
	public boolean addCustomer(Customer cust) {
		if (this.total < this.cust.length) {
			this.cust[total] = cust;
			this.total++;
			System.out.println("��ӳɹ���");
			return true;
		} else {
			System.out.println("���鳤�Ȳ���");
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
	
	//	ɾ��ָ��index�ͻ�����
	public boolean deleteCustomer(int index) {
		if (index < 0 || index >= total) {
			System.out.println("Ҫɾ���Ķ��󲻴��ڣ�");
            return false;
        } else {
        	
//        	��ʱɾ���˵�Ϊnull
        	cust[index] = null;
        }
       
        return true;
//		return false;
	}
	// �����������пͻ�����
	public Customer[] getAllCustomers() {
		return cust;
	}
	
	public Customer getCustomer(int index) {
		
		return cust[index];
	}
	
	
	
	
	
	
	
	
	
	
	

	
	
}
