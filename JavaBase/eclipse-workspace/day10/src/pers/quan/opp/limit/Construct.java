package pers.quan.opp.limit;

public class Construct {

	public static void main(String[] args) {
//		在创建对象的同时还会自动调用构造方法(这是在没有传入参数的情况下)如果参入了参数说明你不在使用new 默认的构造方法，此时需要你在类中定义一个构造方法
		
//		PersInfo s1 = new PersInfo();
//		有参的构造方法
//		PersInfo s1 = new PersInfo("宇宙超人");
//		s1.printName();
		
//		构造方法的重载
//		PersInfo s2 = new PersInfo();
		PersInfo s1 = new PersInfo("卫庄");
		PersInfo s2 = new PersInfo("卫庄",40);
		
		s2.printName();
		s1.printName();
	}
	
	
}

class PersInfo {
	String name;
	int age;
	PersInfo() {
		System.out.println("Student()....");		
	}
	PersInfo(String nickName) {
	
		name = nickName;	
	}
	PersInfo(String nickName , int a) {
		name = nickName;
		age = a;
	}
	
	
	
	void printName() {
//		System.out.println(name);
		System.out.println("我叫：" + name + "今年：" + age);
	}
}

