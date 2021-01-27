package day16.exception;
/*
	finally语句：
		放在finally中的语句是一定会执行的
 */
public class ExceptionTest09 {
	public static void main(String[] args) {
		/*
			try 不能单独使用
			try finally可以联合使用
		以下代码的执行顺序：
			先执行try...
			再指向finally...
			最后执行return(return 语句只要执行方法必然结束)
		 */
		try {
			System.out.println("try...");
			return;
		} finally {
			// finally中的语句会执行
			System.out.println("finally...");
		}
		// 这里不能写语句，因为这个代码是无法执行的
		// System.out.println("dd");
	}
}
