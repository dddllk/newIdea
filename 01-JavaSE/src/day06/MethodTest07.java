package day06;
/*
	分析以下程序的执行结果：
		main begin
		m1 begin
		m2 begin
		m3 begin
		m3 end
		m2 end
		m1 end
		main end
		不用刻意记忆，只要记住方法中的代码是自上而下的顺序依次执行即可。
		当前行的程序没有结束的时候，下一行代码是无法执行的
 */
public class MethodTest07 {
	public static void main(String[] args) {
	  System.out.println("main begin");
	  m1();
	  System.out.println("main end");
	}
	public static void m1() {
		System.out.println("m1 begin");
		m2();
		System.out.println("m1 end");
	}
	public static void m2() {
		System.out.println("m2 begin");
		m3();
		System.out.println("m2 end");
	}
	public static void m3() {
		System.out.println("m3 begin");
		System.out.println("m3 end");
	}
}
