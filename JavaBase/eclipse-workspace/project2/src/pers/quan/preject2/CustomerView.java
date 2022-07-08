package pers.quan.preject2;

import java.util.Scanner;

public class CustomerView {
	
	CustomerList customerLIst = new CustomerList(10);
	
	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		
		Util util = new Util();
		view.enterMainMenu();
		
		
		
	}
	
	CustomerView() {
		System.out.println("CustomerView������ִ����");
		
		Customer Newcust = new Customer("����", 30,"��", "1151511215", "abs@163.com");
		customerLIst.addCustomer(Newcust);
	}
	
	public void enterMainMenu() {
		do {
			System.out.println("-----------------�ͻ���Ϣ�������-----------------");
			System.out.println("\t\t 1 ��ӿͻ�");
			System.out.println("\t\t 2 �޸Ŀͻ�");
			System.out.println("\t\t 3 ɾ���ͻ�");
			System.out.println("\t\t 4 �ͻ��б�");
			System.out.println("\t\t 5 ��     ��");
			System.out.println();
			System.out.println("\t\t ��ѡ��(1-5) ��");
			char UserInput = Util.readMenuSelection();
			switch (UserInput) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomer();
				break;
			case '5':
				System.out.println("�˳�����");
				break;
			default:
				break;
			}
			if(UserInput == '5') {
				System.out.println("�˳��˳���");
				break;
			}
			
			
		} while(true);
	}
	// ��ӿͻ�
	public void addNewCustomer() {
		System.out.println("---------------------��ӿͻ�---------------------");
		System.out.print("������");
		String name = Util.readString(4);
		System.out.print("���䣺");
		int age = Util.readInt();
		System.out.print("�Ա�");
		String sex = Util.readString(2);
		System.out.print("�绰��");
		String phone = Util.readString(13);
		System.out.print("���䣺");
		String email = Util.readString(13);
		System.out.println("---------------------������---------------------");
		customerLIst.addCustomer(new Customer(name,age,sex,phone,email));
	}
	//�޸Ŀͻ�
	public void modifyCustomer() {
		System.out.print("������");
		String name = Util.readString(4);
		System.out.print("���䣺");
		int age = Util.readInt();
		System.out.print("�Ա�");
		String sex = Util.readString(2);
		System.out.print("�绰��");
		String phone = Util.readString(13);
		System.out.print("���䣺");
		String email = Util.readString(13);
		
		
	}
	// ɾ���ͻ�
	public void deleteCustomer() {
		System.out.println("ɾ���ͻ�");
	}
	// ��ʾ�ͻ�
	public void listAllCustomer() {
		Customer cust[] = customerLIst.getAllCustomers();
//				
		System.out.println("---------------------�ͻ��б�---------------------");
		System.out.println("���\t����\t����\t�Ա�\t�绰\t\t����");
		System.out.println(customerLIst.getTotal());
		for(int i = 0;i<customerLIst.getTotal();i++) {
			System.out.println((i+1)+"\t"+ cust[i].getName() +"\t"+cust[i].getSex()+
								"\t"+cust[i].getAge()+ "\t"+cust[i].getPhone()+"\t"+
								cust[i].getEmail());
		}

		System.out.println("---------------------��ʾ�ͻ�---------------------");
	}
	
	
//	public void CustomerUi() {
//		
//	}
}
