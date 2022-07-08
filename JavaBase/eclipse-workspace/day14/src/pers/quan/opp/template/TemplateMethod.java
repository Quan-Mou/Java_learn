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
//	排队
	public void queueUp() {
		System.out.println("排队中……");
	}
//你需要不同的操作,为抽象方法
	abstract void process();
//评分
	public void grade() {
		System.out.println("评分");
	}
	
	public void procedure() {
		this.queueUp();
		this.process();
		this.grade();
	}
}

class DrawMoney extends BankTemplateMethod {
	public void process() {
		System.out.println("我要取钱");
	}
}

class moneyManagement extends BankTemplateMethod {
	public void process() {
		System.out.println("我要理財");
	}
}
