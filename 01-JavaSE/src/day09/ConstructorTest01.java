package day09;
/*
	关于java类中的构造方法
		1.构造方法又称为构造函数/构造器/Constructor
		2.构造方法语法结构：
			【修饰符列表】构造方法名(形式参数列表) {
				构造方法体;
			}
		3.普通方法的语法结构：
			【修饰符列表】返回值类型 方法名(形式参数列表) {
				方法体;
			}
		4.对于构造方法来说，”返回值类型“不需要制定，并且也不能写void
			只要写上void，那么这个方法就称为普通方法了。
		5.对于构造方法来说，构造方法的方法名必须和类名保持一致。
		6.构造方法的作用
				构造方法存在的意义：通过构造方法的调用，可以创建对象
		7.构造方法怎么调用？
			- 普通方法的调用：方法修饰符中有static的时候：类名.方法名(实参列表)或者方法修饰符中没有static的时候：引用.方法名(实参列表)
			- 构造方法的调用：new 构造方法名(实参列表)
		8.构造方法调用执行结束之后，有返回值吗？
			每个构造方法执行结束之后都有返回值，但是这个”return 值;“这样的语句不需要写。
			并且返回值类型是构造方法所在的类型。
		9.当一个类中没有定义任何构造方法的话，系统默认给该类型提供一个无参数的构造方法，这个构造方法被称为缺省构造器
		10.当一个类显示的构造方法定义出来了，那么系统不再默认的提供构造器了，建议开发中手动的为当前类提供无参数的构造方法。
			因为无参数构造方法太常用。
		11.构造方法支持重载机制，在一个类中编写多个构造方法构成重载
 */
public class ConstructorTest01 {
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User(123);
		User u3 = new User("dd");
		User u4 = new User(123,"dd");

		// 调用带有static的方法.类名
		ConstructorTest01.doSome();
		doSome();

		// 调用没有static的方法
		// doOther方法在ConstructorTest01类当中，所以需要创建ConstructorTest01对象
		// 创建ConstructorTest01对象，调用无参数构造方法
		ConstructorTest01 t = new ConstructorTest01(); // 一个类中没有任何构造方法的话，系统默认提供一个无参构造器
		t.doOther();
	}
	public static void doSome() {
		System.out.println("doSome");
	}
	public void doOther() {
		System.out.println("doOther");
	}
}
