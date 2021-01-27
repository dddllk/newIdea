package day18.review;

import java.util.*;

/*
	  1.1 每个集合对象的创建（new）
    1.2 向每个集合添加元素
    1.3 从集合中取出元素
    1.4 遍历集合
 */
public class HashMapTest {
	public static void main(String[] args) {
		// 创建带有比较器的HashMap对象
		Map<Integer, Teacher> stu1 = new HashMap<>();
		// 向HashMap集合中添加对象
		stu1.put(1, new Teacher("jack", 28,"9207"));
		stu1.put(2, new Teacher("mike", 56,"9207"));
		stu1.put(3, new Teacher("lucy1", 42,"9207"));
		stu1.put(4, new Teacher("lucy2", 42,"920701"));
		stu1.put(5, new Teacher("lucy3", 42,"920702"));
		stu1.put(5, new Teacher("lucy3", 42,"920702"));
		// 第一种
		// 将Map的中的key转换成Set集合
		Set<Integer> ids = stu1.keySet();
		// 获取迭代器对象
		Iterator<Integer> it = ids.iterator();
		// 循环
		while(it.hasNext()) {
			int id = it.next();
			Teacher t = stu1.get(id);
			System.out.println(id + "=" + t);
		}
		System.out.println("======");

		Set<Map.Entry<Integer, Teacher>> set1 = stu1.entrySet();
		// 获取迭代器
		Iterator<Map.Entry< Integer,Teacher>> it2 = set1.iterator();
		while(it2.hasNext()) {
			Map.Entry<Integer, Teacher> entry = it2.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}
}
class Teacher implements Comparable<Teacher>{
	String name;
	int age;
	String birth;

	public Teacher() {
	}

	public Teacher(String name, int age, String birth) {
		this.name = name;
		this.age = age;
		this.birth = birth;
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

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Teacher teacher = (Teacher) o;
		return age == teacher.age && Objects.equals(name, teacher.name) && Objects.equals(birth, teacher.birth);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age, birth);
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"name='" + name + '\'' +
				", age=" + age +
				", birth='" + birth + '\'' +
				'}';
	}

	@Override
	public int compareTo(Teacher t) {
		return 0;
	}
}
