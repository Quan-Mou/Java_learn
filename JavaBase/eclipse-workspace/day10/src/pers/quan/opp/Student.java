package pers.quan.opp;

public class Student {
	public static void main(String[] args) {
//		����һ��ѧ���� ������������
		Student3 s1 = new Student3();
		// һ���˵��������Ϸ�����ϣ��������������
//		s1.age = -10;
		s1.setAge(-1);
		s1.printInfo();
		
		Limit li1 = new Limit();
//		li1.name
		li1.age = 18;
		li1.height = 1.88f;
		li1.sex = "��";
		
//		li1.skill();
		li1.eat();
		
		
	}
}

class Student3{
	String name = "��ׯ";
//	ʹ����private���η���ֻ������������޸���
	private int age;
	public void setAge(int n) {
		if(n <= 0) {
			System.out.println("���Ϸ�������!!");
		} else {
			age = n;
		}
	}
	public void printInfo() {
		System.out.println("�ҵ�������:" + name + "������:" + age);
	}
}
