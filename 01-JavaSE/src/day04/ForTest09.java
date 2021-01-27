package day04;
/*
	for循环找出1-100中所有的素数（只能被1和自身整除，不能被其他数字整除的数字称为素数）
 */
public class ForTest09 {
	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			//定义一个逻辑值flag，初始值为true
			boolean flag = true; // 标记在开发中比较常用
			//内层循环遍历除数j(注意：此处若不取边界，则当i=4时，j=2会因为小于i/2=2而直接跳出内循环)
			for (int j = 2; j <= (i / 2); j++) {
				//判断是否存在除数j能整除i，若存在，则修改flag的值并跳出循环
				if (i % j == 0) {
					flag = false; // 非素数
					break; // 只要有一个值求余 == 0，就可以判断这个数不是素数，就可以终止循环了
				}
			}
			//根据flag的值判断是否输出i
			if (flag) {
				System.out.print(i + " ");
			}
		}
	}
}
