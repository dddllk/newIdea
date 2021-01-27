package day20.reflect;
/*
	可变长度参数
		1.可变参数个数是0-N个
		2.Var arg parameter must be the last in the list，且可变参数长度只能有一个
 		3.可变长度参数可以当做一个数组
 */
public class ArgsTest {
	public static void main(String[] args) {
		m();
		m1(10,"abc");
		m(10, 30);

		String[] str = {"a", "b", "c"};
		// 传递数组
		m1(1, str);
	}

	public static void m(int ...args){
		for(int i = 0;i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("m方法执行了了");
	}
	public static void m1(int a, String ...args1){
		System.out.println("m1方法执行了了");
	}
}

