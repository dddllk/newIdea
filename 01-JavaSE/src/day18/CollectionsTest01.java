package day18;

/*
	java.util.Collection 集合接口
	java.util.Collections 集合工具类，方便集合的操作
 */

import java.util.*;

public class CollectionsTest01 {
	public static void main(String[] args) {
		// ArrayList不是线程安全的
		List<String> list = new ArrayList<>();

		// 变成线程安全的
		Collections.synchronizedList(list);

		// 排序
		list.add("aaa");
		list.add("abc");
		list.add("abx");
		list.add("abe");

		Collections.sort(list);
		
		for(String s: list) {
			System.out.println(s);
		}

		List<WuGui2> wuGuis = new ArrayList<>();
		wuGuis.add(new WuGui2(16));
		wuGuis.add(new WuGui2(111));
		wuGuis.add(new WuGui2(333));
		wuGuis.add(new WuGui2(0));
		// 对list集合中进行排序，需要保证list集合中的元素实现了Comparable接口
		Collections.sort(wuGuis);

		for(WuGui2 wuGui2 : wuGuis) {
			System.out.print(wuGui2 + " ");
		}

		System.out.println();
		// 对Set集合怎么排序呢？
		Set<String> set = new HashSet<>();
		set.add("dd");
		set.add("dl");
		set.add("dk");
		// 将Set集合转换成List集合
		// 将Set集合作为参数传入List集合
		List<String> list1 = new ArrayList<>(set);
		Collections.sort(list1);

		for(String l: list1) {
			System.out.println(l);
		}

		//　比较器的方式　Collections.sort(list集合，比较器对象);
		Collections.sort(list1, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
	}
}

class WuGui2 implements Comparable<WuGui2> {
   int age;

	public WuGui2(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "WuGui2{" +
				"age=" + age +
				'}';
	}

	@Override
	public int compareTo(WuGui2 o) {
		return this.age - o.age;
	}
}