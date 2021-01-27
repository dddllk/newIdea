package day04;
/*
	while循环语句
		1.while循环的语法结构：
			while(布尔表达式) {
				循环体;
			}
		2.while循环的执行原理：
			先判断布尔表达式的结果：
				* true：
					- 执行循环体
						* 判断布尔表达式的结果：
							- true
							* 执行循环体
								- 判断布尔表达式的结果：
									...
							- false
							 * 循环结束
				* false：
					- 循环结束

		3.while循环的循环次数：
		  0 ~ n次
		  while循环的循环体可能一次都不执行
 */
public class WhileTest01 {
	public static void main(String[] args) {
		// 死循环
		/*
		while(true) {
			System.out.println("死循环");
		}
		 */
		// 编译器检测到程序永远都无法被执行，所以编译报错
    //	 System.out.println("hello");

		int i = 10;
		int j = 3;
		while(i > j) {
			System.out.println("he");
		}
    // 编译正确，可以被访问
		System.out.println("hello");
		// 以上三行编译不报错，一下三行编译报错
//		while(10 > 3) {
//			System.out.println("dd");
//		}
		//编译错误，无法访问的语句
//		System.out.println("hello");
	}
}
