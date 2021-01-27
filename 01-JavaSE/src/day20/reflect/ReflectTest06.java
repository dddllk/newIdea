package day20.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

// 通过反编译，反编译一个类的Field
public class ReflectTest06 {
	public static void main(String[] args) throws Exception{
		// 创建StringBuilder拼接字符串
		StringBuilder sb = new StringBuilder();

		Class studentClass = Class.forName("java.lang.Integer");

		sb.append(Modifier.toString(studentClass.getModifiers()) + " " +"class " + studentClass.getSimpleName() +" {\n");

		Field[] fields = studentClass.getDeclaredFields();

		for(Field field : fields) {
			sb.append("\t");//添加制表符
			sb.append(Modifier.toString(field.getModifiers())); // 添加权限修饰符
			sb.append(" "); // 添加空格
			sb.append(field.getType().getSimpleName()); // 添加简单类名
			sb.append(" "); // 添加空格
			sb.append(field.getName()); // 添加属性名
			sb.append(";\n"); // 添加分号及换行符
		}
		sb.append("}");
		System.out.println(sb);
	}
}
