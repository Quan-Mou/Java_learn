package pers.quan.opp.limit;

public class Construct {

	public static void main(String[] args) {
//		�ڴ��������ͬʱ�����Զ����ù��췽��(������û�д�������������)��������˲���˵���㲻��ʹ��new Ĭ�ϵĹ��췽������ʱ��Ҫ�������ж���һ�����췽��
		
//		PersInfo s1 = new PersInfo();
//		�вεĹ��췽��
//		PersInfo s1 = new PersInfo("���泬��");
//		s1.printName();
		
//		���췽��������
//		PersInfo s2 = new PersInfo();
		PersInfo s1 = new PersInfo("��ׯ");
		PersInfo s2 = new PersInfo("��ׯ",40);
		
		s2.printName();
		s1.printName();
	}
	
	
}

class PersInfo {
	String name;
	int age;
	PersInfo() {
		System.out.println("Student()....");		
	}
	PersInfo(String nickName) {
	
		name = nickName;	
	}
	PersInfo(String nickName , int a) {
		name = nickName;
		age = a;
	}
	
	
	
	void printName() {
//		System.out.println(name);
		System.out.println("�ҽУ�" + name + "���꣺" + age);
	}
}

