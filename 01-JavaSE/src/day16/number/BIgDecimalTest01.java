package day16.number;

import java.math.BigDecimal;

/*
	BigDecimal: 属于大数据，精度极高，不属于基本数据类型，属于java对象（引用数据类型）
	这是SUN公司提供的一个类。专门用在财务软件中
	java.math.BigDecimal
 */
public class BIgDecimalTest01 {
	public static void main(String[] args) {
		// 100不是普通的100，这个100精度极高。
		BigDecimal bd = new BigDecimal(100);
		// 200不是普通的200，这个200精度极高。
		BigDecimal bd2 = new BigDecimal(200);
		// 调用方法求和
		BigDecimal v = bd.add(bd2);
		System.out.println(v);

		BigDecimal v1 = bd.multiply(bd2);
		System.out.println(v1);
	}
}
