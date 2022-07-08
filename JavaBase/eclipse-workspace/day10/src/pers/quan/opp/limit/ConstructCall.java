package pers.quan.opp.limit;

public class ConstructCall {
	public static void main(String[] args) {
		Person p1 = new Person("Curry",32);
		System.out.println(p1.age);
	}
}

class Person {
	String name;
	int age;
	
	Person() {
		System.out.println("ÎÞ²ÎPerson....");
	}
	Person(int age) {   
		this();
		this.age = age;
	}
	
	Person(String name,int age){
		this(age);
		this.name = name;
	}
	
}
