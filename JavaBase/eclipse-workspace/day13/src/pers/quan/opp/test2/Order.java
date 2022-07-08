package pers.quan.opp.test2;

public class Order {
	int orderId;
	String orderName;
	Order() {
		
	}
	Order(int orderId,String orderName) {
		this.orderId = orderId;
		this.orderName = orderName;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	// 判断测试类中的两个属性是否相等 
	public boolean equals(Order o2) {
//		return false;
		if (this == o2) {
			System.out.println("1");
			return true;
			
		}
		
		if (o2 instanceof Order) {
			if (this.orderId == o2.orderId && this.orderName.equals(o2.orderName)) {
				System.out.println("2");
				return true;
			}
		}
		System.out.println("3");
		return false;
		
//		if (this.orderId == o2.orderId && this.orderName.equals(o2) == o2.orderName)
	}
	
}
