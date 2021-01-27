package day19.logutil;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	public static void log(String msg){
		// 指向一个日志文件
		PrintStream out = null;
		try {
			out = new PrintStream(new FileOutputStream("log.txt", true));
			// 设置输出指向”log.txt“
			System.setOut(out);
			// 获取系统当前日期
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
			String time = sdf.format(now);

			System.out.println(time + " " + msg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
