package day11;

public class Cat extends Animal{
	@Override
	public void move() {
		System.out.println("猫在走猫步");
	}
	// 不是从父类中继承过来的方法
	// 这个方法是子类中特有的方法
	public void catchMouse() {
		System.out.println("猫抓老鼠");
	}
}
