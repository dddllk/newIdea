package day04;

public class ForTest03 {
	public static void main (String[] args) {
		// 1-10中的奇数
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("------------------");
		// 输出1-10中的偶数
		for(int i = 2; i <= 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("------------------");
		for(int i = 10;i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("------------------");
		for(int i = 100; i >= 50; i-=10) {
			System.out.println(i);
		}
		System.out.println("------------------");
		for(int i = 0; i < 10;) {
			System.out.println(i); //0 1 2 3 4 5 6 7 8 9
			i++;
		}
		System.out.println("------------------");
		for(int i = 0; i < 10;) {
			i++;
			System.out.println(i);// 1 2 3 4 5 6 7 8 9 10
		}
	}
}
