package pers.quan.opp.test2;

public class GeometricObject {
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		String info = c1.toString();
		int num = 10;
		Integer n1 = num;
		System.out.println(info);
		System.out.println(n1.toString());
		
		
		// ����д���������ˣ�������װ��Ͳ���ĸ��
//		Integer n3 = new Integer(num);
		Integer n2 = num;
		System.out.println(n2.toString());
		double dd1 = 12.2;
		// װ�� ������������ -�� ��װ��
		Double do1 = dd1;
		System.out.println(do1.toString());
		
		System.out.println("*****");
//		��װ��תΪ������������ ����  �� .xxxValue();
		double d1 = do1.doubleValue();
		System.out.println(d1);
		
		float f1 = 8.8F;
		Float F1 = f1;// װ��
		float ff1 = F1.floatValue(); // ����
		System.out.println(F1.toString());
		System.out.println(ff1);
		
		
//		�ַ���(String) תΪ������������
		String id = "12";
		int i = Integer.parseInt(id);
		System.out.println(i + 10);
		
		String isB = "true";
//		String isB = "true12"; 
		boolean is = Boolean.parseBoolean(isB);
		System.out.println(is);
		
		
//		��������������ת��Ϊ�ַ���
		int ab = 1122;
		String abs = String.valueOf(ab);
		System.out.println(abs + 2);
		// ����ʹ���ַ���ƴ��
		
		
		
//		�����⣺
		Object o1 = true ? new Integer(1) : new Double(2.0);
		System.out.println(o1);//
		
		
		Object o2;
		if (true)
		o2 = new Integer(1);
		else
		o2 = new Double(2.0);
		System.out.println(o2);//
		
		int o23 = true ? 10 : 2;
		System.out.println(o23);
	}
	

	
}
