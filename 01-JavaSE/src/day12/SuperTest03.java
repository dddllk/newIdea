package day12;

public class SuperTest03 {
	public static void main(String[] args) {
		Vip v = new Vip("dd");
		v.shopping();
	}
}
class Customer {
	String name;
	public Customer() {}
	public Customer(String name) {
		this.name = name;
	}
}
class Vip extends Customer {
	public Vip() {}
	public Vip(String name) {
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
