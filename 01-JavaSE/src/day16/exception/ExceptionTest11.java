package day16.exception;

public class ExceptionTest11 {
	public static void main(String[] args) {
		int result = m();
		System.out.println(result); // 100
	}
	/*
		java语句规则有些规则是无法被破坏的
			java中有这样一条规则：
				方法体中的代码必须遵循自上而下执行的（亘古不变的）
			java中还有这样一条规则：
				return语句一旦指向，整个方法必须结束（也是亘古不变的）
	 */
	public static int m() {
		int i = 100;
		try {
			// 这行代码出现在int i = 100;的下面，所有最终结果必须是返回100
			// return 语句必须保证是最后执行的。一旦指向，整个方法结束。
		  return i;
		} finally {
			i++;
		}
	}
}

