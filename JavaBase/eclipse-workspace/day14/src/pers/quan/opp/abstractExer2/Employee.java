package pers.quan.opp.abstractExer2;

public abstract class Employee {
	private String name;
	private int number;
	private int birthday;
	private MyDate md;
	public abstract int earnings();
	@Override
	public String toString() {
		return "[name=" + name + ", number=" + number + ", birthday=" + birthday + "]";
	}
	
	
}
