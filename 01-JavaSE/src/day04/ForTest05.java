package day04;
/*
	在前一个程序的基础之上，计算1-100所有的奇数之和
 */
public class ForTest05 {
	public static void main(String[] args) {
		int sum = 0; //定义一个盒子初始值为0
		for (int i = 1; i < 100; i++) {
			if(i % 2 == 1) { // 是奇数
				sum += i; // 求和
			}
		}
		System.out.println(sum);
	}
}
