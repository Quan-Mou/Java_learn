package pers.quan.opp.interFaceLearn;

public class CompareableCirce extends Circle implements CompareObj {
	public CompareableCirce(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}
	int a = 10;
	public int compareTo(Object o) {
		if (this == o) {
			return 0;
		}
		if (o instanceof Circle) {
			CompareableCirce c = (CompareableCirce)o;
			if (c.getRadius() > this.getRadius()) {
				return -1;
			}else if (c.getRadius() < this.getRadius()) {
				return 1;
			} else {
				return 0;
			}
		}
		return 0;
	}

}
