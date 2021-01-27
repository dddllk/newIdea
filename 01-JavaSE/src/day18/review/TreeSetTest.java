package day18.review;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

/*
	  1.1 每个集合对象的创建（new）
    1.2 向每个集合添加元素
    1.3 从集合中取出元素
    1.4 遍历集合
    1.5 测试TreeSet集合中元素是可排序的
    1.6 测试TreeSet集合中存储的类型是自定义的
    1.7 测试实现Comparable接口的方式
    1.8 测试实现Comparator接口的方式（最好测试一下匿名内部类的方式）
 */
/*
总结：
（1）对象实现Comparable接口。
 即Comparable 自然排序。（实体类实现）
（2）定义比较器，实现Comparator接口。
 即Comparator 是定制排序。（无法修改实体类时，直接在调用方创建）

 当Comparable和Comparator都存在时，以Comparator为准。
 */
public class TreeSetTest {
	public static void main(String[] args) {

		// 创建TreeSet对象
		TreeSet<WuGui> ts = new TreeSet<>(new WuGuiComparator());
		// 创建乌龟对象
		WuGui w1 = new WuGui(16,"xiaoming");
		WuGui w2 = new WuGui(889998, "d1");
		WuGui w3 = new WuGui(999, "d4");
		WuGui w4 = new WuGui(999, "d2");

		//将乌龟对象添加到TreeSet中
		ts.add(w1);
		ts.add(w2);
		ts.add(w3);
		ts.add(w4);

		for(WuGui w : ts) {
			System.out.println(w);
		}
	}
}
class WuGui implements Comparable<WuGui>{
	int age;
	String name;

	public WuGui(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		WuGui wuGui = (WuGui) o;
		return age == wuGui.age && Objects.equals(name, wuGui.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public String toString() {
		return "WuGui{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}

	@Override
	public int compareTo(WuGui o) {
		if(this.age == o.age) {
			return this.name.compareTo(o.name);
		}else {
			return o.age - this.age;
		}
	}
}
class WuGuiComparator implements Comparator<WuGui> {

	@Override
	public int compare(WuGui o1, WuGui o2) {
		if(o1.age == o2.age) {
			return o1.name.compareTo(o2.name);
		}else {
			return o2.age - o1.age;
		}
	}
}
