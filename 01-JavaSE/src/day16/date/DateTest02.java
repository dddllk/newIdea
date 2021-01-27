package day16.date;
/*
	获取自1970年1月1日到系统当前时间的总毫秒
 */
public class DateTest02 {
	public static void main(String[] args) {
		long nowTimeMillis = System.currentTimeMillis();
		System.out.println(nowTimeMillis);

		// 统计一个方法耗时
		// 在目标方法前记录一个毫秒数
		// 在目标方法后记录一个毫秒数
		// end - begin就是耗费的毫秒数
		// eg:
		long begin = System.currentTimeMillis();
		print();
		long end = System.currentTimeMillis();
		System.out.println("执行print方法耗费：" + (end - begin) + "毫秒");
	}
	public static void print() {
		for (int i = 0; i < 1111111111; i++) {
			System.out.println("i= " + i);
		}
	}
}
/*
总结一下System类的相关属性和方法：
	System.out                   [out是System类的静态变量]
	System.out.println()         [println()方法不是System类的，是printStream类的方法]
	System.gc()                  [建议启动垃圾回收器]
	System.currentTimeMills()    [获取自1970年1月1日到当前系统时间的总毫秒数]
	System.exit(0)               [退出JVM]
 */