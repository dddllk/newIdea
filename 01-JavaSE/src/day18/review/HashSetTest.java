package day18.review;

import java.util.*;

/*
    1.1 每个集合对象的创建（new）
    1.2 向每个集合添加元素
    1.3 从集合中取出元素
    1.4 遍历集合
    1.5 HashSet集合的特点（无序不可重复）
 */
/*
	结论：
		输出结果无序，且没有重复
		实现Comparable接口也不能改变输出顺序，即不可排序的
		也不能用new Comparator匿名内部类的方式
 */
public class HashSetTest {
	public static void main(String[] args) {
		// 创建Set集合
		Set<String> s1 = new HashSet<>();
		// 向Set集合中添加元素
		s1.add("jack");
		s1.add("merry");
		s1.add("luck");
		s1.add("mike");
		s1.add("merry");
		
		// 输出集合个数
		System.out.println(s1.size());

		// 获取迭代器对象
		Iterator<String> it1 = s1.iterator();
		// 循环
		while(it1.hasNext()) {
			System.out.println(it1.next()); // 输出结果无序，且没有重复
		}

		// 创建Set集合
		Set<Vip> s2 = new HashSet<>();
		// Set集合添加Vip对象
		s2.add(new Vip(18,"jack"));
		s2.add(new Vip(21,"lucy"));
		s2.add(new Vip(14,"mike"));
		
		for(Vip v: s2) {
			System.out.println(v);
		}
	}
}
class Vip{
	int age;
	String name;

	public Vip() {
	}

	public Vip(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Vip vip = (Vip) o;
		return age == vip.age && Objects.equals(name, vip.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public String toString() {
		return "Vip{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}

/*	@Override
	public int compareTo(Vip v) {
		if(this.age == v.age) {
			return this.name.compareTo(v.name);
		}else {
			return this.age - v.age;
		}
	}*/
}
