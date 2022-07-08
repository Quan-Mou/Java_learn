package pers.quan.opp.limit;

public class ThisUse {
	public static void main(String[] args) {
		thisFn t1  = new thisFn(10);
		t1.print();
	}
	
}

class thisFn{
	int age;
	thisFn(int age){
//		不用使用this的话是不能出现两个同名的
//		age = age
//		1.只能在第一行的位置调用使用this()构造方法,2.不能在没有参数的构造方法中调用this()会出现死循环这是不允许的！
		
		this.age = age;
		System.out.println("有参的构造方法））））");
	}
//	使用this可以调用其他的构造方法
	thisFn(){
		
		System.out.println("无参的构造方法》》》");
	
	}
	public void print() {
		System.out.println(age);
	}
}
