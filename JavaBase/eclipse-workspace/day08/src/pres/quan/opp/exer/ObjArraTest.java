//package pres.quan.opp.exer;
//
//public class ObjArraTest {
//	public static void main(String[] args) {
//		Student1[] stus = new Student1[20]; 
//		for(int i = 0; i < 20; i++) {
//			stus[i] = new Student1();
////			学号：1-20
//			stus[i].number = i + 1;
////			年级1-6年级，随机数
//			stus[i].state = (int)(Math.random() * 6) + 1;
////			成绩1-100，随机数
//			stus[i].score = (int)(Math.random() * 100) + 1;
//			
//		}
//		
////		打印3年级（state是3）的学生信息
//		for(int i =0;i<stus.length;i++) {
//			if (stus[i].state == 3) {
//				System.out.println("学号："+stus[i].number +"年级是："+stus[i].state + "成绩是:" + stus[i].score);	
//			}
//		}
//		System.out.println("#################################################");
//		
////		使用冒泡排序按学生成绩排序，并遍历所有学生信息
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
////		打印 // 或者将打印操作写到类里
////		for(int i =0;i<stus.length;i++) {
////			System.out.println("学号："+stus[i].number +"年级是："+stus[i].state + "成绩是:" + stus[i].score);
////		}
//		for(int i = 0; i <stus.length;i++) {
//			System.out.println(stus[i].showInfo());
//		}
//	}
//}
//
