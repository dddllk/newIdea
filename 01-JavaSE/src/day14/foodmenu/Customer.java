package day14.foodmenu;
/*
	顾客
 */
public class Customer {
	// 顾客手里有菜单
	private FoodMenu foodMenu;

	// 无参构造
	public Customer() {

	}
	// 有参构造
	public Customer(FoodMenu foodMenu) {
		this.foodMenu = foodMenu;
	}

	//setter and getter
	public void setFoodMenu(FoodMenu foodMenu) {
		this.foodMenu = foodMenu;
	}

	public FoodMenu getFoodMenu() {
		return foodMenu;
	}

	//点菜的方法
	public void order() {
		// 拿到菜单(调用get方法)
		// FoodMenu fd = this.getFoodMenu();

		// 也可不调用get方法
		foodMenu.FreshMeet();
	}
}

/*
	抽象类和接口的区别：
		1.抽象类是半抽象的，接口是完全抽象的
		2.抽象类中有构造方法，接口中没有构造方法
		3.接口和接口之间支持多继承，类和类之间支持单继承（一个抽象类只能继承一个类）
		4.接口中只允许出现常量和抽象方法

		以后接口使用得多，一般抽象类使用得少
		接口一般都是对“行为”的抽象
 */