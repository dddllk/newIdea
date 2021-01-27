package day14.匿名内部类;

/*
	匿名内部类：
		1.什么是内部类？
			在类的内部又定义了一个新的类，被称为内部类。
		2.内部类的分类：
			静态内部类：类似于静态变量
			实例内部类：类似于实例变量
			局部内部类：类似于局部变量
		3.使用内部类编写的代码，可读性差，能不用尽量不用
		4.匿名内部类是局部内部类的一种
 */
public class Test01 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
//		Compute c = new ComputeImpl();
//		mm.mySum(c, 100,2);
		// 匿名内部类
		// 不建议使用
		// 因为一个类没有名字，没有办法重复使用
		mm.mySum(new Compute() {

			public int sum(int a, int b) {
				return a + b;
			}
		},100 ,200);
	}
}

interface Compute {
	int sum(int a, int b);
}
//class ComputeImpl implements Compute {
//	// 方法的实现
//	public int sum(int a, int b) {
//	   return a + b;
//	}
//}
//
class MyMath {
	public void mySum(Compute c, int a, int b) {
		int value = c.sum(a, b);
		System.out.println(a + " + " + b + " = " + value);
	}
}