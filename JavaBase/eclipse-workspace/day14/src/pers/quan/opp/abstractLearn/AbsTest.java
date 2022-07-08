package pers.quan.opp.abstractLearn;

public class AbsTest {
	public static void main(String[] args) {
		AbstractTest test1 = new SonClass();
		test1.attack();
		test1.defense();
		
		AbstractTest test2 = new Coach();
		test2.attack();
		test2.defense();
	}
}
