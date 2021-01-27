package day16.exception;
/*
	异常有两个非常重要的方法：
		获取异常简单的描述信息：
			String msg = exception.getMessage();
		打印异常追踪的堆栈信息：
			exception.printStackTrack(); // 一般使用这个

		以后调试程序的时候，怎么查看异常调试程序呢？
			异常信息追踪信息，从上往下一行一行看
			但是需要注意的是，SUN公司写的代码就不用看了（看包名）。主要问题是出现在自己编写的代码上。
 */
public class ExceptionTest07 {
	public static void main(String[] args) {
		// 这里只为测试getMessage()方法和printStackTrace()方法
		// 这里是new了异常对象，但是没有将异常对象抛出，JVM会认为这是一个普通的java对象
		NullPointerException npe = new NullPointerException("空指针异常");

		// 获取异常简单描述信息：这个信息实际上就是构造方法上String参数
		String msg = npe.getMessage();
		System.out.println(msg);

		// 打印异常堆栈异常信息
		// java后台打印异常堆栈追踪信息的时候，采用了异步线程的方式打印的。
		npe.printStackTrace();

		System.out.println("hello  world!");
	}
}
