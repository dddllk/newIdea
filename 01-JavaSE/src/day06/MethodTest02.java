package day06;
/*
	方法: 优点：代码得到重复使用
			 本质： 就是一段代码片段，并且这段代码片段可以完成某个特定的功能，并且可以被重复使用
			 单词：Method
			 方法在c语言中当中叫做函数/Function
			 方法定义在类中，在一个类当中可以定义多个方法，方法编写的位置没有先后顺序，可以随意。
 */
public class MethodTest02 {
	public static void main(String[] args) {
		//计算两个int类型的数据
		MethodTest02.sumInt(11, 22);
		MethodTest02.sumInt(333, 999);
	}
	// 单独定义一个方法
	// 该方法完成计算两个int类型的数据，并且将结果输出
	public static void sumInt(int a, int b) {
		int c = a + b;
		System.out.println(a + " + " + b + " = " + c);
	}
}

