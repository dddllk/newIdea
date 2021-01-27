package day16.homework3;

public class Tank extends Weapon implements Moveable, Shootable{

	@Override
	public void move() {
		System.out.println("Tank is move!");
	}

	@Override
	public void shoot() {
		System.out.println("Tank is shooting!");
	}
}
