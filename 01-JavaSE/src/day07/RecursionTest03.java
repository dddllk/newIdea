package day07;
/*
	使用递归计算1-n的和
	---> 4 + 3 + 2 + 1
 */
public class RecursionTest03 {
	public static void main(String[] args) {
		int n = 4;
		int retValue = sum(n);
		System.out.println(retValue);
	}
	public static int sum(int a) {
		if (a == 1) {
			return 1;
		}else {
			return a + sum(a - 1);
		}
	}
}
