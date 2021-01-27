package day20.reflect;

import java.lang.reflect.Field;

/*
	通过反射机制访问一个java对象的属性值。
 */
public class ReflectTest07 {
	public static void main(String[] args) throws Exception{
		Class studentClass = Class.forName("day20.bean.Student");
		Object obj = studentClass.newInstance(); //obj就是Student对象

		// 获取no属性
		Field noField = studentClass.getDeclaredField("no");
		// 设置属性的值
		noField.set(obj, 111);
		// 获取属性的值
		System.out.println(noField.get(obj));

		// 访问私有属性
		Field nameField = studentClass.getDeclaredField("name");
		// 打破封装:可能会给不法分支留下机会
		// 这样设置完之后，在外部也是可以访问的。
		nameField.setAccessible(true);
		// 给name属性赋值
		nameField.set(obj, "mike");
		// 获取name属性
		System.out.println(nameField.get(obj));
	}
}
