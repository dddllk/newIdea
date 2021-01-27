package day07;

// 分析以下程序的输出结果【画图分析】
public class MethodTest02 {
	public static void main(String[] args) {
		int i = 10;
		method(i);
		System.out.println("main --> " + i);
	}
	public static void method(int i) {
		i++;
		System.out.println("method -->" + i);
	}
}
