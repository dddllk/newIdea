package day17.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
	深入集合的contains方法
		boolean contains(Object o)
		判断集合中是否包含某个对象o
		如何包含返回true，如果不包含返回false

		contains方法是用来判断集合中是否包含某个元素的方法，
		那么它在底层是怎么判断集合中是否包含某个元素呢？
			调用equals方法进行比对。
			equals方法返回true，就表示包含这个元素
 */
public class CollectionTest04 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// 向集合中添加元素
		String s1 = new String("aa"); // s1 = 0x1111;
		c.add(s1);

		String s2 = new String("bb"); // s2 = 0x2222;
		c.add(s2);

		// 集合中的元素个数
		System.out.println("元素的个数是：" + c.size()); // 2

		// 新建的对象String
		String x = new String("aa"); // x = 0x3333;

		System.out.println(c.contains(x));


	}
}
