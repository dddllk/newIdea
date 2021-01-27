package day04;
/*
	do...while 循环:
		1. 语法结构：
			do {
				循环体;
			}while(布尔表达式);
		2. 执行原理：
			先执行循环体，判断布尔表达式真假，
				真：执行循环体，
					判断布尔表达式；
						真：执行循环体；
							判断布尔表达式：
								真：执行循环体
								假：循环结束
								...
						假：结束；
				假：循环结束。
		3. 执行次数：
		4. 注意事项
 */
public class DoWhileTest01 {
	public static void main(String[] args) {
		int i = 10;
		do {
			System.out.println(i);
		}while (i > 100);

		System.out.println("-------------");

		while(i > 100) {
			System.out.println("i-----> "+ i);
		}

		System.out.println("------------------");

		int j = 1;
		do {
			System.out.println(j); // 1,2,3,4,5,6,7,8,9,10
			j++;
		}while (j <= 10);
	}
}
