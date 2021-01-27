package day19.io;

/*
最终版
	int read(byte[] b)
		一次读写byte.length个字节，减少内存和硬盘的交互
		往byte数组中读，提高程序的执行效率。
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			// IDEA 默认的当前路径：工程Project的根就是IDEA的默认当前路径
			fis = new FileInputStream("BILI/src/day19/io/IoTest");
			// 定义数组（如果出现中文乱码，需要将数组的容量扩大！）
			byte[] bytes = new byte[130];
/*			while(true) {
				int readCount = fis.read(bytes); // 一次读写byte.length个字节
				if(readCount == -1){
					break;
				}
				System.out.print(new String(bytes, 0, readCount)); // 读多少个转多少个。
			}*/
			int readCount = 0;
			// readCount = fis.read(bytes) 结果不等于-1表示继续读，输出。如果等于-1.while括号里面是false，结束循环
			while((readCount = fis.read(bytes)) != -1) {
				System.out.print(new String(bytes, 0, readCount));
			}
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
