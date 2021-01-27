package day16.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
	处理异常的第一种方式：在方法声明的位置上使用throws关键字抛出

	编译时异常要进行处理，运行时异常可以处理可以不处理。

	注意：
		只要异常没有捕捉，采用上报的方式，此方法的后续代码不会继续执行。
		另外需要注意，try语句块中的某一行出现异常，该行后面的代码不会执行。
		try...catch捕捉完之后，后面的代码会继续执行
 */
public class ExceptionTest05 {
	// 一般不建议在main方法上throws，因为这个异常真正发生了，一定会抛给JVM。JVM只有终止。
	// 异常处理机制的作用就是增强程序的健壮性。怎么能做到，异常发生了也不影响程序的执行。
	// 所以：一般main方法中的异常建议使用try...catch进行捕捉，main就不再往上抛了
	public static void main(String[] args) {
		System.out.println("main begin");
		try {
			m1();
		} catch (IOException e) { // catch是捕获异常，进行处理
			// 这个分支可以使用e引用，e引用保存的内存地址是那个new出来异常对象的内存地址
			e.printStackTrace();
			System.out.println("文件不存在，可能路径错误！");
		}
		// try...catch把异常抓住之后，这里的代码会继续执行
		System.out.println("main over");
	}
	private static void m1() throws IOException {
		System.out.println("m1 begin");
		m2();
		System.out.println("m1 end");
	}
	private static void m2() throws IOException {
		System.out.println("m2 begin");
		// 调用m3()也要对异常进行处理，抛出别的异常不行，可以抛出 throws FileNotFoundException
		// 也可以抛出 IOException 或者 Exception
		// throws 后面也可以写多个异常
		m3();
		System.out.println("m2 end");
	}
	private static void m3() throws FileNotFoundException {
		/*
			编译报错的原因是什么？
				第一：这里调用了一个构造方法：FileInputStream(String name)
				第二：这个构造方法声明位置上有throws FileNotFoundException
				第三：通过类的继承结构看到：FileNotFoundException 父类是IOException，IOException的父类是Exception
						 最终得知，FileNotFoundException是编译时异常

				错误原因：编译时异常要求程序员编写程序的时候必须进行处理，不处理编译器报错。
		 */
		// 采用第一次方式处理：
		// 一个方法体当中的代码出现异之后，如果上报的话，此方法结束
		new FileInputStream("F:\\下载\\车险\\机动车交通事故责任强制保险条款.pdf");
		// 采用第二次方式处理：	try...catch 包括 new FileInputStream("F:\\下载\\浏览器下载\\车险.pdf");

		System.out.println("这里会执行吗？");
	}
}
