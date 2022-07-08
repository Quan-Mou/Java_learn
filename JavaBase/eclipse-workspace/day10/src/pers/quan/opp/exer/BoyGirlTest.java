package pers.quan.opp.exer;

public class BoyGirlTest {
	public static void main(String[] args) {
		Boy boy = new Boy("ÂŞÃÜÅ·",22);
		boy.shout();
		Girl girl = new Girl();
		girl.setName("ÖìÀöÒ¶");
		boy.marry(girl);
//		boy.setName("ÂŞÃÜÅ·");
//		girl.marry(boy);
		
		
		Girl gir12 = new Girl("ÈØ½ã½ã",-1);
		girl.compare(gir12);
	}
	
}
