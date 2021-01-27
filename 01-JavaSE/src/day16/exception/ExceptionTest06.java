package day16.exception;
/*
	深入try...catch
		1.catch后面小括号中间的类型可以是具体的类型，也可以是该类型的父类型
		2.catch可以写多个，建议catch的时候，精确的一个一个处理。这样有利于程序的调试
 		3.catch写多个的时候，从上到下，必须遵循从小到大。
 		4.jdk8新特性：catch小括号里面可以catch多个异常

 	在以后的开发中，处理编译时异常的标准：如果希望调用者来处理，选择throws上报，其他情况使用捕捉的方式
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest06 {
	public static void main(String[] args) {
		try {
			// 创建输入流
			FileInputStream fis = new FileInputStream("F:\\下载\\浏览器下载\\车险\\机动车交通事故责任强制保险条款.pdf");
			fis.read();
			System.out.println("以上出现异常，这里无法执行");
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在！");
		} catch (IOException e) {
			System.out.println("读文件报错了！");
		}
		// 假设文件路径不存在
		// 处理异常之后 hello world会继续输出
		System.out.println("hello world");
	}
}
