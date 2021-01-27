package day18.hash;
/*
	1.向Map集合中存，以及从Map集合中取，都是先调用key的hashCode方法，然后在调用equals方法
	equals方法可能调用，也可能不调用。
		put(k, v),和get(key)什么时候equals方法不会调用？
			k.hashCode()方法返回哈希值，
			哈希值经过哈希算法转换成数组下标。
			数组下标位置上如果是null，equals方法不会执行。
	2.如果一个类的equals方法重写了，那么hashCode方法必须重写。
		并且equals方法如果返回的是true，hashCode方法返回的值必须一样。
		equals返回true，则表示两个对象相同，在同一个单向链表上比较。
		那么对于同一个单向链表上的节点来说，他们的哈希值都是相同的。
		所以hashCode方法的返回值也应该是相同的
	3.hashCode和equals方法不同研究，直接用IDEA方法同时重新生成。

	4.终极结论：
		放在HashMap集合key部分的，以及防止HashSet集合中的元素，需要同时重写hashCode方法和equals方法
 */

import java.util.HashSet;
import java.util.Set;

public class HashMapTest02 {
	public static void main(String[] args) {
		Student s1 = new Student("dd");
		Student s2 = new Student("dd");

		System.out.println("s1's hashCode= " + s1.hashCode());
		System.out.println("s2's hashCode= " + s2.hashCode());

		Set<Student> students = new HashSet<>();
		students.add(s1);
		students.add(s2);

		System.out.println(students.size());

	}
}
