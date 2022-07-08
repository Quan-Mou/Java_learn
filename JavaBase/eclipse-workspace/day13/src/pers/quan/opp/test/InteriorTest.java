package pers.quan.opp.test;

public class InteriorTest {
	private int num = 10;
	
	// 
	public void test() {
		Demo d1 = new Demo();
		d1.show();
	}
	
	// 内部类
	class Demo {
		void show() {
			// 内部类可以方法外部类
			System.out.println("num" + num);
		}
	}
	
	// 方法内部类
	public void fnInterior() {
		class fnClass {
			void show() {
				// 方法内部类也可以方法外部类成员
				System.out.println("num:" + num);
			}
		}
		
		fnClass fnC1 = new fnClass();
		fnC1.show();
	}
	
	//	静态内部类
//	静态内部类同样可以在不创建外部类对象时调用内部类成员
	
}


class Test{
	Test() {
		System.out.println("构造方法一被调用了");
	}
	Test(int x ) {
		this();
		System.out.println("构造方法二被调用了");
	}
	Test(boolean b) {
		this(1);
		System.out.println("构造方法三被调用了");
	}
}

class FDemo{ 
	final String name = "zhas";
}



