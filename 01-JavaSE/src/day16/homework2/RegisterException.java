package day16.homework2;

public class RegisterException extends Exception{

	// 无参构造
	public RegisterException() {}

	// 有参构造
	public RegisterException(String s) {
		super(s);
	}
}
