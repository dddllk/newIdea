package day14;
/*
	抽象类：
		1.抽象方法必定会出现在抽象类中，所以子类从父类继承过来的抽象方法进行覆盖、重写，也可以叫做实现
 		2.重要结论【必须记住】：
 				一个非抽象类继承抽象类，必须将抽象类中的抽象方法实现了。
 				这是java语法上强行规定的，必须的，不然编译器会报错。

 				这里的覆盖或者说重写，也可以叫做实现。（对抽象类的实现）
 */
public class AbstractTest02 {
	public static void main(String[] args) {
		// 抽象类不能new
		// 父类型引用指向子对象	·
		Animal a = new Bird(); // 面向抽象编程
		a.move(); // bird fly

		// 猫对象
		Animal a1 = new Cat();
		a1.move(); // Cat move
	}
}

abstract class Animal {
	public abstract void move();
}

// 如果Bird是抽象类的话，那么这个Animal继承过来的move方法也可以不去实现
// 但如果Bird也是抽象类的话，Bird就不能创建对象，即不能new
// 所以如果要想创建对象，就必须实现父类中的move()方法
class Bird extends Animal {
	public void move() {
		System.out.println("bird fly");
	}
}

class Cat extends Animal {
  public void move() {
  	System.out.println("Cat move");
	}
}
