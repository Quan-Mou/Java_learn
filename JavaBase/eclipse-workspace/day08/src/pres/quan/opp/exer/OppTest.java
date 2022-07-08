package pres.quan.opp.exer;

public class OppTest {
	public static void main(String[] args) {
		Student stu1 = new Student();
		System.out.println(stu1.say());
			
		Teacher liu = new Teacher();
		liu.say();
		
		Person p1 = new Person();
		p1.study();
		p1.showAge();
		p1.addAge();
		p1.showAge();
	}
}

class Student {
	String name = "QuanMou";
	int age = 18;
	String major = "软件技术";
	String interests = "篮球";
	public String say() {
//		String studentInfo = "姓名："+name +"年龄：" + age + "专业：" +major +"兴趣："+interests;
		return "姓名："+name +"年龄：" + age + "专业：" +major +"兴趣："+interests;
//		return studentInfo;
	}

}

class Teacher{
	String name = "刘老师";
	int age = 32;
	int teachAge = 4;
	String course = "Java开发";
	public void say() {
		System.out.println(name+age+" "+teachAge+" "+age+" "+course);
	}
}

class Person {
	String name;
	int age;
	int sex;
	public void study() {
		System.out.println("studying");
	}
	public void showAge() {
		System.out.println(age);
	}
	public int addAge() {
		age +=2;
		return age;
	}
}


