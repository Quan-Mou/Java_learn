package pers.quan.opp.innerClassLearn;

public class Attention {
	
	public static void main(String[] args) {
		Attention a = new Attention();
		
		a.methods();
	}
	
	public void methods() {
		int age = 18;
		class A {
			public void test() {
//				age = 10;
			
				System.out.println(age);
			}
		}
	}
	
}
