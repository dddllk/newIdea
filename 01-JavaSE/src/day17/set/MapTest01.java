package day17.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
java.util.Map接口中常用的方法：
	1.Map和Collection没有继承关系。
	2.Map集合以key和value的方式存储数据：键值对
		key和value都是引用数据类型
		key和value都是存储对象的内存地址
		key起主导的地位，value是key的一个附属品。
		所以的key是一个set集合
	3.Map接口中常用的方法：
		V	             put(K key, V value)                           向Map集合中添加键值对
		V	             get(Object key)                               通过key获取value
		void           clear()                                       清空Map集合
		boolean	       containsKey(Object key)                       判断Map集合中是否包含某个key
		boolean	       containsValue(Object value)                   判断Map集合中是否包含某个value
		boolean	       isEmpty()                                     判断Map集合是否为空
		Set<K>         keySet()                                      获取Map集合所有的key（所有的key是一个set集合）
		V	             remove(Object key)                            通过key删除键值对
		int	           size()                                        获取Map集合中键值对的个数
		Collection<V>	 values()                                      获取Map集合中所有的value，返回一个Collection

		Set<Map.Entry<K,V>>	entrySet()                               将Map集合转换成Set集合
			假设现在有一个Map集合，如下所示：
			map1集合对象：
			key                  value
			------------------------------
			1                    zhangsan
			2                    lisi
			3                    wangwu
			4                    zhaoliu

			Set set = map1.entrySet();
			set集合对象：
			1=zhangsan【注意：Map集合通过entrySet()方法转换成的这个Set集合，Set集合中的元素类型是Map.Entry<K, V>】
			2=lisi    【Map.Entry和String一样，都是一种类型的名字，只不过Map.Entry都是静态内部类，是Map内部的】
			3=wangwu
			4=zhaoliu
 */
public class MapTest01 {
	public static void main(String[] args) {
		// 创建Map集合对象
		Map<Integer, String> map = new HashMap<>();
		// 向map集合中添加键值对
		map.put(1, "zhangsan");
		map.put(2, "lisi");
		map.put(3, "wangwu");
		map.put(4, "zhaoliu");

		// 通过key获取value
		String v = map.get(2);
		System.out.println(v);
		
		// 获取键值对的数量
		int size = map.size();
		System.out.println(size);

		// 通过key删除 key---value
		Object o = map.remove(1);
		System.out.println(o);

		// 判断是否包含某个key
		// contains方法底层调用的都是equals方法进行比对的，所以指定一的类型需要重写equals方法
		System.out.println(map.containsKey(3)); // true

		// 判断集合中是否包含某个value
		System.out.println(map.containsValue("zhaoliu")); // true

		// 获取所有的value
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.print(value + " ");
		}

		System.out.println();
		// 清空map集合
		map.clear();
		System.out.println(map.size());

		// 判断map是否为空
		System.out.println(map.isEmpty());
	}
}
