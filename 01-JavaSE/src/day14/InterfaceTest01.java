package day14;
/*
	接口：
		1.也是一种引用数据类型。编译之后也是一个class字节码文件。
		2.接口是完全抽象的。（抽象类是半抽象的）或者也可以说，接口是特殊的抽象类。
		3.接口怎么定义，语法是什么？
			【修饰符列表】interface 接口名 {...}
		4.接口支持多继承，一个接口可以继承多个接口。
		5.接口中只包含了两部分内容，一部分是：常量。一部分是：抽象方法。
			接口中没有其他内容了。只有以上两部分。
		6.接口中所以元素都是public修饰的。（都是公开） public abstract能省略
 		7.接口中的方法都是抽象方法，不能有方法体。
 		8.接口中的常量前的 public static final 可以省略，
 			也可以这样理解：在接口中随便写一个变量都是常量。
 */
public class InterfaceTest01 {
	public static void main(String[] args) {
		System.out.println(MyMath.PI);
	}
}
// 定义接口
interface A {

}
interface B {

}
// 接口支持继承，多个继承
interface C extends A, B {

}
interface MyMath {
	// 抽象方法
	// public abstract int sum(int a, int b);

	// 接口中都是抽象方法，编写代码的时候，public abstract可以省略
	int sum(int a, int b);

	// 接口中的常量前的 public static final 可以省略
	// public static final double PI = 3.1415926;
	double PI = 3.1415926;
}