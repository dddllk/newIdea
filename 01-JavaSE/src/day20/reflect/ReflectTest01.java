package day20.reflect;

import java.util.Date;

/*
	要操作一个类的字节码，需要首先获取到这个类的字节码
		三种方式：
			第一种：Class.forName()
			第二种：对象.getClass()
			第三种方式：.class属性
 */
public class ReflectTest01 {
	public static void main(String[] args) {
		Class c1 = null;
		Class c2 = null;
		/*
			Class.forName()
				1.静态方法
				2.方式的参数是一个字符串
				3.字符串需要的是一个完整的类名
				4.完整的类名必须带有包名：java.lang包也不能省略
		 */
		try {
			c1 = Class.forName("java.lang.String"); // c1代表String.class文件，或者说c1代表String类型
			c2 = Class.forName("java.util.Date"); // c2代表Date类型
			Class c3 = Class.forName("java.lang.Integer"); // c3代表Integer类型
			Class c4 = Class.forName("java.lang.System"); // c4代表System类型
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 第二种方式：java中有任何一个对象都有一个方法：getClass()
		String s = "abc";
		Class x = s.getClass(); // x代表String类型
		// 内存地址相同
		System.out.println(c1 == x);

		Date date = new Date();
		Class y = date.getClass();
		System.out.println(c2 == y);

		// 第三种方式：java语言中任何一种类型，也包括基本数据类型，它都有.class属性
		Class z = String.class; // z代表String类型
		Class k = Date.class; // k代表Date类型
		Class f = int.class; // f代表int类型
		Class e = double.class; // e代表double类型
	}
}
