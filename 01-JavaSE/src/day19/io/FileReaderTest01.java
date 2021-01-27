package day19.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
	FileReader:
		文本字符输入流：只读取普通文本
		读取文本内容是，比较方便快捷。
 */
public class FileReaderTest01 {
	public static void main(String[] args) {
		FileReader reader = null;

		try {
			reader = new FileReader("IoTest.txt");
			//开始读
			char[] chars = new char[4];
			int readCount = 0;
			while((readCount = reader.read(chars)) != -1){
				System.out.print(new String(chars, 0, readCount));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
