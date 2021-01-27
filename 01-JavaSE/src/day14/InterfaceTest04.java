package day14;
/*
	继承和实现都存在的话，代码应该怎么写？
 */
public class InterfaceTest04 {
	public static void main(String[] args) {
		Flyable f = new Cat1();
		f.fly();

		Flyable f1 = new Pig();
		f1.fly();
	}
}
class Animal1 {

}
// 可飞翔接口
interface Flyable {
	void fly();
}
// 动物类子类：猫类
class Cat1 extends Animal1 implements Flyable{
	public void fly() {
		System.out.println("飞翔的猫");
	}
}
// 动物类子类：蛇，不像让它飞
class Snake extends Animal1 {

}
// 猪类
class Pig extends Animal1 implements Flyable {
	public void fly() {
		System.out.println("fly pig");
	}
}