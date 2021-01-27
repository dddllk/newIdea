package day16.exception;
/*
	1.SUN提供的JDK内置的异常是不够用的，我们可以自定义异常
	2.JAVA中怎么自定义异常？
		第一步：编写一个类继承Exception或者RuntimeException。
		第二步：提供两个构造方法，一个无参数的，一个带有String参数的
 */
/*
public class MyException extends Exception{ // 编译时异常
}*/

public class MyException extends RuntimeException{ //运行时异常
	public MyException() {
	    
	}
	public MyException(String s) {
		super(s);
	}
}
