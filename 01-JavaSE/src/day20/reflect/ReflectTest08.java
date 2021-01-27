package day20.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/*
	反射Method
 */
public class ReflectTest08 {
	public static void main(String[] args) throws Exception{
		// 获取类
		Class userServiceClass = Class.forName("day20.Service.UserService");
		// 获取类的所有Method(包括私有的)
		Method[] methods = userServiceClass.getDeclaredMethods();
		System.out.println(methods.length);
		for(Method method : methods) {
			// 获取修饰符类型
			System.out.print(Modifier.toString(method.getModifiers()) + " ");
			// 返回值类型
			System.out.print(method.getReturnType().getSimpleName() + " ");
			// 输出方法名
			System.out.print(method.getName() + " ");
			// 方法的参数列表
			Class[] parameterTypes = method.getParameterTypes();
			for(Class parameterType: parameterTypes) {
				System.out.println(parameterType.getSimpleName() + " ");
			}
		}
	}
}
