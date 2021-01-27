package day14.访问控制权限1;

import day14.访问控制权限.User;

public class Vip extends User {
	public void running() {
		// protected 可以
		System.out.println(this.age);
		// 默认不可以
		// System.out.println(this.name);
	}
}
