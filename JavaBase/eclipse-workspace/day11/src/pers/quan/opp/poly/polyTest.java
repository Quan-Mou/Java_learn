package pers.quan.opp.poly;

public class polyTest {
	public static void main(String[] args) {
		Person p1 = new Man();
		// �������������ͬ���ķ���ʱ��ʵ��ִ�е���������д�ķ�����
		p1.eat();
//		System.out.println(p1.name);
		
//		����ת��
		Man m1 = (Man)p1;
		System.out.println(m1.name);
//		boolean isObj = m1 instanceof Woman;
//		System.out.println(isObj);
		
		Person p2 = new Woman();
		Man m2 = (Man)p2;
		System.out.println(m2.name);
	}
	
}
