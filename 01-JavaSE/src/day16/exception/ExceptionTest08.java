package day16.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
	关于try...catch中的finally子句：
		1.在finally子句中的代码是最后执行的，并且是一定会执行的，即使try语句块中的代码出现了异常。
 			finally子句必须和try一起出现，不能单独编写。
 		2.finally语句通常是使用在哪些情况下呢？
 			通常在finally语句块中完成资源的释放/关闭
 			因为finally中的代码比较有保障
 			即使try语句块中的代码出现异常，finally中的代码也会正常执行
 */
public class ExceptionTest08 {
	public static void main(String[] args) {
		FileInputStream fis = null; // 声明位置放到try外面，这样finally中才能用
		try {
			// 创建输入流对象
			fis = new FileInputStream("E:\\Mysql-workspace\\ex1.sql");
			String s = null;
			s.toString();
			// 流使用需要关闭，因为流是占用资源的
			// 即使以上程序出现异常，流也需要进行关闭
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			System.out.println("hello ddd");
			if (fis != null) { // 当fis不是空的时候才关闭，是空的时候就不用关闭，必秒空指针异常
				try {
					// close()使用捕捉的方式
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("hello");
	}
}
