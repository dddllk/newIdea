package day14;
/*
	可以将“实现”看做“继承”
	【******】：当一个非抽象的类实现接口的话，必须将接口中所有的抽象方法全部实现（覆盖、重写）
 */
public class InterfaceTest02 {
	public static void main(String[] args) {
		// 父类型引用指向子类型对象
		MyMath2 mm = new MyMathImpl();
		// 调用接口里面的方法(面向接口编程)
		int result1 = mm.sum(1, 3);
		System.out.println(result1);
		int result2 = mm.sub(4,2);
		System.out.println(result2);
	}
}

interface MyMath2 {
	double PI = 3.1415926535897;
	int sum(int a, int b);
	int sub(int a, int b);
}

// 当一个非抽象的类实现接口的话，必须将接口中所有的抽象方法全部实现（覆盖、重写）
class MyMathImpl implements MyMath2 {
	public int sum(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
}
