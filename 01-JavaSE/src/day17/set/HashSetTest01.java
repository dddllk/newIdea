package day17.set;

import java.util.HashSet;
import java.util.Set;

/*
HashSet
 */
public class HashSetTest01 {
	public static void main(String[] args) {
		Set<String> str = new HashSet<>();

		// 添加元素
		str.add("123");
		str.add("123");
		str.add("456");
		str.add("567");
		str.add("456");

		for(String s : str) {
			System.out.print(s + " ");
		}
	}
}
