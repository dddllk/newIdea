package day20.bean;

public class User {
	String name;
	// 无参构造
	public User(){
		System.out.println("无参构造方法");
	}
	// 有参构造
	public User(String name) {
		this.name = name;
	}
}
