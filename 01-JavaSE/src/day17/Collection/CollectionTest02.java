package day17.Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
	集合遍历|迭代（重点）
 */
public class CollectionTest02 {
	public static void main(String[] args) {
		// 注意以下遍历|迭代的方式，是所有Collection通用的一种方式。
		// 在Map集合中不能用。在所有Collection以及子类中使用。

		// 创建集合对象
		Collection c = new HashSet(); // 多态添加元素
		// 添加元素
		for(int i = 0; i < 10; i++) {
			c.add(i);
		}
		// 添加对象元素
		c.add(new Object());
		// 对集合Collection进行变量|迭代
		// 第一步：获取集合对象的迭代器对象Iterator
		Iterator it = c.iterator();
		// 第二步：通过以上获取的迭代器对象开始迭代|遍历集合
		/*
			迭代器的三个方法：
				boolean	hasNext(); 如果仍有元素可以迭代，则返回true
				Object next();  返回迭代的下一个元素

				void	remove()
		 */

		while(it.hasNext()) {
			// 不管存进去的是什么，取出来的都是Object
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
