package day16.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
	public static void main(String[] args) {

		// 1970-01-01 00:00:00 100
		Date time = new Date(100);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String strTime = sdf.format(time);
		// 北京是东8区，差8个小时
		// 1970-01-01 08:00:100
		System.out.println(strTime);

		// 获取昨天此时的时间
		Date time2 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
		String strTime2 = sdf.format(time2);
		System.out.println(strTime2);
	}
}
