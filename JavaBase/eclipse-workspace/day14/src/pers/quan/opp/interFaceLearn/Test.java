package pers.quan.opp.interFaceLearn;

// �ӿ�
interface Test {
//	void attach();
//	void canch();
}




interface Compare1 {
	// ��̬����
	public static void methods1() {
		System.out.println("��̬��������");
	}
	// ��ͨ����
	public default void methods2() {
		System.out.println("��ͨ������");
	}
}
interface Compare2 {
	public default void methods2() {
		System.out.println("Compare2��ͨ����");
	}
}


class Quan extends Zhi implements Compare1,Compare2 {
	public void implementsFn() {
		// ���ͬʱʵ���������ӿڣ������������ӿ�����һ����������һ��
		Compare1.super.methods2(); 
		Compare2.super.methods2();
		super.methods3();
	}
	
	public void methods2() {
		System.out.println("��д�˽ӿ���ͨ����");
	}
	
}

class Zhi {
	public void methods3() {
		System.out.println("����methods3����");
	}
}



interface Print {
	public void pName();
	public void pAge();
}


interface Flight {
	void flight();
}

class ImTest implements Test {
	public void attach() {
		System.out.println("�����ֶ�");
	}
	public void canch() {
		System.out.println("�����ֶ�");
	}
}

class AllImTest implements Test,Print {
	public void attach() {
		System.out.println("����");
	}
	public void canch() {
			System.out.println("���R");
		}
	public void pName() {
		System.out.println("����");
	}
	public void pAge() {
		System.out.println("���g");
	}
}






