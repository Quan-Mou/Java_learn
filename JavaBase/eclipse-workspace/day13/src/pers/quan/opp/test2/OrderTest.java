package pers.quan.opp.test2;

public class OrderTest {
	public static void main(String[] args) {
		Order o1 = new Order(2019,"curry");
		Order o2 = new Order(2019,"curr");
		boolean ret = o1.equals(o2);
		System.out.println(ret);
	}
}
