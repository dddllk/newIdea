package day20.Service;


public class UserService {
	/**
	 *
	 * @param name      用户名
	 * @param password  密码
	 * @return true表示登录成功，false表示登录失败
	 */
	private boolean login(String name, String password) {
		return "admin".equals(name) && "123".equals(password);
	}

	/**
	 * 退出系统的方法
	 */
	public void logout() {
		System.out.println("系统已经安全退出");
	}
}
