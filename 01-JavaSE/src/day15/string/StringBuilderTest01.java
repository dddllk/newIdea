package day15.string;

/*
	StringBuffer和StringBuilder的区别？
		StringBuffer中方法都有：synchronized修饰，表示StringBuffer在多线程环境下运行是安全的。
		StringBuilder中方法都有：没有synchronized修饰，表示StringBuffer在多线程环境下运行是不安全的。

		StringBuffer是线程安全的
		StringBuilder是非线程安全的
 */
public class StringBuilderTest01 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
	}
}
