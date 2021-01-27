package day19.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
	拷贝目录：
		需要使用
			FileInputStream
 			FileOutputStream
 			File
 			可能会用到递归
 */
public class Test01 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// 创建文件对象
		File f1 = new File("E:\\Java\\Java图片保存");
		File f2 = new File("E:\\Java\\IoTest");
		// 创建目标文件
		if(!f2.exists()) {
		  f2.mkdirs();
		}
		// 列出源文件
		File[] files = f1.listFiles();
		for(File file :files){
			// System.out.println(file);
			// 创建FileInputStream对象
			fis = new FileInputStream(file.getAbsolutePath());
		}

	}
}
