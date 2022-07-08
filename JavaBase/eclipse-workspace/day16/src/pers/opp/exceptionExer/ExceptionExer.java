package pers.opp.exceptionExer;

/*
 * 编写应用程序EcmDef.java，接收命令行的两个参数，
 * 		要求不能输入负数，计算两数相除。
 * 		对 数 据 类 型 不 一 致(NumberFormatException)、
 * 		缺 少 命 令 行 参 数(ArrayIndexOutOfBoundsException、
 * 		除0(ArithmeticException)及输入负数(EcDef自定义的异常)进行异常处理。
 *
 * 提示：
 * 		(1)在主类(EcmDef)中定义异常方法(ecm)完成两数相除功能。
 * 		(2)在main()方法中使用异常处理语句进行异常处理。
 * 		(3)在程序中，自定义对应输入负数的异常类(EcDef)。
 * 		(4)运行时接受参数java EcmDef2010//args[0]=“20”args[1]=“10”
 * 		(5)Interger类的static方法parseInt(Strings)将s转换成对应的int值。
 * 		如：int a=Interger.parseInt(“314”);//a=314;
 */



public class ExceptionExer {
	
	public static void main(String[] args) {
		
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			ecm(a,b);
		}catch(NumberFormatException e) {
			System.out.println("类型不一致" + e);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("缺少命令行" + e);
		}catch(ArithmeticException e) {
			System.out.println("不可除0" + e);
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
				
	}
	public static int ecm(int a,int b) throws NumberFormatException,ArrayIndexOutOfBoundsException,ArithmeticException,MyException {
		if (a < 0  || b < 0) {
			throw new MyException("输入了负数！！");
		}
		return a / b;
	}

}
