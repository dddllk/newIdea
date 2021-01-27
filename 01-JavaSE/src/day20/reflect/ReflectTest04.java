package day20.reflect;
/*
	Class.forName()发生了什么？
		重点：如果你只是希望一个类的静态代码块执行，其他代码不执行，
		你可以使用：Class.forName("完整类名")
		这个方法指向会导致类加载，类加载是，静态代码块执行。

	后面JDBC代码块还需要使用。
 */

public class ReflectTest04 {
	public static void main(String[] args) {
		try {
			// Class.forName执行的时候，会导致类加载。
			Class.forName("day20.reflect.MyClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
class MyClass {
	// 静态代码块在类加载的时候执行，并且只执行一次。
	static {
		System.out.println("静态代码块执行了");
	}
}
