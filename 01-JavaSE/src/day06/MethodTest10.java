package day06;
/*
	在返回值类型是void的方法当中使用“return;”语句
	“return;” 语句出现在返回值为void的类型中
 */
public class MethodTest10 {
	public static void main(String[] args) {
		m();
	}

	public static void m() {
//  编译错误：对于结果类型为空的方法，无法返回值。
//  return 10;
		for(int i = 0; i < 10; i++) {
			if (i == 5) {
				 return; // 不是终止for循环，终止的是m()方法
				//break; // 终止的是for循环
			}
			System.out.println("i --> " + i);
		}
		System.out.println("hello world");
	}
}
