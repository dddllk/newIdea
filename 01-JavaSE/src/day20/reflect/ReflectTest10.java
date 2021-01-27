package day20.reflect;

import java.lang.reflect.Method;

/*
	通过反射机制调用对象的方法
		反射机制，让代码具有通用性。
		可变化的内存都是写到配置文件中，
		将来修改配置文件之后，创建的对象不一样了，调用的方法也不同了
		但是java代码不需要做任何修改。这就是反射机制最大的好处
 */
public class ReflectTest10 {
	public static void main(String[] args) throws Exception{
		// 获取Class
		Class userServiceClass = Class.forName("day20.Service.UserService");
		// 创建对象
		Object obj = userServiceClass.newInstance();
		// 获取Method
		Method loginMethod = userServiceClass.getDeclaredMethod("login", String.class, String.class);
		// 将私有方法设置成公共的，破坏私有。
		loginMethod.setAccessible(true);
		// 调用方法(4个要素)
		// 反射机制中最重要的一个方法，必须记住。
		Object retValue = loginMethod.invoke(obj, "admin", "1234");
		System.out.println(retValue);
	}
}
