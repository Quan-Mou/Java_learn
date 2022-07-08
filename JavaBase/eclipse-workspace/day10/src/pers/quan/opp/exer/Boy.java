package pers.quan.opp.exer;


public class Boy {
	String name;
	int age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void marry(Girl girl) {
		System.out.println("我想娶的是" + girl.getName());
		girl.marry((this));
	}
	public void shout() {
		if (this.age >= 22) {
			System.out.println("合法结婚年龄");
		} else {
			System.out.println("~~~~~~");
		}
	}
	Boy(String name) {
		this.name =name;
	}
	Boy(String name,int age) {
		this.name =name;
		this.age= age;
	}
	
}