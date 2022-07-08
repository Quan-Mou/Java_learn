package pres.quan.opp;

public class Recursion {
		public static void main(String[] args) {
//			使用递归求1-100的和
			
//			使用递归求1-100所有的乘积
			Recursion r1 = new Recursion();
			System.out.println(r1.sum(100));
//			斐波那契数列
			
			
		}
		public int fibonacci(int n) {
			if (n == 1) {
				return 1;
			} else {
				return n + (fibonacci + n);
			}
		}
		
}
