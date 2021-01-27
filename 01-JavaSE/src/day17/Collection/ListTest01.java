package day17.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
	List接口：
		1.list集合存储元素的特点：有序可重复
			有序：list集合中的元素有下标。从0开始，以1递增
			可重复：存储一个1,还可以在存储1.
		2.list既然是Collection接口的子接口，那么肯定list接口中有自己“特色”的方法
			以下只列出list接口中特有的常用的方法：
			void add(int index, Object element)
			Object get(int index)
			int indexOf(Object o)
			int	lastIndexOf(Object o)
			Object set(int index, Object element)
			Object remove(int index)

			// 测试以上代码即可
 */
public class ListTest01 {
	public static void main(String[] args) {
		// 创建list集合
		List list = new ArrayList();

		// 添加元素
		list.add("abc0"); // 默认向集合末尾添加元素
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");

		// 向指定下标（位置）添加指定元素
		// 这个方法使用较少，对于ArrayList来说向指定位置添加元素效率比较低，涉及到元素位移的问题
		list.add(2,"abc4");
		// 迭代
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.print(o + " ");
		}
		// 换个行
		System.out.println();
		// 根据下标获取元素
		Object first = list.get(0);
		System.out.println(first);

		// 因为有下标，所以list集合也有自己的特殊的遍历方式
		// 通过下标遍历
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		System.out.println();
		// 获取指定对象第一次出现处的索引
		System.out.println("元素abc4第一次出现的位置是：" + list.indexOf("abc4")); // 2

		// 获取指定对象最后一次出现处的索引
		System.out.println("元素abc4最后一次出现的位置是：" + list.lastIndexOf("abc4"));

		// 删除指定下标位置的元素
		list.remove(1);
		System.out.println(list.size());

		// 删除指定元素
		// 假如list集合中有两个相同的元素，删除指定元素会默认删除第一个
		list.remove("abc4");
		System.out.println(list.size());

		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		// 修改指定下标元素
		list.set(1, "abc5");
		// 换个行
		System.out.println();

		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		//
//		System.out.println("改之前：" + list.size());
		list.set(3, "abc6");
//		System.out.println("改之后：" + list.size());
		System.out.println();
		// 如果修改的index超出数组元素下标，会出现IndexOutOfBoundsException异常。
		// list.set(4, "abc7");

	}
}
