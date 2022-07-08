package pers.quan.opp;

public class ExtendsTest extends Person {
	private String name = "盖聂";
	public static void main(String[] args) {
		ExtendsTest test  = new ExtendsTest();
		// 继承父类过来的方法和属性
		test.eat();
		System.out.println(test.getName());
	}
	//	方法的重写
	//	子类是可以对父类方法进行重写、覆盖的
	public void eat() {
		super.eat();
		System.out.println("11");
		System.out.println(this.name);
		System.out.println(super.getName()); // 引用父类的属性
	}
	
	
}
