package day15.string;

public class StringBufferTest01 {
	public static void main(String[] args) {
		// StringBuffer底层实际上是一个byte[] 数组。
		// 往StringBuffer中放字符串，实际上是放到byte数组中
		// StringBuffer的初始化容量是16
		// 创建一个初始化容量为16个byte[] 数组。（字符串缓冲区对象）

		// 如何优化StringBuffer的性能？
		// 在创建StringBuffer的时候尽可能给定一个初始化容量，最好减少底层数组的扩容次数
		// 关键点在于给定一个合适的容量，提高程序的效率
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("a");
		stringBuffer.append("b");
		stringBuffer.append("c");
		stringBuffer.append(3.14);
		stringBuffer.append(false);
		stringBuffer.append(10l);
		System.out.printf(stringBuffer.toString());

		// 指定初始化容纳的StringBuffer对象（字符串缓冲区对象）
		StringBuffer sb = new StringBuffer(100);

	}
}
