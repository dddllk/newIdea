package day14.computer;

public class ComputerTest {
	public static void main(String[] args) {
		InsertDrawable mouse = new Mouse();
		Laptop laptop = new Laptop(02,5000.0, mouse);
		laptop.Connect();
		System.out.println(laptop.getNo());
		System.out.println(laptop.getPrice());
	}
}
