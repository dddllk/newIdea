package day11;

public class FinalTest02 {
	public static void main(String[] args) {
		// 创建用户对象
		User u = new User(100);
		// 又创建了一个新的User对象
		// 程序执行到此处表示以上对象已变成垃圾数据，等待垃圾回收器回收
		u = new User(101);

		// 创建用户对象
		//
		final User u1 = new User(30);
		// u1 = new User(31); // final修饰的引用一旦指向某个对象之后，不能再指向其他对象，那么被指向的对象无法被垃圾回收器回收
		u1.age = 31; // final修饰的引用虽然指向某个对象之后不能指向其他对象，但是所指的对象内部的数据是可以被修改的
	}
}
