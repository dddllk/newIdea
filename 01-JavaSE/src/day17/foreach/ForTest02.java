package day17.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
	集合使用foreach
 */
public class ForTest02 {
	public static void main(String[] args) {
		// 创建List集合
		List<String> list = new ArrayList<>();
		// 向List集合中添加元素
		list.add("dd");
		list.add("ll");
		list.add("kk");
		
		// 遍历使用迭代器方式
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();
		// 使用for循环变量
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		// 使用增强for循环：foreach
		for(String s: list) {
			System.out.print(s + " ");
		}
	}
}
