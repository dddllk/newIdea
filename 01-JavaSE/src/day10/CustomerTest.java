package day10;

public class CustomerTest {
	public static void main(String[] args) {
		// 创建customer1对象
		Customer customer1 = new Customer();
		customer1.name = "dd";
		customer1.shopping();
		// 创建customer2对象
		Customer customer2 = new Customer();
		customer2.name = "yy";
		customer2.shopping();

		// 调用doSome方法（修饰符列表上有static）
		// 采用”类名.方法名“的方式访问
		Customer.doSome();

		// 调用doOther
		Customer.doOther();
	}
}
