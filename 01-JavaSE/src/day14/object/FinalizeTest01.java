package day14.object;

/*
	关于Object类中的finalize()方法
		1.在Object类中的源代码
			protected void finalize() throws Throwable {}
		2.finalize() 方法只有一个方法体，里面没有代码，而且这个方法是protected修饰的
		3.这个方法不需要程序员手动调用，JVM的垃圾回收器负责调用这个方法。
			finalize()只需要重写，重写完将来自动会有程序来调用
		4.finalize()方法的执行时机：
			当一个java对象即将被垃圾回收器回收的时候，来及回收器负责调用finalize()方法
		5.finalize() 方法实际上是SUN公司为java程序员准备的一个时机，垃圾销毁时机。
			如果希望在对象销毁时机执行一段代码的话，这段代码要写到finalize()方法当中。

		6.static静态代码块的作用是什么？
			static {...}
			静态代码块在类加载的时机执行，并且只执行一次。
			这是一个SUN准备的类加载时机

			finalize()方法同样也是SUN为程序员准备的一个时机。
			这个时机是垃圾回收时机。
 */
public class FinalizeTest01 {
	public static void main(String[] args) {
		// 创建对象
		Person p = new Person();
		// 把Person对象变成垃圾
		p = null;
	}
}
class Person {
	// 重写finalize方法

	@Override
	protected void finalize() throws Throwable {
		System.out.println("即将被销毁！");
	}
}
