package day20.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
	反射属性
 */
public class ReflectTest05 {
	public static void main(String[] args) throws Exception{
		// 获取整个类
		Class studentClass = Class.forName("day20.bean.Student");
		// 获取类的完整类名
		String className = studentClass.getName();
		System.out.println("完整类名：" + className);
		// 简类名
		String simpleName = studentClass.getSimpleName();
		System.out.println("简类名：" + simpleName);
		System.out.println("=====");
		// 获取类中的所有public修饰的Field
		Field[] stuFields = studentClass.getFields(); // 获取所有类中public修饰的属性
		System.out.println(stuFields.length);// 数组中只有一个元素
		System.out.println(stuFields[0].getName()); // 获取该元素的名字

		System.out.println("=======");
		// 获取类中所有Field
		Field[] stuFields1 = studentClass.getDeclaredFields();
		System.out.println(stuFields1.length);
		for(Field stu: stuFields1){
			// 获取类型
			Class fieldType = stu.getType();
			// 获取类型的名字
			String fieldName = fieldType.getName();
			// 输出类型的名字
			System.out.print(fieldName + ",");
			// 输出属性的名字
			System.out.print(stu.getName() + ",");
			// 获取属性的修饰符
			int i = stu.getModifiers(); //返回的修饰符是一个数组，每个数字都是修饰符的代号
			String s = Modifier.toString(i);//将代号转换成字符串
			System.out.println(s);
		}
	}
}
