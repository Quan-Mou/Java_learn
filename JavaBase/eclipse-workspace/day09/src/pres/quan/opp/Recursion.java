package pres.quan.opp;

public class Recursion {
		public static void main(String[] args) {
//			ʹ�õݹ���1-100�ĺ�
			
//			ʹ�õݹ���1-100���еĳ˻�
			Recursion r1 = new Recursion();
			System.out.println(r1.sum(100));
//			쳲���������
			
			
		}
		public int fibonacci(int n) {
			if (n == 1) {
				return 1;
			} else {
				return n + (fibonacci + n);
			}
		}
		
}
