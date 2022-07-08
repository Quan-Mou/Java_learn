package pers.quan.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			int[] arr = new int[2];
			System.out.println(arr[2]);
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Խ�����");
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println("��ָ��");
		}finally {
			System.out.println("�ر�");
		}
		
		System.out.println("���");
		
		System.out.println("*************");
		
		int ret1 = methods();
		System.out.println(ret1);
		
		System.out.println("--------------");
		try {
			methods2();
		}catch(FileNotFoundException e) {
			System.out.println("1");
		}catch(IOException e) {
			System.out.println("2");
		}
		
		System.out.println("���Դ���ָ���");
		
		try {
			methodA();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
		methodB();
		
	}
	static public int methods() {
		try {
			int a = 10 / 0;
			return 1;
		}catch(ArithmeticException e) {
			System.out.println(e);
			return 2;
		}finally {
			System.out.println("hhh");
			return 3;
		}
		
	}
	
	public static void methods2() throws FileNotFoundException,IOException {
		File f = new File("aa.txt");
		FileInputStream  fir = new FileInputStream(f);
	}
	
	
	static void methodA() {
		try {
			System.out.println("���뷽��A");
			throw new RuntimeException("�����쳣");
		} finally {
			System.out.println("��A������finally");
		}
	}

	static void methodB() {
		try {
			System.out.println("���뷽��B");
			return;
		} finally {
			System.out.println("����B������finally");
		}
	}


}




class Person {
	
}