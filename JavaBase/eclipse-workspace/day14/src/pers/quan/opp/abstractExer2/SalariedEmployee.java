package pers.quan.opp.abstractExer2;

public class SalariedEmployee extends Employee{
	private int monthlySalary;
	public int earnings() {
		return monthlySalary;
	}
	@Override
	public String toString() {
		return "SalariedEmployee ["+ super.toString() +"]";
	}
	
}
