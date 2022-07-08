package pers.quan.domain;

import pers.quan.service.Status;

// ����Ա
public class Programmer extends Employee {
	private int memberId = 1; // ���뿪���ŶӺ����Ŷ��е�id
	private Status status =  Status.FREE; // �Զ������µĶ������ԣ���ʾ״̬��
	private Equipment equipment; // 
	public Programmer(int id, String name, int age, double salary,Equipment equipment) {
		super(id, name, age, salary);
		this.equipment = equipment;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Equipment getEquipment() {
		return equipment;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	@Override
	public String toString() {
		return super.getBaseInfo()+ "����Ա" +"\t"+ getStatus() + "\t\t\t"+equipment.getDescription();
	}
	
	
	
	
}