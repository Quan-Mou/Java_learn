package pers.quan.opp.poly;

public class Person {
	public void eat() {
		System.out.println("吃饭");
	}
	
}

class Man extends Person{
	String name = "卫庄";
	public void eat() {
		System.out.println("男人多吃肉，长肌肉");
	}
}

class Woman extends Person{
	String name = "蓉姑娘";
	public void eat() {
		System.out.println("女人少吃，为了减肥");
	}
}