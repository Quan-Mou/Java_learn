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
		System.out.println("³Ô·¹");
	}
	
	static {
		System.out.println("static ´úÂë¿é1");
	}
	
	{
		System.out.println("·Çstatic ´úÂë¿é1");
	}
	
}