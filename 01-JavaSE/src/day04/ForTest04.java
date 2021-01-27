package day04;
/*
	循环语句和条件判断语句嵌套【for和if嵌套】
 */
public class ForTest04 {

	public static void main(String[] args) {
		// 找出1-100所有的奇数
		// 第一种方案：从一开始，每次递增2,
		for(int i = 1; i <= 100; i+=2) {
			System.out.println("奇数---》" + i);
		}
		// 第二种方案：从1开始，以1递增，每一个数据都进行判断，判断标准是该数字对2求余
		for(int i = 1; i <= 100; i++) {
			// 判断i是否为奇数
			if(i%2 == 1) {
				System.out.println("第二中奇数i：" + i);
			}
		}
		// 奇数 i%2 == 1
		// 偶数 i%2 == 0
	}
}
