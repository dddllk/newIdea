package day16.exception;
/*
	异常的继承机构：
		1.1：通常用UML图来描述异常继承结构
			UML是一种统一建模语言。
			一种图标式语言，只要是面向对象的编程语言，都有UML
			一般画UML图都是软件架构师或者系统分析师使用。
			在UML图中可以描述类和类之间的关系，程序执行的流程，对象的状态等。
		1.2：编译时异常和运行时异常，都是发生在运行阶段，编译阶段异常是不会发生的
			编译时异常为什么而得名？
			因为编译时异常必须在编译（编写）阶段预先处理，如果不处理编译器报错，因此而得名。
			所有异常都是在运行阶段发生的。因为只有程序运行阶段才可new对象。
			因为异常的发生就是new对象
		1.3：编译时异常和运行时异常的区别？
			编译时异常一般发生的概率比较高
			运行时异常一般发生的概率比较低
		1.4：异常的处理方式：
			第一种方式：在方法声明的位置上，使用throws关键字，抛给上一级。
			第二种方式：使用try...catch语句进行异常的捕捉。
		1.5: Java 中异常发生之后如果选择上抛，最终抛给了我们的调用者，调用者需要
				 对这个异常继续处理，那么调用者处理这个异常同样有两种方式。
		1.6：Java中异常发生之后如果一直往上抛，最终抛给了main方法，main方法继续
				 往上抛，抛给了调用者JVM，JVM只知道这个异常的发生，只有一个结果，终止java程序的执行。
 */
public class ExceptionTest03 {
	public static void main(String[] args) {
		// main方法调用doSome()方法
		// 因为doSome()方法声明的位置上有：throws ClassNotFoundException
		// 我们在调用doSome()方法的时候必须对这种异常进行预先处理
		// 如果不处理，编译器就报错
		// 编译器报错信息：java: 未报告的异常错误java.lang.ClassNotFoundException;
		try {
			doSome();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * doSome方法在方法声明的位置上使用了：throws ClassNotFoundException
	 * 这个代码表示在doSome方法执行的过程中，有可能会出现ClassNotFoundException异常
	 * 叫做类没找到异常。这个异常的直接父类是：Exception，所以ClassNotFoundException属于编译时异常。
	 * @throws ClassNotFoundException
	 */
	public static void doSome() throws ClassNotFoundException  {
		System.out.println("doSome");
	}
}
