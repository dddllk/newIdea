package day14.object;
/*
	hashCode方法：
		在Object中的hashCode方法是怎么样的？
			public native int hashCode();
			这个方法不是抽象方法，带有native关键字，底层调用C++程序。
		hashCode()实际上就是哈希码：
			实际上就是一个java对象的内存地址，经过哈希算法，得出的一个值。
			所以hasCode() 方法的执行结果可以等同看做一个java对象的内存地址。
 */
public class HashCodeTest {
	public static void main(String[] args) {
		Object o = new Object();
		// 哈希码是int类型
		int hashCodeValue = o.hashCode();
		System.out.println(hashCodeValue);
	}
}
