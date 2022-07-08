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
		System.out.println("CustomerView构造器执行了");
		
		Customer Newcust = new Customer("张三", 30,"男", "1151511215", "abs@163.com");
		customerLIst.addCustomer(Newcust);
	}
	
	public void enterMainMenu() {
		do {
			System.out.println("-----------------客户信息管理软件-----------------");
			System.out.println("\t\t 1 添加客户");
			System.out.println("\t\t 2 修改客户");
			System.out.println("\t\t 3 删除客户");
			System.out.println("\t\t 4 客户列表");
			System.out.println("\t\t 5 退     出");
			System.out.println();
			System.out.println("\t\t 请选择(1-5) ：");
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
				System.out.println("退出程序");
				break;
			default:
				break;
			}
			if(UserInput == '5') {
				System.out.println("退出了程序");
				break;
			}
			
			
		} while(true);
	}
	// 添加客户
	public void addNewCustomer() {
		System.out.println("---------------------添加客户---------------------");
		System.out.print("姓名：");
		String name = Util.readString(4);
		System.out.print("年龄：");
		int age = Util.readInt();
		System.out.print("性别：");
		String sex = Util.readString(2);
		System.out.print("电话：");
		String phone = Util.readString(13);
		System.out.print("邮箱：");
		String email = Util.readString(13);
		System.out.println("---------------------添加完成---------------------");
		customerLIst.addCustomer(new Customer(name,age,sex,phone,email));
	}
	//修改客户
	public void modifyCustomer() {
		System.out.print("姓名：");
		String name = Util.readString(4);
		System.out.print("年龄：");
		int age = Util.readInt();
		System.out.print("性别：");
		String sex = Util.readString(2);
		System.out.print("电话：");
		String phone = Util.readString(13);
		System.out.print("邮箱：");
		String email = Util.readString(13);
		
		
	}
	// 删除客户
	public void deleteCustomer() {
		System.out.println("删除客户");
	}
	// 显示客户
	public void listAllCustomer() {
		Customer cust[] = customerLIst.getAllCustomers();
//				
		System.out.println("---------------------客户列表---------------------");
		System.out.println("编号\t姓名\t年龄\t性别\t电话\t\t邮箱");
		System.out.println(customerLIst.getTotal());
		for(int i = 0;i<customerLIst.getTotal();i++) {
			System.out.println((i+1)+"\t"+ cust[i].getName() +"\t"+cust[i].getSex()+
								"\t"+cust[i].getAge()+ "\t"+cust[i].getPhone()+"\t"+
								cust[i].getEmail());
		}

		System.out.println("---------------------显示客户---------------------");
	}
	
	
//	public void CustomerUi() {
//		
//	}
}
