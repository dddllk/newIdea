package day10;
/*
	this什么时候不能省略：
		用来区分局部变量和实例变量的时候“this.”不能省略
 */

// 用户类
public class User {
	private int id;
	private String name;
	// 构造函数
	public User() {

	}
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	//setter and getter
	// 以下程序的id和实例变量id无关，不能采用这种方式
	/*
	public void setId(int id) {
		id = id;
	}
	 */
	public void setId(int id) {
		// 等号前面的this.id是实例变量id
		// 等号后面的id是局部变量id
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
