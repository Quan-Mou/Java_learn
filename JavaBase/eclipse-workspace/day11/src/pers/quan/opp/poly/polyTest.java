package pers.quan.opp.poly;

public class polyTest {
	public static void main(String[] args) {
		Person p1 = new Man();
		// 当父类调动子类同名的方法时，实际执行的是子类重写的方法。
		p1.eat();
//		System.out.println(p1.name);
		
//		向下转型
		Man m1 = (Man)p1;
		System.out.println(m1.name);
//		boolean isObj = m1 instanceof Woman;
//		System.out.println(isObj);
		
		Person p2 = new Woman();
		Man m2 = (Man)p2;
		System.out.println(m2.name);
	}
	
}
