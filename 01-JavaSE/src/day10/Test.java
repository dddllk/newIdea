package day10;

public class Test {

	// 没有static的变量
	int i = 10;

	//带有static的方法
	public static void doSome() {
		System.out.println("doSome");
	}
	//没有带有static的方法
	public void doOther() {
		System.out.println("doOther");
	}

	// 带有static的方法
	public static void method1() {
		// 调用doSome
		// 完整方式的调用
		Test.doSome();
		// 省略方式的调用
		doSome();

		// 调用doOther
		// 完整方式的调用
		Test t1 = new Test();
		t1.doOther();
		// 省略方式的调用

		// 访问i
		// 完整方式访问
		System.out.println(t1.i);
		// 省略方式访问
	}

	// 没有带有static的方法
	public void method2() {
		// 调用doSome
		// 完整方式的调用
		Test.doSome();
		// 省略方式的调用
		doSome(); // ???

		// 调用doOther
		// 完整方式的调用
		this.doOther();
		// 省略方式的调用
		doOther();
		// 访问i
		// 完整方式访问
		System.out.println(this.i);
		// 省略方式访问
		System.out.println(i);
	}

	// 主方法
	public static void main(String[] args) {
		// 要求：编写程序调用method1
		// 使用完整方式调用
		Test.method1();
		// 使用省略方式调用
		method1();

		// 要求：编写程序调用method2
		// 使用完整方式调用
		Test t3 = new Test();
		t3.method2();
		// 使用省略方式调用
	}
}
