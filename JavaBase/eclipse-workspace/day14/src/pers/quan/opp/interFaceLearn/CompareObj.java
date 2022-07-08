package pers.quan.opp.interFaceLearn;

public interface CompareObj {
	// 如果返回值为0表示相等，若为正数表示当前对象大，负数表示当前对象小
	public int compareTo(Object o);
}
