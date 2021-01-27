package day06;
/*
	方法的返回值类型不是void的时候
		1.返回值类型不是void的时候，要求方法必须保证百分百的执行“return 值;”这样的语句来完成值的返回。
 			没有这个语句编译器会报错。
 		2.一个方法有返回值的时候，当我们调用这个方法的时候，方法返回了一个值，
 			对于调用者来说，这个返回值可以选择接收，也可以选择不接受。
 			但是大部分情况下我们都是要选择接收的。
 */
public class MethodTest08 {
	public static void main(String[] args) {
		// 调用方法，接收的类型要和返回值的类型一致
		int c = divide(10, 3);
		// 接收数值并输出
		System.out.println(c);
	}
	/*
		需求：
			请定义并实现一个方法，该方法可以计算两个int类的商
			要求将最终的计算结果返回使用者
	 */
	public static int divide(int a, int b) { // 必须有返回值
		return a / b;
	}
}
