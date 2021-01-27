package day18.tree;
/*
	1.TreeSet集合底层实际上是一个TreeMap
	2.TreeMap集合底层是一个二叉树
	3.放到TreeSet集合中的元素，等同于放到了TreeMap集合的key部分了。
	4.TreeSet集合中的元素：无序不可重复，但是可以按照元素从大到小自动排序，称为可排序集合。
 */
/*
	对于自定义类型来说，TreeSet可以排序吗？
		以下程序中对于Person类型来说，无法排序。因为没有指定Person对象之间的比较规则。
		谁大谁小并没有说明。
		
		以下程序运行出现java.lang.ClassCastException异常
		出现这个异常的原因是：
			Person类没有实现java.lang.Comparable接口。
 */

import java.util.TreeSet;

public class TreeSetTest01 {
	public static void main(String[] args) {

		// 创建Person对象
		Person p1 = new Person("dd");
		Person p2 = new Person("ll");
		Person p3 = new Person("ll");

		// 创建TreeSet集合
		TreeSet<Person> persons = new TreeSet<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);

		// 遍历TreeSet
		for(Person p: persons) {
			System.out.println(p);
		}
	}
}

class Person implements Comparable<Person>{
	private String name;

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person[" + name + "]";
	}

	@Override
	public int compareTo(Person p) {
		return this.name.compareTo(p.name);
	}
}
