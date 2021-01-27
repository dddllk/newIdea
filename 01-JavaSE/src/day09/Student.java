package day09;

/*
	面向对象的三大特征：封装、继承、多态。

	封装：
		1.封装了之后就看不到事物复杂的一面。
		2.封装之后才会形成真正的”对象“，真正的独立体。
		3.封装之后就意味着程序可以重复使用，并且这个事物应该适应性比较强，在任何场合都可以使用
		4.封装之后，对于事物本身，提高了安全性。

	封装的步骤：
		1.所有属性私有化，使用private关键字进行修饰，private表示私有的，修饰的所有数据只能在本类中访问，
		2.对外提供简单的操作入口，也就是说外部程序要想访问age属性，必须通过这些简单的入口进行访问：
			对外提供两个公开的方法：分别是set和get方法
			想修改age属性：调用set方法
			想读取age属性：调用get方法
		3.set方法的命名规范：
			public int getAge() {
				return age;
			}
		4. setter和getter方法没有static关键字
			 有static关键字修饰符的方法怎么调用：类名.方法名(实参)
			 没有static关键字修饰符的方法怎么调用：引用.方法名(实参)
 */
public class Student {
	// 属性私有化
	private int age;

	//set 方法没有返回值，因为set方法只负责修改数据
	/*
	public void setAge(int age) {
		age = age; // java 就近原则，这里其实并没有给age属性赋值，这里的age都是局部的age
	}
	 */

	//setter
	public void setAge(int a){
		// 编写逻辑代码进行安全控制
		if (a < 0 || a > 150) {
		  System.out.println("对不起，您提供的年龄不合法！");
		  return;
		}
		// 程序可以控制到这里的话，说明a年龄是合法的，则进行赋值运算
		age = a;
	}
	//setter
	public int getAge() {
		return age;
	}
}
