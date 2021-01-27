package day12;
/*
	1.super 是一个关键字，全部小写
	2.super和this对比：
		this：
			this能出现在实例方法和构造方法中。
			this的语法是：“this.”和“this()”
			this不能出现在静态方法中
			this.大部分情况下是可以省略的
			this.什么时候不能省略：在区分局部变量和实例变量的时候不能省略。
			public void setName(String name) {
				this.name = name;
			}
			this() 只能出现在构造方法的第一行，通过当前的构造方法去调用“本类”中其他的
			构造方法，目的是：代码复用
		super：
			super能出现在实例方法和构造方法中。
			super的语法是：“super.”和“super()”
			super不能出现在静态方法中
			super.大部分情况下是可以省略的
			super什么时候是可以省略的呢？
			super() 只能出现在构造方法第一行，通过当前的构造方法去调用“父类”中的构造方法，
			目的是：创建子类对象的时候，先初始化父类型特征。
	3.super()
		表示通过之类的构造方法调用父类的构造方法。
		模拟现实世界中的这种场景：要想有儿子，需要先有父亲。
	4.重要结论：
		当一个构造方法第一行：
			既没有this()又没有super()的话，默认会有一个super();
			表示通过当前子类的构造方法调用父类的无参数构造方法。
			所有必须保证父类的无参数构造方法是存在的。
	5.this()和super()不能共存，它们都是只能出现在构造方法的第一行。

	在java语言中不管是new什么对象，最后的Object类的无参数构造方法一定会执行。
	（Object类中的无参数构造方法是出于栈顶部的）
 */
public class SuperTest01 {
	public static void main(String[] args) {
		new C();
	}
}
class A extends Object{
	public A() {
		super();
		System.out.println("A类的无参数构造方法执行");
	}
}
class B extends A {
	public B() {
		super();
		System.out.println("B类的无参数构造方法执行");
	}
	public B(String name) {
		super();
		System.out.println("B类的有参数方法执行（String）");
	}
}
class C extends B {
	public C() {
		this("zhangsan");
		System.out.println("C的无参数构造方法执行");
	}
	public C(String name) {
		this(name, 20);
		System.out.println("C的有参数构造执行（String）");
	}
	public C(String name, int age) {
		super(name);
		System.out.println("C的有参数构造执行（String, name）");
	}
}
