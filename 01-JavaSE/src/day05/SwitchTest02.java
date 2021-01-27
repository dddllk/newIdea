package day05;
/*
	实现计算机中的加减乘除运算
 */
public class SwitchTest02 {
	public static void main(String[] args) {
		System.out.println("欢迎使用简单计算器！");
		// 创建键盘扫面对象
		java.util.Scanner s = new java.util.Scanner(System.in);
		// 提示用户输入数字1
		System.out.print("请输入数字1：");
		// 接收输入
		int num1 = s.nextInt();
		// 提示用户输入运算符号
		System.out.print("请输入要做的运算: ");
//		System.out.print("【0代表加法，1代表减法，2代表乘法，3代表除法】：");
		// 接收运算符号
		String str = s.next();
		if(str.equals("/")){
			// 提示用户除数不能为0
			System.out.println("您选择的是除法运算，请注意除数不能为0哦！");
		}
		// 提示用户输入数字2:
		System.out.print("请输入数字2：");
		// 如果用户选择的是除法，提示用户除数不能为0

		// 接收输入
		int num2 = s.nextInt();

		// 定义结果
		int result = 0;
		//switch判断
		switch (str) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			default:
				System.out.println("该系统不支持运算或无法运算！");
		}
		// 输出计算结果
		System.out.println(num1 + " " + str + " " + num2 + " = " + result);

	}
}
