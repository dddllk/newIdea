package day20.reflect;
/*
	获取到class，能干什么？
		同Class的newInstance()方法，newInstance方法必须保证无参构造方法的存在。
 */
public class ReflectTest02 {
	public static void main(String[] args) {
		// 通过class来实例化对象
		try {
			Class c = Class.forName("day20.bean.User");
			// newInstance会调用User的无参数构造方法。
			// 重点是newInstance的无参构造方法，必须保证无参构造方法是存在的
			Object o = c.newInstance();
			System.out.println(o);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
	}
}
