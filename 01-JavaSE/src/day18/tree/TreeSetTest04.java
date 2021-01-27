package day18.tree;

/*
	最终结论：
		放到TreeSet和TreeMap集合key部分的元素想要做到排序，包括两种方式：
			第一种：放在集合中的元素实现java.lang.Comparable接口
			第二种：在构造TreeSet或者TreeMap集合的时候给它传一个比较器
	Comparable（可比较的）和Comparator（工具）怎么选择？
		当比较规则不会发生改变的时候，或者说当比较规则只右一个的时候，建议实现Comparable接口
		放比较规则如果有多个，并且需要多个规则之间频繁切换，建议使用Comparator接口。
		Comparator接口符合OCP原则
 */

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest04 {
	public static void main(String[] args) {

		// 创建乌龟对象
		WuGui w1 = new WuGui(800);
		WuGui w2 = new WuGui(1000);
		WuGui w3 = new WuGui(200);
		WuGui w4 = new WuGui(800);

		// 自定义比较器传入集合中
//		 TreeSet<WuGui> wuGuis = new TreeSet<>(new WuGuiComparator());

		// 使用匿名内部类的方式，
		TreeSet<WuGui> wuGuis = new TreeSet<>(new Comparator<WuGui>() {
			@Override
			public int compare(WuGui o1, WuGui o2) {
				return o1.age - o2.age;
			}
		});

		// 将乌龟对象放入乌龟集合中
		wuGuis.add(w1);
		wuGuis.add(w2);
		wuGuis.add(w3);
		wuGuis.add(w4);
		
		// 遍历乌龟集合
		for(WuGui w : wuGuis) {
			System.out.println(w);
		}
	}
}

class WuGui{
	int age;
	public WuGui(int age) {
	  this.age = age;
	}

	@Override
	public String toString() {
		return "WuGui{" +
				"age=" + age +
				'}';
	}
}

// 单独编写比较器
// 比较器实现java.util.Comparator接口（Comparable是java.lang包下的。Comparator是java.util包下的）

/*class WuGuiComparator implements Comparator<WuGui> {

	@Override
	public int compare(WuGui o1, WuGui o2) {
		return o1.age - o2.age; // 大于0表示升序
	}
}*/
