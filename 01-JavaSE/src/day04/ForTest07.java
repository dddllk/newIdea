package day04;
/*
	for循环嵌套
 */
public class ForTest07 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) { // 循环10次
			System.out.println("begin");
			// 这里代码片段执行10遍
			for (int j = 0; j < 1; j++) { // 循环1次，输出0
			    System.out.println(j);
			}
			System.out.println("over");
		}
		System.out.println("-------------");

		for (int i = 1; i <= 5; i++) {
		    System.out.println("开始");
		    for (int j = 1; j <= 5; j++) {
		        System.out.print(i + " * " + j + " = "+ ( i * j ) + "|");
		    }
		    System.out.println();
		    System.out.println("结束");
		}
	}
}
