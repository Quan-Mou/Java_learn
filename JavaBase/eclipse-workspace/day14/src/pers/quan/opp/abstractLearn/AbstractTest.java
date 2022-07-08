package pers.quan.opp.abstractLearn;

public abstract class AbstractTest {
	// 抽象类中必须至少要有一个抽象方法。否则毫无意义
	public abstract void attack(); 
	
	public abstract void defense();
}


class SonClass extends AbstractTest {
	
//	继承的子类必须重写抽象父类的抽象方法
	public void attack() {
		System.out.println("攻击方式凌厉");
	}
	public void defense() {
		System.out.println("防御力偏弱");
	}
}

class Coach extends AbstractTest{
	public void attack() {
		System.out.println("攻击方式柔和");
	}
	public void defense() {
		System.out.println("防御力中等");
	}
}







