package day15.array;
/*
	main 上“String[] args”的作用：
		JVM负责调用main方法
 */
public class ArrayTest05 {
	public static void main(String[] args) {
		// args默认长度为0
		// 其实这个数据是留给用户的，用户可以在控制台上输入参数，这个参数会被转换为“String[] args”
		// String[] args主要是用来接收用户输入的
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		printLength(args);
	}
	public static void printLength(String[] args) {
		System.out.println(args.length);
	}
}
