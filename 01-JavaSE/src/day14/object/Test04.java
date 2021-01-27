package day14.object;

import java.util.Objects;

public class Test04 {
	public static void main(String[] args) {
		Student s1 = new Student(11,"重庆一中");
		Student s2 = new Student(11,"重庆一中");
		System.out.println(s1 == s2); // false
		System.out.println(Objects.equals(s1, s2)); // true
	}
}
class Student {
	int no;
	String school;

	public Student() {
	}

	public Student(int no, String school) {
		this.no = no;
		this.school = school;
	}

	public String toString() {
	  return "学号" + no + ", 所在学校" + school;
	}

	// 重写equals方法
	// equals方法的编写模式都是差不多的
//	public boolean equals(Object o) {
//	  if (o == null || !(o instanceof Student)) return false;
//	  if (this == o) return true;
//	  // 强制类型转换
//	  Student s = (Student)o;
//	  return (no == s.no && school.equals(s.school)); // String 比较用equals
//	}

	// IDEA自动生成
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return no == student.no && Objects.equals(school, student.school);
	}
}
