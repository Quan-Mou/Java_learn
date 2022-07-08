package pers.quan.opp.test3;

public class SingletonTest2 {
	
	public static void main(String[] args) {
		TowDemo t1 = TowDemo.getTowDemo();
		TowDemo t2 = TowDemo.getTowDemo();
		
		System.out.println(t1 == t2);
	}
	

}

//����ʽ����ģʽ

class TowDemo {
	
	
	private static TowDemo obj = null;  // Ҳ���Բ���ֵ����Ϊ��Ա������Ĭ��ֵ��
	
	private TowDemo() {
		
	}
	
	public static TowDemo getTowDemo() {
		if(obj  == null) {
			obj = new TowDemo();
		} 
		return obj;
	}
	
	
	
}
