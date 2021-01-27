package day19.io;

import java.io.File;

/*
	File中的listFile方法。
		获取文件夹下的所有文件
 */
public class FileTest03 {
	public static void main(String[] args) {
		// File[]	listFiles() 返回值是一个数组
		File f = new File("E:\\Java");
		File[] files = f.listFiles();
		//foreach
		for(File file :files){
			System.out.println(file.getAbsolutePath());
		}
	}
}
