package pers.quan.opp.test2;

import java.util.Scanner;
import java.util.Vector;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//		1.����ѧ���ɼ�
		
		//		2.������
		Vector v = new Vector();
		int max = 0;
		int score = 0;
		char level = ' ';
		for(;;) {
			score = scan.nextInt();
			if (score < 0) {
				break;
			} else if (score > 100) {
				System.out.println("����ɼ��Ƿ�");
				continue;
			} 
			// ��������Զ�����װ��ķ�ʽ
			Integer newScore = new Integer(score);
			v.addElement(newScore);
			if (max < newScore.intValue()) {
				max = newScore.intValue();
			}
			
			
			
		}
		
//		System.out.println(v.size());
//		System.out.println(max);
		
		for(int i = 0; i<v.size();i++) {
			Object current = v.elementAt(i);
			int currentScore = (int)current;
			if ((max - currentScore) <= 10) {
				level = 'A';
				System.out.println(level);
			} else if((max -  currentScore) <= 20) {
				level = 'B';
			} else if((max -  currentScore) <= 30) {
				level = 'C';
			} else {
				level = 'D';
			}
			
			
			System.out.println("student-" + i + " score is " + score + ",level is " + level);
		}
		
		
		
//		for(int i = 0;i<v.size();i++) {
//			System.out.println(v.elementAt(i));
//		}
	}
}
