package pers.quan.opp.innerClassLearn;

public class InnerClass {
	// 
	public static void main(String[] args) {
		Person  p = new Person();
		Person.Dog d = p.new Dog(); // 
		System.out.println(p.name);
		System.out.println(d.name);
		System.out.println(d.test());
		// 静态内部类，不要new它就可以使用
		Person.Loong L = new Person.Loong();
		System.out.println(L.name);
	}
}


class Person {
	String name = "李元芳";
	private int age;
	
	
	
	//	成员内部类
	class Dog {
		String name = "狄仁杰";
		public void methods() {
			System.out.println("内部类方法");
			
		}
		
		public String test() {
			System.out.println(name);
			System.out.println(Person.this.name);
			return name;
		}
	}
	
	// 静态内部类
	static class Loong  {
		String name = "hh";
		public String methods() {
			System.out.println("Static InnerClass：Loong");
			return name;
		}
	}
	
	
	
	// 局部内部类
	public void methods() {
		class A {
			
		}
	}
	
	public Person() {
		class B {
			
		}
	}
	
	
	
	
}