package day04;
/*
	1. continue表示：继续、go on、下一个
	2. continue也是一个continue关键字加一个分号构成一个单独的完整的java语句，主要出现
		 循环语句当中，用来控制循环的执行。
	3. break和continue的区别：
			break表示循环不执行了。
			continue表示直接进入了下一次循环执行
 */
public class ContinueTest01 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println("i--> " + i);
		}

		System.out.println("-----------------");

		for (int j = 0; j < 10; j++) {
			for (int k = 0; k < 10; k++) {
		    if (k == 5) {
		    	continue;
		    }
				System.out.println(k);
			}
		}
	}
}
