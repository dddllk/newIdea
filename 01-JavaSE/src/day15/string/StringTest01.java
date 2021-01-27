package day15.string;
/*
	关于java jdk 中内置的一个类：java.lang.String
		1.String表示字符串类型，属于引用数据类型，不属于基本数据类型
		2.在java中随便使用双引号括起来的都是String对象
		3.在java中规定，双引号括起来的字符串，是不可变的。开始是什么样，最后就是什么样
		4.在JDK中双引号括起来的字符串，都是直接存储在方法区的字符串常量池当中的。
			字符串存储在常量池中的原因：因为字符串在实际开发中使用太频繁，为了执行效率。
		5.字符串大小比较用compareTo方法
		6.比较两个字符串是否相等必须使用equals方法（equals只能看出是否相等，compareTo不仅可以看出谁大谁小，还可以看出是否相等）
 */
public class StringTest01 {
	public static void main(String[] args) {
		// s1里面保存的不是abc字符串
		// s1里面保存的是“abc”字符串对象的内存地址
		String s1 = "abc";
		System.out.println(s1);
		System.out.println(s1.toString());

		System.out.println("=========");
		byte[] bytes = {97, 98, 99};
		String s2 = new String(bytes);
		System.out.println(s2);
		String s3 = new String(bytes, 1, 2);
		System.out.println(s3);

		System.out.println("=========");
		char[] chars = {97, 98, 99};
		String s4 = new String(chars);
		System.out.println(s4);

		String s5 = new String(chars, 0, 1);
		System.out.println(s5);

		// 前后一致
		int result1 = "abc".compareTo("abc");// 0
		System.out.println(result1);

		// 前小后大
		int result2 = "abcd".compareTo("abce");// -1
		System.out.println(result2);

		// 前大后小
		int result3 = "abce".compareTo("abcd");// 1
		System.out.println(result3);

		// 拿着字符串的第一个字母和后面的字符串的第一个字母比较，能分胜负就不再比较了。
		System.out.println("xyz".compareTo("yxz"));// -1

		// 判断前面的字符串是否包含后边的字符串
		System.out.println("helloWord.java".contains("java"));

		// 判断前面字符串是否以后面的字符串结尾
		System.out.println("helloWord.java".endsWith(".java"));

		// 将字符串对象转换成字节数组
		byte[] bytes1 = "abcdef".getBytes();
		for (int i = 0; i < bytes1.length; i++) {
			System.out.print(bytes1[i] + " ");
		}
		System.out.println();
		System.out.println("================");
		// int indexOf(String str)
		// 判断某个子字符串在当前字符串中第一次出现处的索引
		int i = "strstrstr".indexOf("str");
		System.out.println(i);

		// isEmpty(); 判断字符串是否为空字符串，而不是判断是否是null
		// String s6 = null; 会出现空指针异常
		String s6 = "";
		System.out.println(s6.isEmpty());

		// 面试题：判断数组长度和判断字符串长度不一样
		// 判断数组长度是length属性，判断字符串长度是length()方法
		System.out.println("abc".length());

		// replace(char oldChar, char newChar)
		// 替换
		String newStr = "http://www.baidu.com".replace("http","https");
		System.out.println(newStr);

		String[] newStr1 = "1991-01-01".split("-");
		for (int j = 0; j < newStr1.length; j++) {
			System.out.print(newStr1[j] + " ");
		}

		// public String substring(int beginIndex, int endIndex)
		// 返回一个新的字符串，它是此字符串的一个子字符串，该子字符串从指定的beginIndex处开始，直到索引endIndex-1处的字符

		// toCharArray()
		// 将字符串转换成char数组
		char[] chars1 = "我是中国人".toCharArray();
		for (int j = 0; j < chars1.length; j++) {
			System.out.println(chars1[j]);
		}

		// String trim()
		// 去除字符串前面和后面的空白，中间的空白去不了
		System.out.println("   hello    world   ".trim());

		System.out.println("===================");

		// String 中只有一个方法是静态的，不需要new对象
		// 这个方法叫valueOf()
		// 将“非字符串”转换成“字符串”
		// 参数是一个对象的时候，会自动调用该对象的toString()方法
		String s8 = String.valueOf(new Customer());
		System.out.println(s8);// 没有重写toString()方法之前是一个内存地址，重写之后就是字符串“I am VIP”
		// 通过源码可以发现 System.out.println() 输出引用是，会调用toString()方法
	}
}
class Customer {
	// 没有重写toString()方法
	public String toString() {
		return "I am VIP";
	}
}
