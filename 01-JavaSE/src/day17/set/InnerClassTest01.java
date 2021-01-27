package day17.set;

import java.util.HashSet;
import java.util.Set;

/*
	声明一个静态内部类
 */
public class InnerClassTest01 {
	private static class InnerClass {
		// 静态方法
		public static void m1() {
			System.out.println("静态内部类的m1方法执行");
		}

		// 实例方法
		public void m2() {
			System.out.println("静态内部类的实例方法执行");
		}
	}

	public static void main(String[] args) {
		// 类名是InnerClassTest01.InnerClass
		InnerClassTest01.InnerClass.m1();

		// 创建对象
		InnerClassTest01.InnerClass ii = new InnerClassTest01.InnerClass();
		// 方法执行
		ii.m2();
		
		// 给一个Set集合
		// 该Set集合中存储的对象是InnerClassTest01.InnerClass类型
		Set<InnerClassTest01.InnerClass> set = new HashSet<>();

		// 这个Set集合中存储的是字符串对象
		Set<String> set2 = new HashSet<>();

		Set<MyMap.MyEntry<Integer, String>> set3 = new HashSet<>();
	}
}

class MyMap {
	public static class MyEntry<K, V> {

	}
}
