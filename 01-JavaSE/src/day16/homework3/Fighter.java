package day16.homework3;

public class Fighter extends Weapon implements Moveable, Shootable{

	@Override
	public void move() {
		System.out.println("Fighter is flying");
	}

	@Override
	public void shoot() {
		System.out.println("Fighter is shooting");
	}
}
