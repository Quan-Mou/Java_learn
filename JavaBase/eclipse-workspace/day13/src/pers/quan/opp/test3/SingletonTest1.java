package pers.quan.opp.test3;

public class SingletonTest1 {
	// ����ģʽ����֤�������ֻ��һ������
	
	public static void main(String[] args) {
		Obj ret1 = Obj.getObj();
		Obj ret2 = Obj.getObj();
		System.out.println(ret1 == ret2);
	}
	
	
	
}

//����ʽ
class Obj {
//	private Obj() {
//		
//	}
//	
//	
////	��������˽�л�
//	private static Obj qh = new Obj();
//	
//	
////	��ȡ����
//	
//	public static Obj getObj() {
//		return qh;
//	}
//	
//	
//	
	
	
	
	
	
	private Obj() {
		
	}
	
	private static Obj o1 = new Obj();
	
	
	public static Obj getObj() {
		return o1;
	}
	
	
	
}
