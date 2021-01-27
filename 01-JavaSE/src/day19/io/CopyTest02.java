package day19.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
	使用FileReader FileWriter进行拷贝，只能拷贝普通文本
 */
public class CopyTest02 {
	public static void main(String[] args) {
		FileReader reader = null;
		FileWriter writer = null;

		try {
			reader = new FileReader("IoTest.txt");
			writer = new FileWriter("CopyTest02.txt");

			// 定义数组 一边读一边写
			char[] chars = new char[1024 * 512]; // 1MB
			// 开始读
			int readCount = 0;
			while((readCount = reader.read(chars)) != -1){
				// 不需要输出
				writer.write(chars, 0, readCount);
			}
			//刷新
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		  if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		  if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
