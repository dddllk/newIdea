package day19.io;

import java.io.FileOutputStream;
import java.io.PrintStream;

/*
	标准字节输出流，默认输出到控制台
 */
public class PrintStreamTest01 {
	public static void main(String[] args) throws Exception{
		PrintStream ps = System.out;
		ps.println("dd");
		System.out.println("dd");
		// 标准输出流不需要手动关闭

		// 标准输出流不再输出到控制台，指向”log“文件
		PrintStream printStream = new PrintStream(new FileOutputStream("log"));
		// 修改输出方向
		System.setOut(printStream);
		// 输出
		System.out.println("你好像一条狗啊！");
		System.out.println("你好像一条狗啊！");
		System.out.println("你好像一条狗啊！");
	}
}
