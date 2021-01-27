package day19.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
	java.io.FileInputStream:
		1.文件字节输入流，万能的，任何文件类型都可以采用这个流来读取。
		2.字节流的方式：字节的方式：完成文件的读的操作（硬盘---》内存）。

	分析这个程序的缺点：
		一次读取一个字节byte，这样内存和硬盘交互太频繁。基本上时间/资源都耗费在交互上面了。
 		能不能一次读取多个字节呢？（可以）
 */
public class FileInputStreamTest01 {
	public static void main(String[] args) {
		System.out.println("你好像一条狗啊！");
		FileInputStream fis = null;
		// 创建文件字节流输入对象
		// 文件路径要用反双斜杠
		// 以下路径都是采用绝对路径的方式
		try {
			fis = new FileInputStream("E:\\Java\\IoTest.txt");
			// 读不到数据返回-1
			/*
			写法一：
			while(true) {
				// 开始读
				int readData = fis.read(); // 这个方法的返回值是：读取到"字节"本身
				if(readData == -1) break;
				System.out.print(readData + " "); // 97
			}*/
			// 写法二（改造while循环）
			int readData = 0;
			while((readData = fis.read()) != -1) {
				System.out.println(readData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 在finally语句块当中确保流一定关闭
			if (fis != null) {
				// 关闭流的前提流不是空，流不是空没有必要关闭。
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
