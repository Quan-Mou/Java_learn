package pers.quan.opp.template;

public class TemplateMethod {
	public static void main(String[] args) {
		BankTemplateMethod draw = new DrawMoney();
		draw.procedure();
		
		BankTemplateMethod DC = new moneyManagement();
		DC.procedure();
	}
}

abstract class BankTemplateMethod {
//	�Ŷ�
	public void queueUp() {
		System.out.println("�Ŷ��С���");
	}
//����Ҫ��ͬ�Ĳ���,Ϊ���󷽷�
	abstract void process();
//����
	public void grade() {
		System.out.println("����");
	}
	
	public void procedure() {
		this.queueUp();
		this.process();
		this.grade();
	}
}

class DrawMoney extends BankTemplateMethod {
	public void process() {
		System.out.println("��ҪȡǮ");
	}
}

class moneyManagement extends BankTemplateMethod {
	public void process() {
		System.out.println("��Ҫ��ؔ");
	}
}
