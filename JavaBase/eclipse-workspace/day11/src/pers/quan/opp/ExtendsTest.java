package pers.quan.opp;

public class ExtendsTest extends Person {
	private String name = "����";
	public static void main(String[] args) {
		ExtendsTest test  = new ExtendsTest();
		// �̳и�������ķ���������
		test.eat();
		System.out.println(test.getName());
	}
	//	��������д
	//	�����ǿ��ԶԸ��෽��������д�����ǵ�
	public void eat() {
		super.eat();
		System.out.println("11");
		System.out.println(this.name);
		System.out.println(super.getName()); // ���ø��������
	}
	
	
}
