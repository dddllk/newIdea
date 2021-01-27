package day19.logutil;

public class LogTest {
	public static void main(String[] args) {
		Logger.log("调用了System.gc()方法启动垃圾回收器");
		Logger.log("调用了System.out()方法输出");
		Logger.log("调用了doSome()方法");
		Logger.log("调用了日志方法！");
	}
}
