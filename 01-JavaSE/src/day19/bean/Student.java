package day19.bean;

import java.io.Serializable;

// 参加序列化的对象必须实现Serializable接口
/*
	Serializable:是一个标志接口：起到标识的作用。给JAVA虚拟机参考的。
							 Java虚拟机看到这个接口之后，会为该类自动生成一个序列号版本号
	Serializable里面没有任何方法
	public interface Serializable {}

	序列化版本号的作用？
 */
public class Student implements Serializable {
	String name;
	int age;

	public Student(String name, int age) {
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
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
