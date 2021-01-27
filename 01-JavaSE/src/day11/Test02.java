package day11;
/*
	多态在实际开发中的作用，以下以主人喂养宠物为例说明多态的作用：
		1.分析：主人喂养宠物这个场景实现需要进行类型的抽象：
			- 主人【类】
			- 主人可以喂养宠物，所以主人有喂养这个动作。
			- 宠物【类】
			- 宠物可以吃东西，所以宠物有吃东西这个动作
		2.面向对象编程核心：定义好类，然后将类实例化为对象，给一个环境驱使一下，让各个对象之间协作起来，形成一个系统
 		3.多态的作用：
 			降低程序的耦合都，提高程序的扩展能力。
 			能使用多态尽量使用多态。
 			父类型引用指向了类型对象
 	 核心：面向抽象编程，尽量不要面向具体编程
 */
public class Test02 {
	public static void main(String[] args) {
		// 创建主人对象
		Master dd = new Master();
		// 创建猫对象
		Pet cc = new Dog();
		// 主人喂狗
		dd.feed(cc);
		// 创建狼对象
		Pet w = new Wolf();
		dd.feed(w);
		// 主人喂蛇
		Snake snake = new Snake();
		dd.feed(snake);
	}
}
