package day10;

public class ExtendsTest02 {
	public static void main(String[] args) {
		C c = new C();
		c.doSome();
	}
}
class A {
	public void doSome() {
		System.out.println("do Some");
	}
}
class B extends A {

}
class C extends B {

}
