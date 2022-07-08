package pers.quan.opp.interFaceLearn;

public class InterFaceTest {
	public static void main(String[] args) {
//		Test test = new ImTest();
//		test.attach();
//		test.canch();
		
		System.out.println("----------------------------------");
		AllImTest aTest = new AllImTest();
		aTest.attach();
		aTest.canch();
		aTest.pName();
		aTest.pAge();
		
		
		Quan q1 = new Quan();
		q1.methods2();
		q1.implementsFn();
		
	}
}
