package day14.object;

/*
	java语言当中的字符串String有没有重新toString方法，有没有重新equals方法

	总结：
		1.String类已经重写了equals方法，比较两个字符串不能使用“==”，必须要重写equals方法，
			而String已经重写了equals方法
		2.String已经重写了toString()方法

	大结论：
		java中基本数据类型可以使用“==”来判断两个数据是否相等
		java中所有引用数据类型必须使用“equals()”来判断两个数据是否相等
 */
public class Test02 {
	public static void main(String[] args) {
		// 大部分情况下采用如下方法创建字符串
		String s1 = "123";
		String s2 = "456";

		String s3 = new String("789");
		String s4 = new String("789");

		// false
		System.out.println(s3 == s4);
		// 总结：比较两个字符串不能使用“==”
		System.out.println(s3.equals(s4)); // true
		// String已经重写了equals方法
	}
}
