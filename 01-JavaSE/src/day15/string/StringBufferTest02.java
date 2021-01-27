package day15.string;
/*
	1.String为啥是不可变的？
		由源代码可以看出，String类中有一个byte[]数组，被final修饰，
		因为数组一旦创建长度不可变，并且被final修饰的引用一旦指向某个对象之后，不可再指向其他对象
		所以String一旦创建是不可变的。
	2.StringBuilder和StringBuffer为什么是可变的呢？
		由源代码可以看出，StringBuilder和StringBuffer内部实际上也是一个byte[]数组，
		这个byte[]数组没有被final修饰，StringBuilder和StringBuffer的初始化容量是16，
		存满之后会扩容，底层调用了数组拷贝的方法：System.arraycopy()进行扩容，适合于使用
		字符串进行频繁拼接操作
 */
public class StringBufferTest02 {
}
