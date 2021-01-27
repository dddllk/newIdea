package day16.homework2;

/*
	作业：
		编写程序模拟用户注册：
			1.程序开始执行时，提示用户输入用户名和密码；
			2.输入信息之后，后台java程序模拟用户注册
			3.注册用户名长度要求在6-14位之间，小于或者大于都表示异常
		注意：
		完成注册的方法可以放到一个单独的类中。
		异常类自定义就可
		class UserService {
			public void register(String username, String password){
				//这个方法完成注册
			}
		}
		编写main方法，在main方法中接收用户输入信息，
		在main方法中调用UserService的register方法完成注册
 */

public class User {
	private String name;
	private String pwd;

	// 无参构造
	public User() {
	}

	// 有参构造
	public User(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;
	}

	// setter and getter


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	// toString
	public String toString() {
		return "User[name = " + name + ",pwd = " + pwd + "]";
	}
}
