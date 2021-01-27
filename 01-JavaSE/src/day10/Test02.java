package day10;

public class Test02 {
	public static void main(String[] args) {
		Test02.doSome();
		doSome();

		Test02 t = new Test02();
		t.doSome();

		// 引用是空
		t = null;

		// 执行结果是doSome
		// 但程序执行的时候没有用到t对象
		// 带有static的方法，其实可以采用类名的方式访问，也可以采用引用的方式访问
		// 但即使采用引用的方式访问，实际上执行的时候和引用指向无关
		t.doSome(); // 这里不会出现空指针异常
	}
	// 带有static的方法，需要使用“类名.”的方式访问
	public static void doSome() {
		System.out.println("doSome");
	}
}
