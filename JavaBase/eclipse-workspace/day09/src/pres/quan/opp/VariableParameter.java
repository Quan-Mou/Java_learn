package pres.quan.opp;

//public class VariableParameter {
//	public static void main(String[] args) {
////		�ɱ����
//		VariableParameter v1 = new VariableParameter();
//		v1.variableTest(1,2,3); // ���Դ���������
//	}
//	public void variableTest(int ... num) {
//		for(int i = 0; i<num.length;i++) {
//			System.out.println(num[i]);
//		}
//		/// ���԰�num����һ������ ע�⣺�ɱ����ֻ�ܷ����βε����һ��λ��
//	}
//}


public class VariableParameter {
	public static void main(String[] args) {
		VariableParameter test = new VariableParameter();
		test.first();
	}
	
	public void first() {
		int i = 5;
		Value v = new Value();
		v.i=  25;
		second(v,i);
		System.out.println(v.i);
	}
	public void second(Value v,int i ) {
		i = 0;
		v.i = 20;
		Value val = new Value();
		v = val;
		System.out.println(v.i + " " + i);
	}
}
class Value {
	int i = 15;
}
