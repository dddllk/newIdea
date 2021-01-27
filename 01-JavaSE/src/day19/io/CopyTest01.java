package day19.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
	使用FileInputStream + FileOutputStream完成文件的拷贝
	拷贝的过程是一边读一边写
	使用以上的字节流拷贝文件的时候，文件类型随意，万能的，什么样的文件都能拷贝。
 */
public class CopyTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("F:\\BaiduNetdiskDownload\\三维\\SolidWorks系列视频\\composer-2\\composer\\视频\\03.mp4");
			fos = new FileOutputStream("E:\\Java\\IoTest\\test2.mp4");

			// 一边读 一边写
			byte[] bytes = new byte[1024 * 1024]; // 一次读1M
			int readCount = 0;
			while((readCount = fis.read(bytes)) != -1){
				fos.write(bytes, 0, readCount);
			}
			// 刷新，输出流最后一定要刷新。
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		 // 分开处理异常	，一起try的时候，可能引起另一个流的关闭
		 if (fis != null) {
			 try {
				 fis.close();
			 } catch (IOException e) {
				 e.printStackTrace();
			 }
		 }
		 if (fos != null) {
			 try {
				 fos.close();
			 } catch (IOException e) {
				 e.printStackTrace();
			 }
		 }
		}
	}
}
