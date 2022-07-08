package pres.quan.opp.exer;



public class EnhanceObjArraTest {
	public static void main(String[] args) {
		Student1[] stus = new Student1[20]; 
		for(int i = 0; i < 20; i++) {
			stus[i] = new Student1();
//			ѧ�ţ�1-20
			stus[i].number = i + 1;
//			�꼶1-6�꼶�������
			stus[i].state = (int)(Math.random() * 6) + 1;
//			�ɼ�1-100�������
			stus[i].score = (int)(Math.random() * 100) + 1;
			
		}
		
		EnhanceObjArraTest test = new EnhanceObjArraTest();
		
//		��ӡ3�꼶��state��3����ѧ����Ϣ
		test.printAssign(stus,3);
		System.out.println("#################################################");
		
//		ʹ��ð������ѧ���ɼ����򣬲���������ѧ����Ϣ
		test.sort(stus);
		
//		��ӡ
		test.print(stus);
		
	}
	
//	��ӡָ���꼶(state) 
	public void printAssign(Student1[] stus , int state) {
		for(int i =0;i< stus.length;i++) {
			if (stus[i].state == state) {
				System.out.println(stus[i].showInfo());	
			}
		}
	}
	
//	����
	public void sort(Student1 [] stus) {
		for (int i = 0;i<stus.length - 1;i++) {
			for(int j = 0; j<stus.length - 1 - i;j++) {
				if (stus[j].score> stus[j+1].score) {
					Student1 tmp = stus[j];
					stus[j] = stus[j+1];
					stus[j+1] = tmp;
				}
				
			}
		}
	}
	
	public void print(Student1[] stus) {
		for(int i = 0; i <stus.length;i++) {
			System.out.println(stus[i].showInfo());
		}
	}
	
}











