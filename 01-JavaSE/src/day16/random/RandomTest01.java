package day16.random;

import java.util.Random;

public class RandomTest01 {
	public static void main(String[] args) {
		// 创建随机数对象
		Random random = new Random();
		// 随机产生一个int类型取值范围内的数字
		int num1 = random.nextInt();
		System.out.println(num1);

		// 产生0-100之间的随机数,不包括101
		int num2 = random.nextInt(101);
		System.out.println(num2);
	}
}
