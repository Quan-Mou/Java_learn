package pers.quan.opp.interFaceLearn;

public class InterFaceExer {
	public static void main(String[] args) {
		MySelf ms = new MySelf();
		ms.help();
	}
}


interface Filial { // Т˳��
	public default void help() {
		System.out.println("������");
	}
}

interface Spoony { // �����
	public default void help() {
		System.out.println("��ϱ��");
	}
}

class Father {
	public void help() {
		System.out.println("���ӣ�����ϱ��");
	}
}

class MySelf implements Filial,Spoony {
	public void help() {
//		System.out.println("��ѡ�񡣡���");
//		Spoony.super.help();
		new Father().help();
	}
}


