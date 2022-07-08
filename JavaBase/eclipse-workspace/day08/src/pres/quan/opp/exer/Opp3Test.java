package pres.quan.opp.exer;

public class Opp3Test {

	public static void main(String[] args) {
		Opp3Test o1= new Opp3Test();
//		o1.method();
		int area = o1.method(12,8);
		System.out.println(area);
	}
	
//	public void method() {
//		for(int i = 0;i<10;i++) {
//			for(int j = 0;j<8;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
//	public int method() {
//		for(int i = 0;i<10;i++) {
//			for(int j = 0;j<8;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		return 10*8;
//		
//	}
	
	public int method(int x,int y) {
		for(int i = 0;i<x;i++) {
			for(int j = 0;j<y;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return x*y;
	}
	
}

