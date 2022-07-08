package pers.quan.opp.test3;

public class SingletonTest2 {
	
	public static void main(String[] args) {
		TowDemo t1 = TowDemo.getTowDemo();
		TowDemo t2 = TowDemo.getTowDemo();
		
		System.out.println(t1 == t2);
	}
	

}

//懒汉式单例模式

class TowDemo {
	
	
	private static TowDemo obj = null;  // 也可以不赋值，因为成员变量有默认值。
	
	private TowDemo() {
		
	}
	
	public static TowDemo getTowDemo() {
		if(obj  == null) {
			obj = new TowDemo();
		} 
		return obj;
	}
	
	
	
}
