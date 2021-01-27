package day15.integer;
/*
	自动装箱和自动拆箱：
		自动装箱：基本数据类型自动转换成包装类
		自动拆箱：包装类自动转换成基本数据类型
	有了自动拆箱之后，Number类中的方法就用不着了
 */
public class IntegerTest03 {
	public static void main(String[] args) {
		// 20是基本数据类型
		// i是包装类型
		// 基本数据类型 ---》（自动转换） ---》包装类型：自动装箱
		Integer i = 20;
		System.out.println(i);

		// i 是包装类型
		// j 是基本数据类型
		// 包装类型 --》（自动转换）--》基本数据类型：自动拆箱
		int j = i;

		Integer z = 100;
		// "+" 两边要求是基本数据类型的数组，z是包装类，不属于基本数据类型，这里会进行自动拆箱。
		// 将z转换成基本数据类型再做运算
		// 在java5之后才能进行这样写
		System.out.println(z + 1);

		Integer a = 1000; // Integer a = new Integer(1000); a是一个引用，保存内存地址指向对象
		Integer b = 1000; // Integer b = new Integer(1000); b是一个引用，保存内存地址指向对象

		// == 比较的是对象的内存地址，a和b两个引用中保存的对象内存地址不同
		// == 这个运算符不会除法自动拆箱机制。(只有 + - * / 等运算的时候才会触发自动拆箱机制)
		System.out.println(a == b); // false
	}
}
