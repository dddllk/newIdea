package day04;
/*
	for循环语法结构
		for(初始化表达式;布尔表达式;更新表达式) {
			// 需要重复执行的代码片段【循环体：由java语句构成】
		}
	for循环的执行过程/执行原理：
		1. 初始化表达式、布尔表达式、更新表达式都不是必须的！【但是两个分号是必须的】
		2. 初始化表达式最先执行，并且只执行一次。
		3. 布尔表达式必须是true/false，不能是其他值
		4. 执行过程：
			 先执行初始化表达式，并且只执行一次;
			 判断初始表达式的结果是true或false：
			 - 布尔表达式为true：
			  * 执行循环体
			  * 执行更新表达式
			  * 判断布尔表达式的结果是true还是false
			   - 布尔表达式为true：
			    * 执行循环体
			    * 执行更新表达式
			    * 判断布尔表达式的结果是true还是false
			     - 布尔表达式true
			      * 执行循环体
			      * 执行更新表达式
			      ....(多个循环)
			     - 布尔表达式false
			      * 循环结束
			   - 布尔表达式为false
			    * 循环结束
 */
public class ForTest01 {
	public static void main(String[] args) {
		// 需求输出 1 - 10
		// 使用循环语句会使代码变少
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
