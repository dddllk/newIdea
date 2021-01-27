package day19.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
	FileInputStream类的其它常用方法：
		int available(): 返回流当中剩余没有读到的字节数量
		long skip(long n)：跳过几个字节不读
		skip 跳过几个字节
 */
public class FileInputStreamTest03 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			// 第一个路径前面没有"/"
			fis = new FileInputStream("BILI/src/day19/io/IoTest");
			System.out.println("总字节数：" + fis.available());
			// 读取一个字节
			// int readByte = fis.read();
			// 还剩下多少个字节可以读
			// System.out.println(fis.available());
			// 这个方法有什么用
			// fis.available()可以用来指定数组的长度
			// 不能用于读取大文件，因为byte有取值范围
			// byte[] bytes = new byte[fis.available()];
			// 不需要循环了，只读一次
			// int readCount = fis.read(bytes);
			// 输出
			// System.out.println(new String(bytes));
			// 跳过几个字节
			fis.skip(3);
			// 然后开始读
			System.out.println(fis.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		 	if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
