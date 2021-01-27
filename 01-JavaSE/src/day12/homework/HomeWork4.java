package day12.homework;

public class HomeWork4 {
	public static void main(String[] args) {
		Person person = new Person("Dd",26);
		person.display();
	}
}
class Person {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
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

	public void display() {
		System.out.println("姓名：" + getName() + " 电话：" + getAge());
	}
}
