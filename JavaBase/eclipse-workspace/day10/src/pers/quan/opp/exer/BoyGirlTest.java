package pers.quan.opp.exer;

public class BoyGirlTest {
	public static void main(String[] args) {
		Boy boy = new Boy("����ŷ",22);
		boy.shout();
		Girl girl = new Girl();
		girl.setName("����Ҷ");
		boy.marry(girl);
//		boy.setName("����ŷ");
//		girl.marry(boy);
		
		
		Girl gir12 = new Girl("�ؽ��",-1);
		girl.compare(gir12);
	}
	
}
