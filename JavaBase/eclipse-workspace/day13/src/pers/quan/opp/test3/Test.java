package pers.quan.opp.test3;

//public class Test {
//	public static void main(String[] args){
//		new Leaf(); 
//		//new Leaf();
//	}
//}
//
//
//
//class Root{
//	static{
//		System.out.println("Root 的静态初始化块");
//	}
//	{
//		System.out.println("Root 的普通初始化块");
//	}
//	public Root(){
//		System.out.println("Root 的无参数的构造器");
//	}
//}
//class Mid extends Root{
//	static{
//		System.out.println("Mid 的静态初始化块");
//	}
//	{
//		System.out.println("Mid 的普通初始化块");
//	}
//	public Mid(){
//		System.out.println("Mid 的无参数的构造器");
//	}
//	public Mid(String msg){
//		//通过 this 调用同一类中重载的构造器
//		this();
//		System.out.println("Mid 的带参数构造器，其参数值："
//			+ msg);
//	}
//}
//class Leaf extends Mid{
//	static{
//		System.out.println("Leaf 的静态初始化块");
//	}
//	{
//		System.out.println("Leaf 的普通初始化块");
//	}	
//	public Leaf(){
//		//通过 super 调用父类中有一个字符串参数的构造器
//		super("尚硅谷");
//		System.out.println("Leaf 的构造器");
//	}
//}


class Father {
	static {
		System.out.println("11111111111");
	}
	{
		System.out.println("22222222222");
	}

	public Father() {
		System.out.println("33333333333");

	}

}

public class Test extends Father {
	static {
		System.out.println("44444444444");
	}
	{
		System.out.println("55555555555");
	}
	public Test() {
		System.out.println("66666666666");
	}

	public static void main(String[] args) { // 由父及子 静态先行
		System.out.println("77777777777");
		System.out.println("************************");
		new Test();
		System.out.println("************************");

		new Test();
		System.out.println("************************");
		new Father();
	}

}





