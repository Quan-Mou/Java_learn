package pers.quan.opp.test3;

public class BlockTest {
	public static void main(String[] args) {
		Person.eat();
		Person p1 = new Person();
		
	}
}

class Person {
	int age;
	String name;
	
	static void eat() {
		System.out.println("�Է�");
	}
	
	static {
		System.out.println("static �����1");
	}
	
	{
		System.out.println("��static �����1");
	}
	
}