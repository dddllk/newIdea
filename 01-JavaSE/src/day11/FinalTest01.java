package day11;
/*
	关于java语言当中final关键字：
		1.final是一个关键字，表示最终的，不可变的
		2.final修饰的类无法被继承
		3.final修饰的方法无法被覆盖
		4.final修饰的变量一旦被赋值后，不可重新赋值【不可二次赋值】
		5.final修饰的实例变量：必须手动赋值，不能采用系统默认值
		6.final修饰的引用虽然指向某个对象之后不能指向其他对象，但是所指的对象内部的数据是可以被修改的
 		7.final修饰的实例变量是不可变的，这种变量一般和static联合使用，被称为”常量“
 */

// 以后尽量所有的程序都连接源码 养成看源码的习惯
/*
	对于以后学习的类库，一般包括三个部分：
		- 源码
		- 字节码
		- 帮助文档
 */

public class FinalTest01 {
	// final变量的赋值方案
	// 第一种
	final int age = 10;
	// 第二种
	final int num;
	public FinalTest01() {
		this.num = 200;
	}
	// 以上两种解决方案：其实本质上就是一种方式，都是在构造方法执行过程当中给实例变量赋值。
	public static void main(String[] args) {

	}
}
/*
	什么时候需要import？
		1.不是java.lang包下，并且不在同一个包下的时候，需要使用import进行导入。
 */
