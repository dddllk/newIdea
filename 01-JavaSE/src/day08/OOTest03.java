package day08;

public class OOTest03 {
	public static void main(String[] args) {
		User u = new User();
		Address addr = new Address();
		u.address = addr;
		addr.city = "重庆";

		System.out.println(u.address.city);
	}
}
