package day04;
/*
	使用for循环输出九九乘法表
 */
public class ForTest08 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + " = " + ( j * i ) + " ");
			}
			System.out.println();
		  // System.out.print("\n");
		}
	}
}
