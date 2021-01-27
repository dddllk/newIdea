package day17.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
JDK8之后引入了：自动类型推断机制（又称钻石表达式）
 */
public class GenericTest02 {
	public static void main(String[] args) {
		// ArrayList<这里的类型会自动推断>()，前提是JDK8之后才允许
		// 自动类型推断，钻石表达式
		List<Animal> list = new ArrayList<>();
		list.add(new Animal());
		list.add(new Bird());
		list.add(new Cat());

		// 遍历
		Iterator<Animal> it = list.iterator();
		while(it.hasNext()) {
		  Animal a = it.next();
			a.move();
		}
	}
}
