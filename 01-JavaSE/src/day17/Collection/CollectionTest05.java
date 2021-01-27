package day17.Collection;

/*
结论：
	放在集合的元素要一定要重写equals方法

 */
import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest05 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();
		// 创建用户对象
		User u1 = new User("dd");
		User u2 = new User("dd");
		// u1加入集合
		c.add(u1);
		// 判断集合是否包含u2
		// 没有重写equals方法前，System.out.println(c.contains(u2));结果为false
		// 重写equals方法后，System.out.println(c.contains(u2));结果为true
		System.out.println(c.contains(u2));
		// 内存地址还是不同
		System.out.println(u1 == u2);
		System.out.println(u2.getName().equals(u1.getName())); // true

		// remove()有调用equals方法，
		// 而equals已经被重写，u1即u2
		// 移除u2
		c.remove(u2);
		// 集合长度为0
		System.out.println(c.size()); // 0
	}
}

class User {
	private String name;
	public User() {}
	public User(String name) {
	  this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 重写equals方法
	// 将来调用equals方法的时候，一定调用的这个重写的equals方法。
	// 这个equals方法比较的原理是：只要姓名相同就表示同一个用户
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || !(o instanceof User)) return false;
		// 代码执行到这里说明o一定是User对象的实例
		User u = (User) o;
		// 如果名字一样，表示同一个人（不再比较对象的内存地址了）
		return u.name.equals(name);
	}
}

