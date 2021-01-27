package day16.number;

import java.text.DecimalFormat;

public class DecimalFormatTest01 {
	public static void main(String[] args) {
		// DecimalFormat 专门负责数字格式化的
		// DecimalFormat df = new DecimalFormat("数字格式");

		/*
			数字格式有哪些：
				#        代表任意数组
				,        代表千分位
				.        代表小数点
				0        代表不够时补0
		 */
		// 加入千分位，保留两位小数
		DecimalFormat df = new DecimalFormat("###,###.##");
		String s = df.format(99999.11);
		System.out.println(s);

		DecimalFormat df1 = new DecimalFormat("###,###.0000");
		String s2 = df1.format(1234.56);
		System.out.println(s2);
	}
}
