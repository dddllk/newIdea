package day15.integer;

public class IntegerTest04 {
	public static void main(String[] args) {
		// Integer i = new Integer("中文");
		// System.out.println(i); //运行时出现异常 NumberFormatException

		int retValue = Integer.parseInt("1234"); // String类型转成int类型

		// Integer --> int
		Integer i = 100;
		System.out.println(i.intValue());

		// int --> Integer
		int j = 100;
		System.out.println(Integer.valueOf(j));

		int k = 1;
		String s1 = k + ""; // "1"
		System.out.println(s1 + 1); // "11"
	}
}
