package day15.integer;

public class IntegerTest05 {
	public static void main(String[] args) {
		// String --> int
		int i1 = Integer.parseInt("100");
		System.out.println(i1 + 1); // 101

		// int --> String
		String s2 = i1 + "";
		System.out.println(s2 + 1); // "1001"

		// int --> Integer
		// 自动装箱
		Integer i2 = 100;

		// Integer --> int
		// 自动拆箱
		int i3 = i2;

		// String --> Integer
		Integer i4 = Integer.valueOf("123");
		// Integer --> String
		String.valueOf(i4);
	}
}
