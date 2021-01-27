package day10;
/*
	java语言中的继承：
		1.继承是面向对象三大特征之一。
		2.继承基本的作用是：代码复用，但是继承最重要的作用是：有了继承才有了以后方法的覆盖和多态机制
		3.继承语法格式：
			【修饰符列表】 class 类名 extends 父类名 {
				类体 = 属性 + 方法;
			}
		4.java语言当中的继承只能支持单继承，一个类不能同时继承很多类，只能继承一个类。在C++支持多继承。
		5.关于继承中的一些术语：
			B类继承A类，其中：
				A类称为：父类、积累、超类、superclass
				B类称为：子类、派生类、subclass
		6.在java语言当中子类继承父类都继承哪些数据呢？
				私有的不支持继承
				构造方法不支持继承
				其他数据都可以继承
		7.虽然java语言当中只支持单继承，但是一个类也可以间接继承其他类，例如：
			C extends B {

			}
			B extends A {

			}
			A extends T {

			}
			C直接继承B类，但是C类简介继承T、A类。
		8.java语言中假设一个类没有显示的继承任何类，该类默认继承javaSE库中提供的java.lang.Object类
 */
public class ExtendsTest {
	public static void main(String[] args) {
		ExtendsTest et = new ExtendsTest();
		String s = et.toString();
		System.out.println(s);

		CreditAccount ca = new CreditAccount();
		ca.setActno("act-001");
		ca.setBalance(-100.0);
		ca.setCredit(0.99);

		System.out.println(ca.getActno() + "," + ca.getBalance() + "," + ca.getCredit() + ",");
	}
}
