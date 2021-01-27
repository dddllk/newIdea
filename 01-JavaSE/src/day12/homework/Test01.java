package day12.homework;

import java.util.Scanner;

/*
	猜数字：
		一个类A中有一个实例变量v，从键盘接收一个正整数作为实例变量v的初始值。
		另外再定义一个类B，对A类的实例变量v进行猜测。
		如果大了则提示大了，
		小了则提示小了
		等于则提示猜测成功
 */
// 我的写法
/*
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入数字：");
		int num = sc.nextInt();
		A a = new A(num);
		B b = new B();
		b.Judge(a, 15);
	}
}
class A {
	private int v;
	public A() {

	}
	public A(int v) {
		this.v = v;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}
}
class B {
	public void Judge(A a, int b) {
		int realNum = a.getV();
		if(realNum > b) {
			System.out.println("小了");
		}else if(realNum < b) {
			System.out.println("大了");
		}else {
		  System.out.println("猜测成功");
		}
	}
}
 */
// teacher的写法
public class Test01 {
	public static void main(String[] args) {
		// 创建A对象
		A a = new A(100);
		// 创建B对象
		B b = new B(a);
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入要猜测的数字");
		int judgeNum = sc.nextInt();
		b.Judge(judgeNum);
	}
}

class A {
	private int v;
	public A() {

	}
	public A(int v) {
		this.v = v;
	}

	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
}
class B {
	private A a;
	public B() {

	}
	public B(A a) {
		this.a = a;
	}
	public void setA(A a) {
		this.a = a;
	}
	public A getA() {
		return a;
	}
	public void Judge(int num) {
		int realNum = a.getV();
		if(realNum > num) {
			System.out.println("小了");
		}else if(realNum < num) {
			System.out.println("大了");
		}else {
			System.out.println("猜测成功");
		}
	}
}
// System.exit(0); 退出JVM