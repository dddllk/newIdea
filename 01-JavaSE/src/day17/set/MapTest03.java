package day17.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
	Map集合遍历练习
 */
public class MapTest03 {
	public static void main(String[] args) {
		// 创建map集合
		Map<Integer, String> map = new HashMap<>();
		// 向map集合中添加元素
		for(int i = 0; i < 100; i++) {
			map.put(i, "i");
		}

		// 遍历map集合
		// 第一种：通过key获取value
		Set<Integer> set = map.keySet();
		// 获取迭代器遍历Map集合
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			// 通过key获取value
			String value = map.get(key);
			// 输出
			System.out.println(key + "=" + value);
		}

		System.out.println("=======");
		// 通过for循环获取value
		for(Integer key: set) {
			System.out.println(key + "=" + map.get(key));
		}


		// 第二种方式
		Set<Map.Entry<Integer, String>> set1 = map.entrySet();
		// 通过迭代器的方式
		Iterator<Map.Entry<Integer, String>> it1 = set1.iterator();
		while(it1.hasNext()) {
			Map.Entry<Integer, String> entry = it1.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
		}

		System.out.println("======");
		// 增强for循环的方式
		for(Map.Entry<Integer, String> node : set1) {
			Integer key = node.getKey();
			String value = node.getValue();
			System.out.println(key + "=" + value);
		}
	}
}
