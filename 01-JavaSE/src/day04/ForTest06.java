package day04;
/*
	循环嵌套
 */
public class ForTest06 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) { // 总共循环10次
			// 循环体中可以编写其他控制语句
			// 循环控制语句可以嵌套使用
			// 控制语句可以是 if、if...else、switch、for、while、do...while

			// 最好不要想太多，即使循环体当中是一个for循环，不要将这个for特殊化，也是一个普通的for循环
			// 只不过是一段符合java语法的代码

			// 内存循环，内存循环中变量名和外层循环中的变量不能重名

			// System.out.println(i);

			// 这里是循环体，无论这个循环体当中编写了什么样的代码，这堆代码也需要执行10遍
			// 0 1 2输出10次
			for (int j = 0; j < 3; j++) {
			    System.out.println(j);
			}
		}
	}
}
