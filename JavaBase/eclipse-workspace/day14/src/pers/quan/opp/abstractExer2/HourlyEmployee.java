package pers.quan.opp.abstractExer2;

public class HourlyEmployee extends Employee{
	private int wage; // 工资
	private int hour; // 工作时长
	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hour=" + hour + "]";
	}
	public HourlyEmployee(String name,int id,double salary) {
		
		this.wage = id;
	}
	@Override
	public int earnings() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
