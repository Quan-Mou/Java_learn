package pers.quan.opp.test;

public class Interior {
	public static void main(String[] args) {
		InteriorTest i1 = new InteriorTest();
		
//		�ⲿ������ڲ���
//		�ⲿ����.�ڲ����� ������ = new �ⲿ����().new �ڲ�����();
		InteriorTest.Demo d1 = new InteriorTest().new Demo();
		
		d1.show();
		
		InteriorTest d2 = new InteriorTest();
		d2.fnInterior();
		
		Test t1  = new Test(true);
		
		FDemo fd1 = new FDemo();
		
		System.out.println(fd1.name);
		
	}
}
