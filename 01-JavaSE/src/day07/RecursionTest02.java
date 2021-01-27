package day07;
/*
	不使用递归，计算1-n的和
 */
public class RecursionTest02 {
	public static void main(String[] args) {
		// 直接调用方法即可
		int n = 4;
		int retValue = sum(n);
		System.out.println(retValue);
	}
	// 方法 计算1-n的和
	public static int sum(int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
		  result += i;
		}
		return result;
	}
}
