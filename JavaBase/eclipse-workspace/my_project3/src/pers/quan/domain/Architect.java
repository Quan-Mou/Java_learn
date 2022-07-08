package pers.quan.domain;


// �ܹ�ʦ
public class Architect extends Designer{
	private double bonus; // ��ʾ����
	
	private int stock; // ��ʾ��˾�����Ĺ�Ʊ����
	public Architect(int id, String name, int age, double salary,double bonus,int stock,Equipment equipment) {
		super(id, name, age, salary,bonus,equipment);
		this.bonus = bonus;
		this.stock= stock;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return getBaseInfo() +"�ܹ�ʦ"+"\t"+getStatus()+"\t"+getBonus() + "\t" + getStock()  +"\t"+ getEquipment().getDescription();
	}                    
	
	
}
