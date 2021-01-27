package day10;

public class UserTest {
	public static void main(String[] args) {
		User user = new User(100, "dd");
		System.out.println(user.getId());
		System.out.println(user.getName());

		// 修改名字
		user.setName("yy");
		System.out.println(user.getName());
	}
}
