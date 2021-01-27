package day16.exception;

public class ExceptionTest13 {
	public static void main(String[] args) {
		MyException e = new MyException("用户名不能为空");

		// 打印异常信息
		e.printStackTrace();

		String msg = e.getMessage();
		System.out.println(msg);
	}
}
