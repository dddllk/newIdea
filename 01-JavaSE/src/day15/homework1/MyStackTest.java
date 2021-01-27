package day15.homework1;

public class MyStackTest {
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		ms.push(new Object());
		ms.push(new Object());
		ms.push(new Object());
		ms.push(new Object());
		ms.push(new Object());
		ms.push(new Object());
		ms.push(new Object());
		ms.push(new Object());
		ms.push(new Object());
		ms.push(new Object());
		ms.push(new Object());
		Object o = ms.pop();
		System.out.println(o);
	}
}
