package day10;
/*
	可以使用static关键字来定义”静态代码块“
		1.语法格式：
			static {
				java语句;
			}
		2.静态代码块在类加载的时候执行，并且只执行一次
		3.静态代码块在一个类中可以编写多个，并且遵循自上而下的顺序依次执行。
		4.静态代码块的的作用？怎么用？什么时候用？
			- 这当然和具体的需求有关，例如项目中要求在类加载的时刻/时机执行代码完成日志记录。
			那么这段记录日志可以编写到静态代码块中，完成日志记录。
			- 静态代码块是java程序员准备的一个特殊时刻，这个特殊时刻被称为类加载时刻，
			若希望在此刻执行一段特殊的程序，这个程序可以直接放到静态代码快中。
		5.通常在静态代码块当中完成预备工作，先完成数据的准备工具，例如：初始化连接池，解析XML文件。。。
 */
public class StaticTest01 {
	static {
		System.out.println("类加载---1");
	}
	static {
		System.out.println("类加载---2");
	}
	static {
		System.out.println("类加载---3");
	}
	public static void main(String[] args) {
		System.out.println("main begin");
	}
}
