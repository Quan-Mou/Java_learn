package pers.quan.opp.interFaceLearn;

// 接口
interface Test {
//	void attach();
//	void canch();
}




interface Compare1 {
	// 静态方法
	public static void methods1() {
		System.out.println("静态方法调用");
	}
	// 普通方法
	public default void methods2() {
		System.out.println("普通方法！");
	}
}
interface Compare2 {
	public default void methods2() {
		System.out.println("Compare2普通方法");
	}
}


class Quan extends Zhi implements Compare1,Compare2 {
	public void implementsFn() {
		// 如果同时实现了两个接口，并且这两个接口中有一个方法名是一样
		Compare1.super.methods2(); 
		Compare2.super.methods2();
		super.methods3();
	}
	
	public void methods2() {
		System.out.println("重写了接口普通方法");
	}
	
}

class Zhi {
	public void methods3() {
		System.out.println("父类methods3方法");
	}
}



interface Print {
	public void pName();
	public void pAge();
}


interface Flight {
	void flight();
}

class ImTest implements Test {
	public void attach() {
		System.out.println("攻击手段");
	}
	public void canch() {
		System.out.println("防御手段");
	}
}

class AllImTest implements Test,Print {
	public void attach() {
		System.out.println("攻擊");
	}
	public void canch() {
			System.out.println("防禦");
		}
	public void pName() {
		System.out.println("名字");
	}
	public void pAge() {
		System.out.println("年齡");
	}
}






