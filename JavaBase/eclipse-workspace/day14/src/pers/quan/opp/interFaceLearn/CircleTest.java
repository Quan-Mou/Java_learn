package pers.quan.opp.interFaceLearn;

public class CircleTest {
	public static void main(String[] args) {
		CompareableCirce c1 = new CompareableCirce(2);
		CompareableCirce c2 = new CompareableCirce(2);
		int ret  = c1.compareTo(c2);
		if (ret > 0) {
			System.out.println("c1 max");
		} else if (ret < 0) {
			System.out.println("c1 min");
		} else {
			System.out.println("Ò»Ñù´ó");
		}
//		System.out.println(10);
	}
}
