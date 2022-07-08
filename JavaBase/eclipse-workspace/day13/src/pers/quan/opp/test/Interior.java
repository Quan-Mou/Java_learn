package pers.quan.opp.test;

public class Interior {
	public static void main(String[] args) {
		InteriorTest i1 = new InteriorTest();
		
//		外部类访问内部类
//		外部类名.内部类名 变量名 = new 外部类名().new 内部类名();
		InteriorTest.Demo d1 = new InteriorTest().new Demo();
		
		d1.show();
		
		InteriorTest d2 = new InteriorTest();
		d2.fnInterior();
		
		Test t1  = new Test(true);
		
		FDemo fd1 = new FDemo();
		
		System.out.println(fd1.name);
		
	}
}
