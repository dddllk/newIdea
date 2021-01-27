package day14.object;

/*
equals()方法要重写彻底
 */
public class Test05 {
	public static void main(String[] args) {
		Address addr1 = new Address("重庆","江津", "402260");
		Address addr2 = new Address("北京","天安门", "111111");
		User u1 = new User("dlk", addr1);
		User u2 = new User("dlk", addr1);
		User u3 = new User("ddd", addr1);
		User u4 = new User("dlk", addr2);
		System.out.println(u1.equals(u2)); // true
		System.out.println(u1.equals(u3)); // false
		System.out.println(u1.equals(u4)); // false
	}
}
class User {
	String name;
	Address addr;

	public User() {}

	public User(String name, Address addr) {
		this.name = name;
		this.addr = addr;
	}
	// 重写equals方法
	// 重写规则：当一个用户的用户名和家庭住址都相同，表示同一个用户
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || !(o instanceof User)) return false;
		User user = (User) o;
		return (name.equals(user.name) && addr.equals(user.addr));
	}
}
class Address {
	String city;
	String street;
	String zipcode;

	public Address() {}

	public Address(String city, String street, String zipcode) {
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
	}

	// 重写equals方法
	// 当两个地址的城市、街道、邮政编码相同时，两个地址完全相同
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || !(o instanceof Address)) return false;
		Address addr = (Address)o;
		return (city.equals(addr.city) && street.equals(addr.street) && zipcode.equals(addr.zipcode));
	}
}
