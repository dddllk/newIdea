package day14.foodmenu;
/*
	接口的使用离不开多态机制，（接口+多态才可能达到降低耦合度的效果）
	接口可以解耦合：
		任何一个接口都有调用者和使用者。
		接口可以将调用者和实现者解耦合。
		调用者面向接口调用，
		实现者面向接口编写实现，
 */
public interface FoodMenu {
	// 西红柿炒鸡蛋
	void Tomato();
	// 肉
	void FreshMeet();
	// 牛排
	void Steak();
}
