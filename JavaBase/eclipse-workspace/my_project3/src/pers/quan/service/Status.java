package pers.quan.service;

public class Status {
	private final String NAME;
	public Status(String NAME) {
		this.NAME = NAME;
	}
	public static final Status FREE = new Status("FREE"); // ��ʾ����
	public static final Status BUSY = new Status("BUSY"); // ��ʾ�Ѽ��뿪���Ŷ�
	public static final Status VOCATION = new Status("VOCATION"); // ��ʾ�����ݼ�
	public String getName() {
		return NAME;
	}
	@Override
	public String toString() {
		return NAME;
	}
	
}