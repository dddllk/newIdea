package day12.homework;
/*
	模拟简单计算器
 */
public class HomeWork3 {
	public static void main(String[] args) {
		Number num = new Number(15, 2);
		System.out.println("加法的结果是："+ num.addition());
		System.out.println("减法的结果是："+ num.subtraction());
		System.out.println("乘法的结果是："+ num.multiplication());
		System.out.println("除法的结果是："+ num.division());
	}
}
class Number {
	private int num1;
	private int num2;
	public Number() {
	}

	public Number(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	//加法
	public int addition() {
		return this.num1 + this.num2;
	}
	//减法
	public int subtraction() {
		return this.num1 - this.num2;
	}
	//乘法
	public int multiplication() {
		return this.num1 * this.num2;
	}
	//除法
	public int division() {
		if (this.num2 != 0) {
			return this.num1 / this.num2;
		}else {
			return 0;
		}
	}
}
