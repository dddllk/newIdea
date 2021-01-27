package day19.io;

import java.io.*;

/*
	BufferedWriter：带有缓冲的字符输出流
 */
public class BufferedWriterTest01 {
	public static void main(String[] args) throws IOException {
		// 带有缓冲区的字符输出流
		// BufferedWriter bw = new BufferedWriter(new FileWriter("IoTest.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("IoTest.txt")));
		bw.write("你好像一条狗啊！");
		bw.write("\n");
		bw.write("你是一条大菜狗！");
		// 刷新
		bw.flush();
		// 关闭
		bw.close();
	}
}
