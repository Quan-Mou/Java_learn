package pers.quan.opp.poly;

public class Person {
	public void eat() {
		System.out.println("�Է�");
	}
	
}

class Man extends Person{
	String name = "��ׯ";
	public void eat() {
		System.out.println("���˶���⣬������");
	}
}

class Woman extends Person{
	String name = "�ع���";
	public void eat() {
		System.out.println("Ů���ٳԣ�Ϊ�˼���");
	}
}