package day19.io;

import java.io.FileWriter;
import java.io.IOException;

/*
	FileWriter:
		文件字符流：写
		只输出普通文本
 */
public class FileWriterTest01 {
	public static void main(String[] args) {
		FileWriter writer = null;

		try {
			writer = new FileWriter("IoTest.txt", true);

			// 写入字符
			char[] chars = {'你', '好', '像', '一', '条', '狗', '啊', '!', '!'};

			writer.write(chars);

			// 写入换行符
			writer.write('\n');

			// 写入字符串
			writer.write("你好像一条狗啊！！！");
			// 刷新
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
