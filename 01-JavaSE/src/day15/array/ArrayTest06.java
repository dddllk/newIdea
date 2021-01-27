package day15.array;
/*
	模拟用户输入，用户必须要输入用户名、密码
 */
public class ArrayTest06 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("请输入用户名密码：【例如：abc 123】");
			return;
		}
		String username = args[0];
		String password = args[1];
		// 变量防止前面可以有效避免空指针
		if("admin".equals(username) && "123".equals(password)) {
			System.out.println("登录成功，您可以继续使用该系统");
		}else {
			System.out.println("登录失败！");
		}
	}
}
