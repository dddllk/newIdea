package day17.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
	集合元素的remove()：
		重点：1.当集合的结构发生改变时，迭代器要重新获取。
				 2.如果要继续使用原迭代器，会出现：java.util.ConcurrentModificationException
 				 3.在迭代集合元素的过程中，不能调用集合对象的remove方法，删除元素：
 				 	 c.remove(o);迭代过程中不能这样会出现java.util.ConcurrentModificationException异常
 				 4.获取迭代器来遍历集合相当于给集合照了一个快照，迭代器迭代的时候会参照这个快照进行迭代。
 				 5.c.remove(o);直接通过集合去删除元素，没有通知迭代器（导致迭代器的快照和原集合不同）
 				 6.it.remove();删除的一定是迭代器指向的当前元素，删除得时候会通知迭代器（迭代器的快照和原集合相同）

 		结论：
 				在迭代元素的过程中，如果想删除元素的话一定要使用迭代器的Iterator的remove方法，删除元素。
 */
public class CollectionTest06 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();
		// 获取迭代器
		// 此时获取迭代器，指向的是集合中没有元素状态下的迭代器
		// 注意：集合结构只要发生改变，迭代器必须重新获取
		// 当集合结构发生了改变，迭代器没有重新获取时，调用next()方法会出现：ConcurrentModificationException
		// Iterator it = c.iterator();
		for (int i = 0; i < 10; i++) {
			// 添加元素
			c.add(i);
		}
		// 获取迭代器
		Iterator it = c.iterator();
		while (it.hasNext()) {
		  Object o = it.next();
		  // c.remove(o); // 会出现异常
			// 使用迭代器删除元素
			// 删除的一定是迭代器指向的当前元素
			it.remove();
			System.out.print(o + " ");
		}
		System.out.println("集合中元素的个数为：" + c.size());
	}
}

