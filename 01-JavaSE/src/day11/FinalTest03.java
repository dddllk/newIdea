package day11;

public class FinalTest03 {
	public static void main(String[] args) {
		System.out.println(Chinese.NATION);
	}
}
class Chinese {
	// 国籍
	// 每个中国人的国籍都是中国，而且国籍不会发生改变，为了防止国籍被修改，建议加final修饰
	// final修饰的实例变量是不可变的，这种变量一般和static联合使用，被称为”常量“
	// 常量的定义语法格式：public static final 类型 常量名 = 值;
	// java规范中要求所有常量的名字全部大写：每个单词之间使用下划线连接。
	final static String NATION = "China";
}
