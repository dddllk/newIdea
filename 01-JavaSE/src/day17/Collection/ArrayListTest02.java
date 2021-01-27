package day17.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ArrayListTest02 {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		List list2 = new ArrayList(100);

		// 创建HashSet集合
		Collection c = new HashSet();
		c.add(20);
		c.add(21);
		c.add(22);

		// 通过这个构造函数就可以将HashSet集合转换成List集合
		List list3 = new ArrayList(c);
		for(int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
	}
}
