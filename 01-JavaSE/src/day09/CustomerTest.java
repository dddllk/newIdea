package day09;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c = new Customer();

		c.setId(100);
		c.setName("dlk");
		c.setAddr("bj");
		c.setAge(26);

		System.out.println(c.getId());
		System.out.println(c.getAge());
		System.out.println(c.getAddr());
		System.out.println(c.getName());
	}
}
