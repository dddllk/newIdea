package day06;
/*
	深入return语句
		带有return关键字的java语句只要执行，所在的方法执行结束。
		在同一个作用域当中，return语句下面不能编写人和代码，因为这些代码
		永远都执行不到。所以编译报错。
 */
public class MethodTest09 {
	public static void main(String[] args) {
		System.out.println(m()); //输出方法执行需要带小括号，即m()
	}
	public static int m() {
		int a = 10;
		return a > 3 ? 1 : 0;
	}
// 以下程序可以100%保证return语句执行。
/*
	public static int m() {
		int a = 10;
		if (a > 3) {
			return 1;
		}else {
			return 0;
		}
	}
 */
// 编译报错：缺少返回语句，以下程序认为编译器无法百分百保证“return 1”会执行，所以编译报错
/*
	public static int m() {
		int a = 10;
		if (a > 3) {
			return 1;
		}
	}
 */
}
