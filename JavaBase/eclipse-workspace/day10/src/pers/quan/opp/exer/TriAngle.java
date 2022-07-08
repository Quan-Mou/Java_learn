package pers.quan.opp.exer;

public class TriAngle {
	private int base;
	private int height;
	public void getInfo(int base,int height) {
		this.base = base;
		this.height = height;
		System.out.println("三角形的面积：" + this.base * this.height);
	}
	TriAngle(int base,int height) {
		getInfo(base,height);
	}
	
}
