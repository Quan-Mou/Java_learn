package pers.quan.opp;

public class Student {
	public static void main(String[] args) {
//		声明一个学生类 有姓名、年龄
		Student3 s1 = new Student3();
		// 一个人的姓名不合法我们希望对他进行限制
//		s1.age = -10;
		s1.setAge(-1);
		s1.printInfo();
		
		Limit li1 = new Limit();
//		li1.name
		li1.age = 18;
		li1.height = 1.88f;
		li1.sex = "男";
		
//		li1.skill();
		li1.eat();
		
		
	}
}

class Student3{
	String name = "卫庄";
//	使用了private修饰符后只能在这个类里修改它
	private int age;
	public void setAge(int n) {
		if(n <= 0) {
			System.out.println("不合法的年龄!!");
		} else {
			age = n;
		}
	}
	public void printInfo() {
		System.out.println("我的名字是:" + name + "年龄是:" + age);
	}
}
