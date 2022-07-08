package pers.quan.opp.innerClassLearn;

public class InnerClass {
	// 
	public static void main(String[] args) {
		Person  p = new Person();
		Person.Dog d = p.new Dog(); // 
		System.out.println(p.name);
		System.out.println(d.name);
		System.out.println(d.test());
		// ��̬�ڲ��࣬��Ҫnew���Ϳ���ʹ��
		Person.Loong L = new Person.Loong();
		System.out.println(L.name);
	}
}


class Person {
	String name = "��Ԫ��";
	private int age;
	
	
	
	//	��Ա�ڲ���
	class Dog {
		String name = "���ʽ�";
		public void methods() {
			System.out.println("�ڲ��෽��");
			
		}
		
		public String test() {
			System.out.println(name);
			System.out.println(Person.this.name);
			return name;
		}
	}
	
	// ��̬�ڲ���
	static class Loong  {
		String name = "hh";
		public String methods() {
			System.out.println("Static InnerClass��Loong");
			return name;
		}
	}
	
	
	
	// �ֲ��ڲ���
	public void methods() {
		class A {
			
		}
	}
	
	public Person() {
		class B {
			
		}
	}
	
	
	
	
}