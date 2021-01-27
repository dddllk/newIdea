package day19.homework;

import java.io.*;

/*
	拷贝目录：
		需要使用
			FileInputStream
 			FileOutputStream
 			File
 			可能会用到递归

 	面向对象！
 */
public class Test02 {
	public static void main(String[] args) {
		// 拷贝源
		File srcFile = new File("E:\\Java\\Java图片保存");
		// 目标源
		File destFile = new File("C:\\a\\b\\c");
		// 调用方法拷贝
		copyDir(srcFile, destFile);
	}

	/**
	 * 拷贝目录
	 * @param srcFile 拷贝源
	 * @param destFile 目标源
	 */
	private static void copyDir(File srcFile, File destFile) {
		// srcFile 如果是文件，循环结束。
		if(srcFile.isFile()){
			// 进行拷贝...
			// 创建对象
			FileInputStream fis = null;
			FileOutputStream fos = null;
			try {
				// 传入文件（file）
				fis = new FileInputStream(srcFile);
				// 传入路径（字符串）
				// E:\Java\Java图片保存\CollectionTest04.png
				// E:\Java\IoTest\CollectionTest04.png
				String path = getDir(srcFile.getAbsolutePath(), destFile.getAbsolutePath());
				// System.out.println(path);
				fos = new FileOutputStream(path);

				// 创建数组
				byte[] bytes = new byte[1024 * 1024]; // 一次读写1M
				// 一边读一边写
				int readCount = 0;
				while((readCount = fis.read(bytes)) != -1) {
					fos.write(bytes, 0, readCount);
				}
				fos.flush();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
			  if(fos != null){
					try {
						fos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(fis != null) {
					try {
						fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			return;
		}
		// 获取源下面的子目录
		File[] files = srcFile.listFiles();
		// 源文件数
		// System.out.println(files.length);
		// foreach循环
		for(File file: files){
			// 如果是目录
			if(file.isDirectory()){
				// 新建对应目录
				// E:\Java\Java图片保存    源目录
				// E:\Java\IoTest        目标目录
				// 所有文件的绝对路径。
				String srcDir = file.getAbsolutePath(); // 原目录
				String destDir = destFile.getAbsolutePath(); // 目标目录
				// System.out.println(srcDir);
				// System.out.println(destDir);
				// 目标目录(截取目录)
				// 比较路径
				// 循环变量源路径字符串
				destDir = getDir(srcDir, destDir);
				// 创建文件路径
				File newFile = new File(destDir);
				// 如果文件不存在
				if(!newFile.exists()){
					// 创建文件
				  newFile.mkdirs();
				}
			}
			// 递归调用

			copyDir(file, destFile);
		}
	}

	private static String getDir(String srcDir, String destDir) {
		for(int i = 0; i < srcDir.length(); i++){
			if(destDir.charAt(i) != srcDir.charAt(i)) {
				// System.out.println(i);
				if(i == 0){
					destDir = destDir.charAt(i) + srcDir.substring(i + 1);
					System.out.println(destDir);
					break;
				}else {
					destDir = destDir.endsWith("\\") ? destDir : destDir + "\\" + srcDir.substring(i);
				}
				break; // 终止循环
			}
		}
		return destDir;
	}
}
