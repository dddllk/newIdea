package day19.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
	BufferedReader:
		带有缓冲区的字符输入流。
 		使用这个的时候不需要自定义char数组或者byte数组。自带缓冲流。
 */
public class BufferedReaderTest01 {
	public static void main(String[] args) throws IOException {
		// 当一个流的构造方法中需要一个流的时候，这个流被传递进来，叫做节点流。
		// 外部负责包装这个流，叫做：包装流。还有一个名字叫做：处理流。
		// 像当前这个程序来说，fileReader就是一个节点流，BufferedReader就是包装流/处理流
		FileReader reader = new FileReader("tempfile");

		BufferedReader br = new BufferedReader(reader);

		// 读一行
		// String first = br.readLine();
		// System.out.println(first);

		String s = null;
		while((s = br.readLine()) != null) {
			// br.readLine()读取一行文本，不带换行符
			System.out.print(s);
		}
		// 关闭流
		// 对于包装流来说，只需要关闭最外层就行。
		br.close();
	}
}
