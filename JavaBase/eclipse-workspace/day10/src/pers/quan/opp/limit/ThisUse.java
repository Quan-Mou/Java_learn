package pers.quan.opp.limit;

public class ThisUse {
	public static void main(String[] args) {
		thisFn t1  = new thisFn(10);
		t1.print();
	}
	
}

class thisFn{
	int age;
	thisFn(int age){
//		����ʹ��this�Ļ��ǲ��ܳ�������ͬ����
//		age = age
//		1.ֻ���ڵ�һ�е�λ�õ���ʹ��this()���췽��,2.������û�в����Ĺ��췽���е���this()�������ѭ�����ǲ�����ģ�
		
		this.age = age;
		System.out.println("�вεĹ��췽����������");
	}
//	ʹ��this���Ե��������Ĺ��췽��
	thisFn(){
		
		System.out.println("�޲εĹ��췽��������");
	
	}
	public void print() {
		System.out.println(age);
	}
}
