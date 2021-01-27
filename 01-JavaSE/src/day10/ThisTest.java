package day10;
/*
	最终结论：
		在带有static的方法中不能“直接”访问实例变量和实例方法。
		因为实例变量和实例方法都需要对象的存在
 */
public class ThisTest {
	// 实例
	String name;

	// 实例
	public void doSome() {
		System.out.println("doSome");
	}

	// 带有static
	public static void main(String[] args) {
	  // 这里没有this
		/*
			编译错误
			System.out.println(name);
			doSome();
		 */

		ThisTest tt = new ThisTest();
		System.out.println(tt.name);
		tt.doSome();
	}
}
