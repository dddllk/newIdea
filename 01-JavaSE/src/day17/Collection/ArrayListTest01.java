package day17.Collection;

import java.util.ArrayList;
import java.util.List;

/*
	ArrayList集合：
		1.默认初始化容量是10（底层创建了一个长度为0的数组，当添加第一个元素的时候，初始化容量为10）
		2.集合底层是一个Object[]数组
		3.构造方法
			new ArrayList();
			new ArrayList(20)
		4.ArrayList集合的扩容：原容量的1.5倍
		5.数组的优点：
			检索效率比较高
		6.数组的缺点：
			随机增删元素效率比较低
			另外数组无法存储大数据量，因为很难找到大容量的内存空间。
		7.向数组末尾添加元素效率很高，不受影响
		8.面试官经常问的一个问题：你用哪个集合最多？
			ArrayList集合
			因为往数组末尾添加元素不受影响
			另外查询某个元素的操作比较多。
		9.ArrayList集合是非线程安全的。（不是线程安全的集合）
 */
public class ArrayListTest01 {
	public static void main(String[] args) {
		// 默认初始化容量是10
		// 数组长度是10
		List list1 = new ArrayList();
		// 集合的size()方法是获取当前集合中元素的个数，不是集合的容量
		System.out.println(list1.size()); // 10

		// 指定初始容量
		List list2 = new ArrayList(20);
		// 集合的size()方法是获取当前集合中元素的个数，不是获取集合的容量
		System.out.println(list2.size()); // 0
	}
}
/*
	位运算：
		左移 <<
		原数：     0 0 0 0 1 0 1 0      10(十进制)
		左移1位:   0 0 0 1 0 1 0 0      20(十进制)
		左移2位:   0 0 1 0 1 0 0 0	     40(十进制)
		右移 >>
		原数：     0 0 0 0 1 0 1 0      10(十进制)
		左移1位:   0 0 0 0 0 1 0 1      5 (十进制)
		左移2位:   0 0 0 0 0 0 1 0      2 (十进制)
 */