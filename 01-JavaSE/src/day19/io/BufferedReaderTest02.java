package day19.io;
/*
	转换流
 */
import java.io.*;

public class BufferedReaderTest02 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			// 字节流
			// fis = new FileInputStream("tempfile");
			// 通过转换流转换(InputStreamReader:将字节转换成字符)
			// fis是节点流 reader是包装流
			// reader = new InputStreamReader(fis);
			// 这个构造方法只能传一个字符流，不能传字节流
			// reader是节点流 br是包装流
			// br = new BufferedReader(reader);
			
			// 合并
			// BufferedReader自带缓冲区，不需要定义数组
			br = new BufferedReader(new InputStreamReader(new FileInputStream("tempfile")));
			// 读
			String line = null;
			while((line = br.readLine()) != null) {
				// readeLine读一行
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
