package pers.quan.opp.test;

public class InteriorTest {
	private int num = 10;
	
	// 
	public void test() {
		Demo d1 = new Demo();
		d1.show();
	}
	
	// �ڲ���
	class Demo {
		void show() {
			// �ڲ�����Է����ⲿ��
			System.out.println("num" + num);
		}
	}
	
	// �����ڲ���
	public void fnInterior() {
		class fnClass {
			void show() {
				// �����ڲ���Ҳ���Է����ⲿ���Ա
				System.out.println("num:" + num);
			}
		}
		
		fnClass fnC1 = new fnClass();
		fnC1.show();
	}
	
	//	��̬�ڲ���
//	��̬�ڲ���ͬ�������ڲ������ⲿ�����ʱ�����ڲ����Ա
	
}


class Test{
	Test() {
		System.out.println("���췽��һ��������");
	}
	Test(int x ) {
		this();
		System.out.println("���췽������������");
	}
	Test(boolean b) {
		this(1);
		System.out.println("���췽������������");
	}
}

class FDemo{ 
	final String name = "zhas";
}



