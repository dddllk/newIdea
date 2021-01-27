package day16.homework2;

public class UserService {

	/**
	 * @param username
	 * @param password
	 * @return
	 * @throws RegisterException
	 */
	// 完成注册
	public static boolean register(String username, String password) throws RegisterException {
		// 编码经验
		// ①引用等于null这个判断最好是放到所有判断条件的最前面
		// ②username == null 不如 null == username
		// 用户名为空
		if(null == username) {
			throw new RegisterException("用户名为空");
		}
		// 密码为空
		if(null == password) {
			throw new RegisterException("密码为空");
		}
		// 用户名长度不足
		if(username.length() < 6 || username.length() > 14) {
			throw new RegisterException("用户名长度不足，或者超出长度");
		}
		return true;
	}
}
