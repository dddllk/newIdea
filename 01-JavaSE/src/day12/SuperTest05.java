package day12;
/*
	通过这个测试得出的结论：
		super不是引用，super也不表示内存地址，super也不指向任何对象。
		super 只是代表当前对戏那个内部的那一块父类型的特征。
 */

public class SuperTest05 {
	// 静态方法
	public static void main(String[] args) {
		SuperTest05 st = new SuperTest05();
		st.doSome();
	}
	// 实例方法
	public void doSome() {
		System.out.println(this);
		// 输出“引用”的时候，会自动调用引用的toString()方法。
		// System.out.println(this.toString());

		// 编译错误，需要“.”
		// this和super不能使用在静态方法中，只能使用在实例方法中
		// System.out.println(super.);
	}

}
