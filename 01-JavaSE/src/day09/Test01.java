package day09;

/*
	最终结论：
		方法调用的时候，涉及到参数传递的问题，传递的时候，java只遵循
		一种语法机制，就是将变量中保存的那个“值”传递过去了，只不过有的时候这个值是一个字面值，
		有的时候这个值是领一个java对象的内存地址
 */
public class Test01 {
	public static void main(String[] args) {
		Users u = new Users(20);
		add(u); // 传递u给add方法的时候，实际上传递的是u变量中保存的值，只不过这个值是一个java对象的的内存地址
		System.out.println("main-->" + u.age); // 21
	}
	public static void add(Users u) {
		u.age++;
		System.out.println("add-->" + u.age); // 21
	}
}
class Users {
	// 实例变量
	int age;

	// 构造方法
	public Users(int i) {
		age = i;
	}
}
