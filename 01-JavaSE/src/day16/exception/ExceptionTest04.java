package day16.exception;

public class ExceptionTest04 {
/*
	第一种处理方式：在方法声明的位置使用throws,来完成异常继续上抛，抛给调用者(类似推卸责任)。
public static void main(String[] args) throws ClassNotFoundException {
		doSome();
	}
*/
	public static void main(String[] args) {
		// 第二种处理方式 try...catch（类同把异常拦下处理了）
		try {
			doSome();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void doSome() throws ClassNotFoundException {
		System.out.println("doSome!");
	}
}
