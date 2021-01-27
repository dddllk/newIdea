package day16.homework2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("欢迎使用注册系统！");
		System.out.print("请输入您的用户名：");
		String username = sc.next();
		System.out.print("请输入您的密码：");
		String password = sc.next();

		try {
			if(UserService.register(username, password));
			System.out.println("注册成功，欢迎" + username + "。");
		} catch (RegisterException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
