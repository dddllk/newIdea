package day14;
/*
1.抽象类：
	类和类之间有共同特征，将这些共同特征提取出来，形成的就是抽象类。
	由于类本身是不存在的，所以抽象类无法创建对象（无法实例化）
	抽象类无法实例化，无法创建对象
2.抽象类属于什么类型？
	抽象类也属于引用数据类型
3.抽象类怎么定义？
	语法：
		【修饰符列表】abstract class 类名 {...类体}
4.抽象类是无法实例化的，无法创建对象的，所以抽象类是用来被子类继承的。
5.final和abstract不能同时出现。
6.抽象类的子类可以是抽象类。
7.抽象类虽然是无法实例的，但是抽象类也有构造方法，这个构造方法供子类使用的。
8.抽象类关联到一个概念，抽象方法，什么是抽象方法呢？
	抽象方法表示没有实现的方法，没有方法体的方法。例如：
	public abstract void doSome();
	抽象方法的特点是：
		①没有方法体，分号结尾。
		②前面修饰符列表中有abstract关键字。
9.抽象类中不一定有抽象方法，抽象方法一定出现在抽象类中。
 */
public class AbstractTest01 {
	public static void main(String[] args) {
		// Account ac = new Account();
	}
}
// 银行帐户类(抽象类)
abstract class Account {

}
// 子类继承抽象类，子类也可以实例化对象
abstract class CreditAccount extends Account {

}
