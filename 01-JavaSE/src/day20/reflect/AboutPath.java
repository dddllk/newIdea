package day20.reflect;

import java.io.FileReader;

/*
	路径问题：
		获取文件的绝对路径，以下这种方式是通用的，但是前提是文件要在类的根路径下面。
 */
public class AboutPath {
	public static void main(String[] args) throws Exception {
		// 这种方式的缺点是：移植性差，在IDEA中默认的当前路径就是project的根。
		// 这个代码离开了IDEA，换到了其他位置，可能当前的路径就不是project的根了。
		// 路径就变得无效了。
		FileReader reader = new FileReader("BILI/src/day20/classinfo.properties");

		// 通用路径的写法，即使代码换位置了，代码仍可以使用
		// 使用以下方式的前提，这个文件必须在类路径下
		// 类路径：凡是在src的路径下都是根路径。
		// src是类的根路径

		/*
		Thread.currentThread():当前线程对象
		.getContextClassLoader()是线程对象的方法，可以获取当前线程的类加载对象。
		getResource()类加载器的方法，当前线程的类加载器默认从当前类的根路径下(src)加载资源。

		 适合于各种操作系统。
		 */
		// eg1:
		String path = Thread.currentThread().getContextClassLoader()
				.getResource("day20/classinfo.properties").getPath();
		// /E:/IDEA-Workspace/out/production/BILI/day20/classinfo.properties 绝对路径
		System.out.println(path);
		// eg2:
		String path2 = Thread.currentThread().getContextClassLoader()
				.getResource("day20/bean/db.properties").getPath();
		System.out.println(path2);
	}
}
