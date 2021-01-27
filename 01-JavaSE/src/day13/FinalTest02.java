package day13;

/*
	final修饰的引用：该引用只能指向一个对象，并且它只能永远指向该对象，无法再指向其他对象
 	并且在该方法执行过程中，该引用指向该对象之后，该对象不会被垃圾回收器回收，
 	直到当前方法介绍，才会释放空间。
 	虽然final的引用指向对象A后，不能再重新指向对象B。
 	但是对象A内部的数据可以被修改。
 */
public class FinalTest02 {
	public static void main(String[] args) {
		final Person p = new Person(30);
		p.age = 40;
		// p = new Person();
	}
}
class Person {
	int age;
	public Person() {

	}
	public Person(int age) {
	  this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}