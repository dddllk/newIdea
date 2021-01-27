package day13;
/*
	final:
		1.final是java语言中的一个关键字
		2.final表示最终的，不可变的
		3.final可以修饰变量及方法，还有类等。
		4.final修饰的变量？
			final修饰的局部变量，一旦赋值不能被重新赋值。（只能赋一次值）

		5.final修饰的方法？
			final修饰的方法无法被覆盖，被重写

		6.final修饰的类？
			final修饰的类无法继承
 */
public class FinalTest01 {
	public static void main(String[] args) {
		final int i;
		i = 1;
		// i = 2;
		int b;
		b = 2;
		b = 3;
	}
}

// B类继承A类，相当于对A类功能进行扩展，如果你不希望别人对A类进行扩展，
// 你可以给A类加上final关键字，这样的话A类就无法继承了
class A {

}
class B extends A {

}