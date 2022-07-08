package pers.quan.opp;

public class Limit {
	private String name;
	protected int age;
	float height;
	public String sex;
	
	
	
	private void skill() {
		System.out.println("百步飞剑");
	}
	
	protected void eat() {
		System.out.println("我会吃饭");
	}
	void printAge() {
		System.out.println(age);
	}
	
	public void printName() {
		System.out.println(name);
	}
}

