package day08;
/*
	测试类
 */
public class OOTest02 {
	public static void main(String[] args) {
		// 创建User对象
		User u = new User();

		// 输出User对象内部实例变量的值
		System.out.println(u.username);
		System.out.println(u.userNo);
		System.out.println(u.address);

		// 修改User对象内部实例变量的值
		u.username = "Mike";
		u.userNo = 11;

		u.address = new Address();

		// 在main方法中目前只能看到一个引用u
		// 一切都是只能通过u来进行访问
		System.out.println(u.username + "居住在：" + u.address.city);

		u.address.city = "重庆";
		u.address.street = "江津";
		u.address.zipcode = "402260";

		System.out.println(u.username + "居住在：" + u.address.city);
	}
}
