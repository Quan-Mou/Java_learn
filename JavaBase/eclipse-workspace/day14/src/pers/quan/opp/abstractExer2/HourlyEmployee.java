package pers.quan.opp.abstractExer2;

public class HourlyEmployee extends Employee{
	private int wage; // ����
	private int hour; // ����ʱ��
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
