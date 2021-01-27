package day19.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
	文件字节输出流，负责写
	从内存到硬盘
 */
public class FileOutputStreamTest01 {
	public static void main(String[] args) {
		FileOutputStream fos = null;

		try {

			// fileTest文件不存在的时候能自动新建
			// 这种方式会将源文件清空，再重新写入。
			// fos = new FileOutputStream("BILI/src/day19/io/IoTest");
			// 以追加的方式在文件末尾写入，不会清空源文件内容
			fos = new FileOutputStream("BILI/src/day19/io/IoTest", true);
			// 开始写
			byte[] bytes = {97, 98, 99, 100};
			// 将byte数组全部写出
			fos.write(bytes);
			// 将byte数组的一部分写出
			fos.write(bytes, 0, 2);

			String s = "你好像一条狗啊！";
			byte[] bytes1 = s.getBytes();
			fos.write(bytes1);

			// 写完之后一定要刷新
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		 	if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
