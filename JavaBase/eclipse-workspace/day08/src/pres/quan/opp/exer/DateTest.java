package pres.quan.opp.exer;

public class DateTest {
	public static void main(String[] args) {
//		�����������󣬷ֱ�ֵΪ��ĳ������ڣ������ĳ������ڣ�����ʾ��Ϣ
		MyDate MyBirth = new MyDate();
		MyBirth.year = 2004;
		MyBirth.month = 3;
		MyBirth.day = 31;
		
		MyDate GirlFriend = new MyDate();
		GirlFriend.year = 2004;
		GirlFriend.month = 6;
		GirlFriend.day = 25;
		
		System.out.println("�ҵ����գ�" +MyBirth.year + " " +MyBirth.month + " " + MyBirth.day );
		System.out.println("��������գ�" +GirlFriend.year + " " +GirlFriend.month + " " + GirlFriend.day );
	}
	
}

class MyDate {
	int year;// ��
	int month; // ��
	int day; // ��
}