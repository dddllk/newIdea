package day12;
/*
	1."this."和"super."大部分情况下是可以省略的
	2.“this.”什么时候不能省略：
		public void setName(String name) {
			this.name = name;
		}
	3.super. 什么时候不能省略：
		父中有，子中又有，如果想在子类中访问“父的特征”，super.不能省略
 */
public class SuperTest04 {
	public static void main(String[] args) {
		Vip1 v = new Vip1("dd");
		v.shopping();
	}
}
class Customer1 {
	String name;
	public Customer1() {}
	public Customer1(String name) {
		this.name = name;
	}
}
class Vip1 extends Customer1 {
	// 假设子类也有一个同名属性
	// java允许在子类中出现和父类同名的变量
	String name;
	public Vip1() {}
	public Vip1(String name) {
		super(name);
	}
	// super和this都不能出现在static静态方法中
	public void shopping() {
		// this表示当前对象
		System.out.println(this.name + "正在购物");
		// super 表示的事故当前对象的父类型特征（super是this指向的那个对象中的一块空间）
		System.out.println(super.name + "正在购物");
		System.out.println(name + "正在购物");
	}
}
/*
	java是怎么区分子类和父类中同名的属性的：
		super.和this.
 */
