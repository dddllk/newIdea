package day14.访问控制权限;

/*
	访问控制权限：
		private    私有：   只能在本类中访问
		protected  受保护   表示只能在本类、同包、子类中访问
		public     公开     表示公开的，在任何位置都可以访问
	 （没有修饰）   默认    表示只能在本类，以及同包下访问


	 访问控制修饰符         本类         同包        子类       任意位置
	 ————————————————————————————————————————————————————————————————
	 public              可以         可以        可以        可以
	 protected           可以         可以        可以        不行
	 默认                 可以         可以        不行        不行
	 private             可以         不行        不行        不行


	 访问控制权限可以修饰：属性（4个都能用）、（静态）方法（4个都能用）、类（public和默认能用，其他不行）、接口（public和默认能用，其他不行）
 */
public class User {
	// 公开的
	public int weight;
	// 私有的
	private int id;
	// 受保护的
	protected int age;
	// 什么也没有修饰（默认的）
	String name;
	// 跑步
	public void running() {
		System.out.println("user is running");
	}
}

