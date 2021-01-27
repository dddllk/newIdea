package day17.set;

import java.util.Set;
import java.util.TreeSet;

/*
	TreeSet集合存储元素特点：
		1.无序不可重复的，但是存储的元素可以自动按照从小到大排序！（无序：存进去和取出来的顺序不同，并且没有下标）
			称为：可排序集合。
 */
public class TreeSetTest01 {
	public static void main(String[] args) {
		Set<String> str = new TreeSet<>();
		str.add("C");
		str.add("B");
		str.add("E");
		str.add("A");
		str.add("C");
		str.add("E");
		
		for(String s : str) {
			System.out.print(s + " "); // A B C E (自动从大到小排序)
		}
	}
}
