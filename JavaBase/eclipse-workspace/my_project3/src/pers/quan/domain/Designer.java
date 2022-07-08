package pers.quan.domain;


// ���ʦ
public class Designer extends Programmer {
	private double bonus; // ��ʾ����
	
	
	public Designer(int id, String name, int age, double salary,double bonus,Equipment equipment) {
		super(id, name, age, salary,equipment);
		this.bonus = bonus;
	}


	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	@Override
	public String toString() {
		return getBaseInfo() + "���ʦ" +"\t"+getStatus()+ "\t" + getBonus() +"\t\t"+getEquipment().getDescription();
	} 
}