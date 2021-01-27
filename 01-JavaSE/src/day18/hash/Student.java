package day18.hash;

import java.util.Objects;

public class Student {
	private String name;

	public Student() {

	}

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 重写equals
/*	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null || !(o instanceof Student)) return false;
		Student s = (Student)o;
		return this.name.equals(s.name);
	}*/

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return Objects.equals(name, student.name);
	}

	public int hashCode() {
		return Objects.hash(name);
	}
}
