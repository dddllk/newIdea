package day06;
/*
	方法调用：
		1. 方法的修饰符列表当中有static关键字，完整的调用是类名.方法名(实参列表);
		2. 但是，有的时候“类名.”可以省略，什么情况下可以省略？
			m1() {
				m2();
			}
			m1方法和m2方法在同一类体当中的时候，“类名.”可以省略不写
 */
public class MethodTest06 {
	public static void main(String[] args) {
		// 调用方法
		MethodTest06.m();
		// 对于方法的修饰符列表当中有static关键字的
		m();
		// 调用其他类【不是本类中的】中的方法
		// doOther(); // 省略“类名.”之后，默认从当前类中找“doOther方法”
		A.doOther();
	}
	public static void m() {
		System.out.println("m method execute");
		m2();
	}
	public static void m2() {
		System.out.println("m2 execute");
	}
}
class A {
	public static void doOther() {
		System.out.println("doOther method invoke");
	}
}
