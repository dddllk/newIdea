package day09;
/*
	构造方法的作用：
		1.创建对象
		2.创建对象的同事，初始化实例变量内存空间

	成员变量之实例变量，属于对象级别变量，这种变量必须先有对象才能有实例变量。
	实例变量没有手动赋值的时候，系统赋默认值，那么这个系统默认赋值是什么时候完成的呢？
		是在类加载的时候吗？
			不是，因为类加载的时候只加载了代码片段，来没来的机创建对象，所以此时实例变量并没有初始化。

		实际上，实例变量的内存空间是在构造方法执行过程当中完成开辟的，完成初始化的。
		系统在默认赋值的时候，也是在构造方法执行过程当中完成赋值的。
 */
public class ConstructorTest02 {
	public static void main(String[] args) {
		Account act1 = new Account();

		// 账号
		System.out.println("账号 = " + act1.getActno());
		// 余额
		System.out.println("余额 = " + act1.getBalance());

		act1.setActno("11");
		act1.setBalance(100.0);

		// 账号
		System.out.println("账号 = " + act1.getActno());
		// 余额
		System.out.println("余额 = " + act1.getBalance());

	}
}

/*
	对象和引用：
		* 对象：目前在使用new运算符在堆内存中开辟的内存空间称为对象。
		* 引用：是一个变量，不一定是局部变量，还可能是成员变量。引用保存了内存地址，指向了堆内存中的对象。
		* 所有访问实例相关的数据，都需要通过“引用.”的方式范围，因为只有通过引用才能找到对象。
		* 只有一个空的引用，访问对象的实例相关的数据会出现空指针异常。
		class Student {
			Computer com; // com 是一个引用【实例变量】
			public static void doSome() {
				Computer co; // co是一个引用【局部变量】
			}
		}

		* 参数的传递？
			主要研究和学习的是方法在调用的时候，涉及到参数传递值的问题，到底是怎么传递参数的呢？
 */
