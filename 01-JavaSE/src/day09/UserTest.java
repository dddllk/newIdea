package day09;

public class UserTest {
	public static void main(String[] args) {
		Student student = new Student();
		// 修改
		student.setAge(-100);
		//读取
		System.out.println(student.getAge());
	}
}
