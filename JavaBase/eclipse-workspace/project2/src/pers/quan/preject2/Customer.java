package pers.quan.preject2;

public class Customer {
	private String name; // 姓名
	private int age; // 年龄、
	private String sex; // 性别
	private String phone; // 电话
	private String email; // 邮箱
	
	public static void main(String[] args) {
		Customer cust = new Customer();
		
	}
	
	Customer() {
		
	}
	Customer(String name,int age, String sex,String phone,String email) {
		this.name= name;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void sexAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email; 
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
