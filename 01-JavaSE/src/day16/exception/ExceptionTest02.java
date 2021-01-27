package day16.exception;
/*
	异常在java中以类的形式存在。
	只要是异常就可以创建对象
 */
public class ExceptionTest02 {
	public static void main(String[] args) {
		// 通过“异常类”实例化“异常对象”
		NumberFormatException nfe = new NumberFormatException("数字格式化异常");
		// java.lang.NumberFormatException
		System.out.println(nfe);
	}
}
