package pres.quan.opp.exer;

public class DateTest {
	public static void main(String[] args) {
//		创建两个对象，分别赋值为你的出生日期，你对象的出生日期，并显示信息
		MyDate MyBirth = new MyDate();
		MyBirth.year = 2004;
		MyBirth.month = 3;
		MyBirth.day = 31;
		
		MyDate GirlFriend = new MyDate();
		GirlFriend.year = 2004;
		GirlFriend.month = 6;
		GirlFriend.day = 25;
		
		System.out.println("我的生日：" +MyBirth.year + " " +MyBirth.month + " " + MyBirth.day );
		System.out.println("对象的生日：" +GirlFriend.year + " " +GirlFriend.month + " " + GirlFriend.day );
	}
	
}

class MyDate {
	int year;// 年
	int month; // 月
	int day; // 日
}