package pers.quan.opp.test3;

//public class Test {
//	public static void main(String[] args){
//		new Leaf(); 
//		//new Leaf();
//	}
//}
//
//
//
//class Root{
//	static{
//		System.out.println("Root �ľ�̬��ʼ����");
//	}
//	{
//		System.out.println("Root ����ͨ��ʼ����");
//	}
//	public Root(){
//		System.out.println("Root ���޲����Ĺ�����");
//	}
//}
//class Mid extends Root{
//	static{
//		System.out.println("Mid �ľ�̬��ʼ����");
//	}
//	{
//		System.out.println("Mid ����ͨ��ʼ����");
//	}
//	public Mid(){
//		System.out.println("Mid ���޲����Ĺ�����");
//	}
//	public Mid(String msg){
//		//ͨ�� this ����ͬһ�������صĹ�����
//		this();
//		System.out.println("Mid �Ĵ������������������ֵ��"
//			+ msg);
//	}
//}
//class Leaf extends Mid{
//	static{
//		System.out.println("Leaf �ľ�̬��ʼ����");
//	}
//	{
//		System.out.println("Leaf ����ͨ��ʼ����");
//	}	
//	public Leaf(){
//		//ͨ�� super ���ø�������һ���ַ��������Ĺ�����
//		super("�й��");
//		System.out.println("Leaf �Ĺ�����");
//	}
//}


class Father {
	static {
		System.out.println("11111111111");
	}
	{
		System.out.println("22222222222");
	}

	public Father() {
		System.out.println("33333333333");

	}

}

public class Test extends Father {
	static {
		System.out.println("44444444444");
	}
	{
		System.out.println("55555555555");
	}
	public Test() {
		System.out.println("66666666666");
	}

	public static void main(String[] args) { // �ɸ����� ��̬����
		System.out.println("77777777777");
		System.out.println("************************");
		new Test();
		System.out.println("************************");

		new Test();
		System.out.println("************************");
		new Father();
	}

}




