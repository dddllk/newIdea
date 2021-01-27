package day04;
/*
	找素数升级版【加入统计机制】
		编写for循环找出1-10000中所有的素数
		要求每8个换一行
 */
public class ForTest10 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i < 10000; i++) {
			boolean flag = true;
			for (int j = 2; j <= (i / 2); j++) {
		    if (0 == i % j) {
		      flag = false;
		      break;
		    }
			}
			if(flag) {
				System.out.print(i + " ");
				count++;
//			写法一
//			if (count % 8 == 0) {
//				System.out.println();
//			}
//			写法二
				if (count == 8) {
					count = 0;
					System.out.println();
				}
			}
		}
	}
}
