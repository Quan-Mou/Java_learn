package pers.quan.domain;


// 架构师
public class Architect extends Designer{
	private double bonus; // 表示奖金
	
	private int stock; // 表示公司奖励的股票数量
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
		return getBaseInfo() +"架构师"+"\t"+getStatus()+"\t"+getBonus() + "\t" + getStock()  +"\t"+ getEquipment().getDescription();
	}                    
	
	
}
