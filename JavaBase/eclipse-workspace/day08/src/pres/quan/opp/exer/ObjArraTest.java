//package pres.quan.opp.exer;
//
//public class ObjArraTest {
//	public static void main(String[] args) {
//		Student1[] stus = new Student1[20]; 
//		for(int i = 0; i < 20; i++) {
//			stus[i] = new Student1();
////			ѧ�ţ�1-20
//			stus[i].number = i + 1;
////			�꼶1-6�꼶�������
//			stus[i].state = (int)(Math.random() * 6) + 1;
////			�ɼ�1-100�������
//			stus[i].score = (int)(Math.random() * 100) + 1;
//			
//		}
//		
////		��ӡ3�꼶��state��3����ѧ����Ϣ
//		for(int i =0;i<stus.length;i++) {
//			if (stus[i].state == 3) {
//				System.out.println("ѧ�ţ�"+stus[i].number +"�꼶�ǣ�"+stus[i].state + "�ɼ���:" + stus[i].score);	
//			}
//		}
//		System.out.println("#################################################");
//		
////		ʹ��ð������ѧ���ɼ����򣬲���������ѧ����Ϣ
//		for (int i = 0;i<stus.length - 1;i++) {
//			for(int j = 0; j<stus.length - 1 - i;j++) {
//				if (stus[j].score> stus[j+1].score) {
//					Student1 tmp = stus[j];
//					stus[j] = stus[j+1];
//					stus[j+1] = tmp;
//				}
//				
//			}
//		}
//		
////		��ӡ // ���߽���ӡ����д������
////		for(int i =0;i<stus.length;i++) {
////			System.out.println("ѧ�ţ�"+stus[i].number +"�꼶�ǣ�"+stus[i].state + "�ɼ���:" + stus[i].score);
////		}
//		for(int i = 0; i <stus.length;i++) {
//			System.out.println(stus[i].showInfo());
//		}
//	}
//}
//
