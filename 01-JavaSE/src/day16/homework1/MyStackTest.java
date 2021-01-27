package day16.homework1;

public class MyStackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		// 压栈
		try {
			stack.push(new Object());
			stack.push(new Object());
			stack.push(new Object());
			stack.push(new Object());
			stack.push(new Object());
			stack.push(new Object());
			stack.push(new Object());
			stack.push(new Object());
			stack.push(new Object());
			stack.push(new Object());
			stack.push(new Object());
		} catch (MyStackOperationException e) {
			System.out.println(e.getMessage());
		}
		// 弹栈
		try {
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
		} catch (MyStackOperationException e) {
			System.out.println(e.getMessage());
		}
	}
}
