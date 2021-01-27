package day16.exception;
/*
	什么是异常？
		1.以下程序在执行过程中发生了不正常的情况，而这种不正常的情况叫做：异常。
		2.java语言是很完美的语言，提供了异常的处理方式
		3.java把该异常信息打印输出到控制台，供程序员参考，可以对程序进行修改
		使程序更加健壮。
		4.异常信息是由JVM打印。
 */
public class ExceptionTest01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		if(b == 0) {
			System.out.println("除数不能为0");
			return;
		}
		
		int c = a / b; // JVM执行到此处会创建ArithmeticException对象：new ArithmeticException("/ by zero")
		// 并且JVM将new的异常对象抛出，打印输出信息到控制台了
		System.out.println(a + " / " + b +" = "+ c); //ArithmeticException
	}
}
