package day16.exception;

public class ExceptionTest10 {
	public static void main(String[] args) {
		try {
			System.out.println("try...");
			// 退出JVM
			System.exit(0);
		} finally {
			// try中有System.exit(0)，finally语句不执行
			System.out.println("finally...");
		}
	}
}
