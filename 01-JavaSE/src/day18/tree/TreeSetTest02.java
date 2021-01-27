package day18.tree;

/*
	自定义类型实现Comparable接口，重写compareTo方法
 */

import java.util.TreeSet;

public class TreeSetTest02 {
	public static void main(String[] args) {
		// 创建Customer对象
		Customer c1 = new Customer(26);
		Customer c2 = new Customer(37);
		Customer c3 = new Customer(42);
		Customer c4 = new Customer(21);
		Customer c5 = new Customer(26);

		// 创建Set集合
		TreeSet<Customer> customers = new TreeSet<>();

		// 向Set集合中添加元素
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		customers.add(c5);
		
		// 遍历Set集合
		for(Customer c : customers){
			System.out.println(c);
		}
	}
}
class Customer implements Comparable<Customer>{
	int age;

	public Customer(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer[" + age + "]";
	}

	// 自定义比较规则
	@Override
	public int compareTo(Customer c) { // c1.compareTo(c2)
		// this 是 c1
		// c    是 c2
		// c1和c2比较的时候，就是this和c比较
		return this.age - c.age; // >0 升序  <0 降序
	}
}
