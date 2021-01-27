package day16.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {
	public static void main(String[] args) throws ParseException {
		Date nowTime = new Date();
		// java.util.Date类的toString()方法已经被重写了
		// 输出的应该不是一个对象的内存地址，应该是一个日期字符串
		// System.out.println(nowTime.toString());

		// 日期可以格式化吗？
		// 日期格式化（SimpleDateFormat）
		// SimpleDateFormat sdf = new SimpleDateFormat("日期格式");
		/*
			yyyy 年
			MM   月
			dd   日
			HH   时
			mm   分
			ss   秒
			SSS  毫秒（毫秒是3位，最高为999, 1000代表1秒）
		 */
		// 日期格式自己定
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String nowTimeString = sdf.format(nowTime);
		System.out.println(nowTimeString);

		// 假设现在有日期字符串，怎么转换为日期
		// 注意：字符串的日期格式要和SimpleDateFormat对象指向的日期格式相同，不然会出现java.text.ParseException异常
		String time = "2008-08-08 08:08:08 888"; // 字符串
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		Date dateTime = sdf1.parse(time);
		System.out.println(dateTime);
	}
}
