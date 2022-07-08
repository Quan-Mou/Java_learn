package pers.quan.opp.test3;

public class SingletonTest1 {
	// 单例模式：保证这个类中只有一个对象
	
	public static void main(String[] args) {
		Obj ret1 = Obj.getObj();
		Obj ret2 = Obj.getObj();
		System.out.println(ret1 == ret2);
	}
	
	
	
}

//饿汉式
class Obj {
//	private Obj() {
//		
//	}
//	
//	
////	创建对象、私有化
//	private static Obj qh = new Obj();
//	
//	
////	获取对象
//	
//	public static Obj getObj() {
//		return qh;
//	}
//	
//	
//	
	
	
	
	
	
	private Obj() {
		
	}
	
	private static Obj o1 = new Obj();
	
	
	public static Obj getObj() {
		return o1;
	}
	
	
	
}
