package day19.io;

import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
	public static void main(String[] args) {
		File f1 = new File("E:\\Java\\IoTest\\test1.png");

		// 获取文件名
		System.out.println(f1.getName());

		// 判断是否是一个文件
		System.out.println(f1.isFile());

		// 判断是否是一个目录
		System.out.println(f1.isDirectory());

		// 获取文件最后一次修改时间
		long s = f1.lastModified();
		// 将毫秒数转换成日期
		Date time = new Date(s);
		// 日期格式化
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		// 得到日期
		String timeStr = sdf.format(time);
		// 输出
		System.out.println(timeStr);


		// 获取文件大小
		System.out.println(f1.length());
	}
}
