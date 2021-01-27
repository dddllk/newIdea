package day17.vector;

import java.util.*;

/*
	Vector集合默认容量是10，用完了之后扩容。
	扩容的数量是以前的二倍。

 */
public class VectorTest01 {
	public static void main(String[] args) {
		Vector vector = new Vector();

		vector.add("123");
		vector.add("456");

		Iterator it = vector.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.print(o + " ");
		}


		// 将非线程安全的转成线程安全的
		List list = new ArrayList();
		// 变成线程安全的
		Collections.synchronizedList(list);

		// list集合就是线程安全的了
		list.add("abc");
		list.add("999");
	}
}
