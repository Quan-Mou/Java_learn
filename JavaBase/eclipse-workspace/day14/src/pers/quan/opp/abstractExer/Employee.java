package pers.quan.opp.abstractExer;

public abstract class Employee {
	String name;
	int id;
	double salary;
	public Employee() {
		
	}
	public Employee(String name,int id,double salary) {
			this.name = name;
			this.id = id;
			this.salary = salary;
			System.out.println("÷¥––¡À");
	}
	
	public abstract void work();
}


