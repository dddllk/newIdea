package day06;
/*
	方法的调用不一定在main方法中，也可以在其他方法当中。
	只要是程序可以被执行到的位置，都可以去调用其他方法。
 */
public class MethodTest04 {
	public static void sum(int a, int b) {
		// 调用doSome方法
		MethodTest04.doSome();
		System.out.println(a+b);
	}
	//主方法（程序入口）
	public static void main(String[] args) {
		// 调用sum方法
		MethodTest04.sum(1, 2);

		System.out.println("hello");
	}
	public static void doSome() {
		System.out.println("do some");
	}
}
