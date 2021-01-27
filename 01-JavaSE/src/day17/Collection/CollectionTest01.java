package day17.Collection;

/*
	集合：
		1.数组其实就是一个集合，集合实际上就是一个容器，可以来容纳其它类型的数据。
		2.集合不能直接存储基本数据类型，另外集合也不能直接存储java对象，
			集合当中存储的都是java对象的内存地址（或者说集合中存储的是引用）
			注意：
				集合在java中本身是一个容器，是一个对象。
				集合中任何时候存储的都是“引用”
		3.在java中每一个不同的集合，底层会对应不同的数据结构。在不同的集合中
			存储元素，等于将数据放到了不同的数据结构当中。
			什么是数据结构？
				数据存储的结构就是数据结构。不同的存储方式不同
				例如：
					数组、二叉树、哈希、链表...
				你是用了不同的集合等于使用了不同的数据结构。
				应该学会在什么情况下使用什么集合。

				new ArrayList(); 创建一个集合对象，底层是数组
				new LinkedList(); 创建一个集合对象，底层是链表
				new TreeSet(); 创建一个集合对象，底层是二叉树
		4.java中的集合都在java.util.*; 中
		5.在java中的集合分为两大类：
			一类是单个方式存储元素
				单个方式存储元素，这一类集合中超级父接口：java.util.Collection;
			一类是以键值对的方式存储元素
				以键值对方法存储元素，这一类集合中的超级父接口：java.Util.Map;

 */

import java.util.ArrayList;
import java.util.Collection;

/*
	关于java.util.Collection接口中常用的方法
		1.Collection中能存放什么元素？
			没有使用“泛型”前，Collection中可以存储Object的所有子类型。
			使用了“泛型”之后，Collection中只能储存某个具体的类型。
			集合后期会学习“泛型”语法，目前不管。（集合中不能直接存储积分数据类型，也不能存储java对象，指针存储java对象的内存地址）
		2.Collection中的常用方法
			boolean add(Object e) // 向集合中添加元素
			int size(); // 获取集合中元素的个数
			void clear(); // 清空集合
			boolean contains(Object o); // 判断当前集合中是否包含元素(包含返回true，不包含返回false)
			boolean remove(Object o); // 删除集合中的某个元素
			boolean isEmpty(); // 判断该集合中是否为空
			Object[] toArray(); // 将集合转换成数组
*/
public class CollectionTest01 {
	public static void main(String[] args) {
		// 创建一个集合对象
		// 多态
		Collection c = new ArrayList();
		// 测试集合的常用方法
		c.add(100); //自动装箱，实际上是放进去了Integer对象的内存地址 Integer x = new Integer(100);
		c.add(3.14); // 自动装箱
		c.add(new Object());
		c.add(new Student());
		c.add(false);

		System.out.println("集合中的元素个数是：" + c.size());

		c.clear();
		System.out.println("集合中的元素个数是：" + c.size());

		c.add("hello");
		System.out.println("集合中的元素个数是：" + c.size());

		c.add("world");
		c.add("浩克");
		c.add("绿巨人");

		// 判断是否包含“world”
		boolean flag = c.contains("绿巨人");
		System.out.println(flag);

		System.out.println("集合中的元素个数是：" + c.size());

		c.remove("hello");
		System.out.println("集合中的元素个数是：" + c.size());

		System.out.println(c.isEmpty()); // false
		c.clear();
		System.out.println(c.isEmpty()); // true

		c.add("world");
		c.add("浩克");
		c.add("绿巨人");

		// 转换成数组
		Object[] objs = c.toArray();
		for(int i = 0; i < objs.length; i++) {
			// 遍历数组
			Object o = objs[i];
			System.out.println(o);
		}
	}
}
class Student {

}
