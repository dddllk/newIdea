package day14;
/*
	接口和接口之间支持多继承，那么一个类可以同时继承多个接口吗？
	【*****】：一个类可以同时实现多个接口
	这种机制弥补了java中单继承带来的缺陷。

	经过测试：接口与接口之间在进行强制类型转换的时候，没有继承关系，也可以强转。
	但是一定要注意，运行时可能会出现ClassCastException
 */
public class InterfaceTest03 {
	public static void main(String[] args) {

	}
}
interface A1 {
	void m1();
}
interface B1 {
	void m2();
}
interface C1 {
	void m3();
}

// 实现多个接口，其实就实现了多继承
class D1 implements A1, B1, C1 {
	@Override
	public void m1() {

	}

	@Override
	public void m2() {

	}

	@Override
	public void m3() {

	}
}
