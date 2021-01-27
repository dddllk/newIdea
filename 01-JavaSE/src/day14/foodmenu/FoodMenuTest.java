package day14.foodmenu;

public class FoodMenuTest {
	public static void main(String[] args) {
		// 创建中餐厨师对象
		FoodMenu cooker1 = new ChineseChef();
		// 创建西餐厨师对象
		FoodMenu cooker2 = new ForeignChefs();
		// 创建顾客对象
		Customer customer = new Customer(cooker1);
		//顾客点菜
		customer.order();
	}
}
