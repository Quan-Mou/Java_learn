package pers.quan.opp.abstractExer;

public class Manager extends Employee {
	double bonus;
	public Manager(double bonus) {
		
	}
	public Manager(String name, int id, double salary,double bonus) {
		super(name,id,salary);
		this.bonus = bonus;
	}
	public void work() {
		System.out.println("负责管理");
	}
}
