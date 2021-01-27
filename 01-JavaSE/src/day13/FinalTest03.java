package day13;

/*
	final修饰的实例变量，系统不管赋默认值，要求程序员必须手动赋值。
	构造方法执行过程中赋值（new的时候赋值），所以也可以在构造方法里面赋值
 */
public class FinalTest03 {

}
class User {
	// 实例变量
	final int age;

	public User(int age) {
		this.age = age;
	}
}