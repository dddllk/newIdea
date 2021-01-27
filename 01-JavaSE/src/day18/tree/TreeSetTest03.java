package day18.tree;

import java.util.TreeSet;

public class TreeSetTest03 {
	public static void main(String[] args) {
		Vip v1 = new Vip("dd",12);
		Vip v2 = new Vip("dd",19);
		Vip v3 = new Vip("ll",15);
		Vip v4 = new Vip("kk",12);
		Vip v5 = new Vip("dd",17);

		// 创建TreeSet集合
		TreeSet<Vip> vips = new TreeSet<>();

		// 将vip对象添加进TreeSet集合
		vips.add(v1);
		vips.add(v2);
		vips.add(v3);
		vips.add(v4);
		vips.add(v5);

		// for遍历集合
		for (Vip vip : vips) {
			System.out.println(vip);
		}
	}
}
class Vip implements Comparable<Vip>{
	String name;
	int age;

	public Vip() {
	}

	public Vip(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "VIP[" + name + ", " + age + "]";
	}

	/*
		compareTo 方法的返回值结果很重要：
			返回值等于0表示相同，value会覆盖
			返回值大于0，会继续在右子树上找。
			返回值小于0，会继续在左子树上找。
	 */
	@Override
	public int compareTo(Vip v) {
		// 年龄相同按名字排序
		// 姓名是String类型，可以直接比。调用compareTo方法
		if(this.age == v.age) {
			return this.name.compareTo(v.name);
		}else {
			return this.age - v.age;
		}
	}
}
