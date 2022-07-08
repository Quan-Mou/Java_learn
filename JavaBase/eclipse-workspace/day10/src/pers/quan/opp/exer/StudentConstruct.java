package pers.quan.opp.exer;

public class StudentConstruct {
	public static void main(String[] args) {
		Student s1 = new Student("¸ÇÄô",45);
		System.out.println(s1.name);
		Student s2 = new Student("¸ÇÄô",45,"¹í¹È");
		System.out.println(s2.name + s2.age + s2.school);
		Student s3 = new Student("ÎÀ×¯",42,"¹í¹È","ºá¹á°Ë·½");
		System.out.println(s3.name + s3.age + s3.school + s3.major);
	}
}

class Student {
	String name;
	int age;
	String school;
	String major;
	Student(String n,int a) {
		this.name = n;
		this.age = a;
	}
	Student(String name,int age,String school) {
		this.name = name;
		this.age = age;
		this.school = school;
	}
	Student(String name,int age,String school,String major) {
		this.name = name;
		this.age = age;
		this.school = school;
		this.major = major;
	}
	
}
