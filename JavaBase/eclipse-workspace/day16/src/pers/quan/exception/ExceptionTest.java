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
			System.out.println("越界访问");
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println("空指针");
		}finally {
			System.out.println("关闭");
		}
		
		System.out.println("结果");
		
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
		
		System.out.println("测试代码分隔线");
		
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
			System.out.println("进入方法A");
			throw new RuntimeException("制造异常");
		} finally {
			System.out.println("用A方法的finally");
		}
	}

	static void methodB() {
		try {
			System.out.println("进入方法B");
			return;
		} finally {
			System.out.println("调用B方法的finally");
		}
	}


}




class Person {
	
}
