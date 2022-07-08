package pers.quan.opp.interFaceLearn;

public class InterFaceExer {
	public static void main(String[] args) {
		MySelf ms = new MySelf();
		ms.help();
	}
}


interface Filial { // 孝顺的
	public default void help() {
		System.out.println("救妈妈");
	}
}

interface Spoony { // 痴情的
	public default void help() {
		System.out.println("救媳妇");
	}
}

class Father {
	public void help() {
		System.out.println("儿子，救我媳妇");
	}
}

class MySelf implements Filial,Spoony {
	public void help() {
//		System.out.println("我选择。。。");
//		Spoony.super.help();
		new Father().help();
	}
}


