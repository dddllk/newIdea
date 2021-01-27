package day20.reflect;

import java.io.FileReader;
import java.util.Properties;

/*
	验证反射机制的灵活性
		java代码写一遍，在不改变java源代码的基础之上，可以做到不同对象的实例化
		非常之灵活，（符合OCP原则）

		Spring、SpringMVC、MyBatis
		...
		这些高级框架底层都有用到反射机制。
 */
public class ReflectTest03 {
	public static void main(String[] args) throws Exception {
		// 通过IO流读取classinfo.properties文件
		FileReader reader = new FileReader("BILI/src/day20/classinfo.properties");
		// 创建Properties对象
		Properties pro = new Properties(); // key value都是String类型
		// 加载
		pro.load(reader);
		// 关闭
		reader.close();

		// 通过key获取value
		String className = pro.getProperty("classname");
		// 通过反射机制实例化对象
		Class c = Class.forName(className);
		// 创建对象
		Object o = c.newInstance();
		System.out.println(o);
	}
}
