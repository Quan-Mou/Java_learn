package pres.quan.opplearn;

public class Opp {
	public static void main(String [] args) {
		Person p1 = new Person();
		p1.name = "QuanMou";
		System.out.println(p1.name);
		
		p1.skill();
		
		Person p2 = new Person();
		p2.name ="hanfei";
		System.out.println(p2.name);
		Person p3 = p2;
		p3.name = "zhangliang";
		System.out.println(p2.name);
		System.out.println(p3.name);
		
		
	}
}

class Person {
	String name;
	int age = 1;
	boolean isMale;
	
	public void skill() {
		System.out.println("ºá¹á°Ë·½£¡£¡");
	}
}