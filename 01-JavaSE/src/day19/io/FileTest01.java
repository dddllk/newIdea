package day19.io;

import java.io.File;

/*
	File:
		1.File类和四大家族没有关系，所以file类不能完成文件的读和写
 */
public class FileTest01 {
	public static void main(String[] args) {

		// 创建一个file对象
		File f1 = new File("E:\\Java\\IoTest02");
		// f1.exists()文件是否存在
		if(!f1.exists()){ // 如果文件夹不存在，则创建
			f1.mkdirs();
		}
		// 获取父节点
		System.out.println(f1.getParent());
	}
}
