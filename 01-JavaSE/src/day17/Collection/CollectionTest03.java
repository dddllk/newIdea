package day17.Collection;

import java.util.*;

public class CollectionTest03 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c1 = new ArrayList();
		// 添加元素
		for(int i = 0; i < 10; i++) {
			c1.add(i);
		}
		// 迭代集合
		Iterator it = c1.iterator();
		while(it.hasNext()) {
			// 存进去是什么类型，取出来就是什么类型
			Object o = it.next();
			// 只不过在输出的时候会转换成字符串。
			// println会自动调用toString()方法。
			System.out.print(o + " ");
		}

		System.out.println();

		// HashSet无序不可重复
		Collection c2 = new HashSet();
		// 无序：存进去和取出来的顺序不一定相同。
		// 不可重复：存储12，不能再存储12
		c2.add(12);
		c2.add(24);
		c2.add(36);
		c2.add(48);
		c2.add(12);
		c2.add(24);
		c2.add(36);
		c2.add(48);
		c2.add(60);

		Iterator it2 = c2.iterator();
		while(it2.hasNext()) {
		  Object o = it2.next();
			System.out.print(o + " ");
		}
	}
}
