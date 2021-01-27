package day11;

/*
	java语言中的多态语法机制：
		1.Animal、Cat、Bird三个类之间的关系：
			Cat继承Animal
			Bird继承Animal
			Cat和Bird之间没有任何继承关系
		2.面向对象的三大特征：封装、继承、多态
		3.关于多态中涉及到的几个概念：
			向上转型（upcasting）
				子类型 --> 父类型
				又被称为：自动类型转换
			向下转型(downcasting)
				父类型 --> 子类型
				又被称为：强制类型转换【需要加强类型转换符】
			需要记忆：
				无论是向上转型还是向下转型，两种类型之间必须要有继承关系。
				没有继承关系，程序是无法编译通过的
 */
public class Test {
	public static void main(String[] args) {
		// 以前编写程序
		Animal a1 = new Animal();
		a1.move();

		Cat c1 = new Cat();
		c1.move();
		c1.catchMouse();

		Bird b1 = new Bird();
		b1.move();

		//使用多态语法机制
		/*
			1.Animal和Cat之间存在继承关系，Animal是父类，Cat是子类
			2.cat is a Animal
			3.new Cat()创建的对象类型是Cat
			4.Java中允许这种语法：父类型引用指向子类型对象。
		 */
		Animal a2 = new Cat();
		/*
			1.java程序永远都分为编译阶段和运行阶段。
			2.先分析编译阶段，在分析运行阶段，编译无法通过，根本是无法运行的。
			3.编译阶段编译器检查a2这个应用数据类型为Animal，由于Animal.class
				字节码当中有move()方法，所以编译通过了。这个多个我们称为静态绑定，编译阶段绑定。
				只有静态绑定成功之后才有后续的运行。
			4.在程序运行阶段，JVM堆内存当中真是创建的对象是Cat对象，那么以下程序在运行阶段
				一定会采用Cat对象的move()方法，此时发生了程序的动态绑定，运行阶段绑定
			5.无论Cat类是否重写move方法，运行阶段一定调用的Cat对象的move方法，因为底层真实的对象是Cat对象
			6.父类型引用指向子类型对象这种机制导致程序在编译阶段绑定和运行阶段绑定两种不同的形态/状态，这种机制可以称为一种多态语法机制。
		 */
		a2.move();

		/*
			分析一下程序：
				因为编译阶段编译器检测到a2的类型是Animal类型，
				从Animal.class字节码文件中查找catchMouse()方法，
				最终没有找到该方法，导致静态绑定失败，没有绑定成功，编译也就失败了。
		 */
		// a2.catchMouse();

		/*
			需求：a2抓老鼠
			我们可以将a2强制类型转换为Cat类型
			a2类型是Animal（父类），转换为Cat（子类），被称为向下类型转换/强制类型转换。

			注意：向下转型也需要两种类型之间必须有继承关系，不然编译报错。强制类型转换需要加强制类型转换符

			什么时候需要强制类型转换呢？
				当调用的方法或者访问的属性是子类型中特有的，必须向下转型
		 */
		Cat c2 = (Cat)a2;
		c2.catchMouse();

		Animal a3 = new Bird();
		/*
			1.以下程序编译是没有问题的，因为编译器检查到a3的数据类型是Animal
			Animal和Cat之间存在继承关系，并且Animal是父类，Cat是子类，
			父类向子类转换叫做向下类型转换，语法合格
			2.程序虽然编译通过了，但是程序在运行阶段会出现异常，因为JVM堆内存当中的对象是Bird类型，
			Bird对象无法转换成Cat对象，因为两种类型之间不存在继承关系，此时出现了异常：
				java.lang.ClassCastException
				类型转换异常，这种异常总是在“向下转型”的时候会发生
		 */
//		Cat c3 = (Cat)a3;
		/*
			以上异常只有在强制类型转换的时候发生，也就是“向下类型”存在隐患（编译通过了，但是运行错了）
		 	向上类型转换只要编译通过，运行时一定不会出现问题
		 	怎么避免向下转型出现classCastException异常呢？
		 		使用instanceof运算符可以避免出现以上的异常。
		 	instanceof运算符
		 		语法格式：
		 		 （引用 instanceof 数据类型名）
		 		以上运算符的执行结果类型为布尔类型，结果可能是true/false
		 		关于运算结果true/false:
		 			假设：(a instanceof Animal)
		 			true表示：
		 				a这个引用指向的对象是一个Animal类型。
		 			false:
		 				a这个引用指向的对象不是一个Animal类型。
		 	Java语法规范中要求，在进行强制类型转换之前，建议采用instanceof运算符进行判断，必秒ClassCastException异常的发生。
		 */
		// instance是实例的意思
		if(a3 instanceof Cat) {
			Cat c3 = (Cat) a3;
			// 调用子类中特有的方法
			c3.catchMouse();
		}else if (a3 instanceof Bird){
			// 调用子类中特有的方法
			Bird b2 = (Bird) a3;
			b2.fly();
		}
	}
}
