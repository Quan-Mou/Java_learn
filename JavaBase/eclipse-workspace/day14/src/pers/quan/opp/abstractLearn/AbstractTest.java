package pers.quan.opp.abstractLearn;

public abstract class AbstractTest {
	// �������б�������Ҫ��һ�����󷽷��������������
	public abstract void attack(); 
	
	public abstract void defense();
}


class SonClass extends AbstractTest {
	
//	�̳е����������д������ĳ��󷽷�
	public void attack() {
		System.out.println("������ʽ����");
	}
	public void defense() {
		System.out.println("������ƫ��");
	}
}

class Coach extends AbstractTest{
	public void attack() {
		System.out.println("������ʽ���");
	}
	public void defense() {
		System.out.println("�������е�");
	}
}







