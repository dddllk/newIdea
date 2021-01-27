package day18.review;


import java.util.*;

/*
    1.1 每个集合对象的创建（new）
    1.2 向每个集合添加元素
    1.3 从集合中取出元素
    1.4 遍历集合
 */
public class ArrayListTest {
	public static void main(String[] args) {
		// 创建list集合
		List<String> list = new ArrayList<>();
		// 向集合中添加元素
		list.add("dd");
		list.add("xx");
		list.add("ss");

		// 输出集合的个数
		System.out.println(list.size());

		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		// 获取迭代器,从集合中取出元素
		Iterator<String> it = list.iterator();
		// 循环
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}

		System.out.println();

		// for(增强for循环)取出元素
		for(String s : list) {
			System.out.println(s);
		}

		//Linked
		System.out.println("以下是LinkedList输出：");

		// 创建LinkedList集合对象
		// LinkedList没有以下语法，不能传入比较器，但是可以重写CompareTo方法
		// List<Student> list1 = new LinkedList<>(new Comparator<Student>() {});
		List<Student> list1 = new LinkedList<>();
		// 向集合中添加元素
		list1.add(new Student(15, "zhangsan"));
		list1.add(new Student(17,"zhangliu"));
		list1.add(new Student(14,"xiaohua"));
		list1.add(new Student(22,"panda"));
		list1.add(new Student(22,"pande"));
		list1.add(new Student(22,"pandc"));
		
		Collections.sort(list1, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.age == o2.age) {
					return o1.name.compareTo(o2.name);
				}else {
					return o2.age - o1.age;
				}
			}
		});
		// 获取迭代器对象
		Iterator<Student> it1 = list1.iterator();
		// while循环
		while(it1.hasNext()) {
			Student s = it1.next();
			System.out.println(s);
		}
		
	}
}
class Student {
	int age;
	String name;

	public Student() {
	}

	public Student(int age, String name) {
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
		Student student = (Student) o;
		return age == student.age && Objects.equals(name, student.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public String toString() {
		return "Student{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}
}
/*
输出结果（实现Comparable接口）：
	不能进行排序，输入是什么结果，输出也是什么结果
	Student{age=15, name='zhangsan'}
	Student{age=17, name='zhangliu'}
	Student{age=14, name='xiaohua'}
	Student{age=22, name='panda'}
 */
