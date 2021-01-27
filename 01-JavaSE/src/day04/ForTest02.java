package day04;
/*
	i 变量的作用域
 */
public class ForTest02 {
	public static void main(String[] args) {
		// 以下for循环当中“i”变量的作用域仅限当前for循环内部使用。
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		// 下行这个i变量无法访问
		// System.out.println(i);

		// main方法作用域当中的i变量，只要main方法没有结束，这里i就能用。
		int i = 0;
		for(; i < 10; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("i = " + i); // 10
	}
}
