package day16.homework3;

public class Refuelling extends Weapon implements Moveable{
	@Override
	public void move() {
		System.out.println("Refuelling is flying");
	}
}
