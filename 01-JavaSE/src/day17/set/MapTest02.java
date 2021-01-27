package day17.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
	Map集合的遍历【五星重要】
 */
public class MapTest02 {
	public static void main(String[] args) {
		// 第一种方式：获取所有的key，通过遍历key来遍历value
		Map<Integer, String> map = new HashMap<>();
		for(int i = 0; i < 100; i++) {
			map.put(i, "i");
		}

		// 获取所有的key，所有的key是一个Set集合
		Set<Integer> keys = map.keySet();
		// 遍历key，通过key获取value
		// 遍历map集合（Iterator）
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			// 取出其中一个key
		  Integer key = it.next();
		  // 通过key获取value
		  String value = map.get(key);
			System.out.println(key + "=" + value);
		}

		System.out.println();
		// 遍历Map集合（foreach）
		for(Integer key : keys) {
			System.out.println("key = " + key + ",value = " + map.get(key));
		}


		// 第二种方式 Set<Map.Entry<K,V>>	          entrySet()
		// 将Map集合转换成Set集合
		// Set集合中元素的类型是：Map.Entry
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		// 获取set集合迭代器对象
		Iterator<Map.Entry<Integer, String>> it1 = set.iterator();
//		long begin1 = System.currentTimeMillis();
		// 遍历
		while(it1.hasNext()) {
			Map.Entry<Integer, String> entry = it1.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
		}
//		long end1 = System.currentTimeMillis();
//		System.out.println("迭代器所耗费的时间：" + (end1-begin1) + "ms");

		// for循环(效率较高) 适合大数据量访问
//		long begin2 = System.currentTimeMillis();
		for(Map.Entry<Integer, String> entry: set) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
//		long end2 = System.currentTimeMillis();
//		System.out.println("增强for循环所耗费的时间：" + (end2-begin2) + "ms");
	}
}
