package day12.homework;

public class HomeWork2 {
	public static void main(String[] args) {
		// 无参数构造方法
		Vehicle v1 = new Vehicle();
		// 有参数构造方法
		Vehicle v2 = new Vehicle(100,15.0);
		v2.speedUp();
		System.out.println("speed: " + v2.getSpeed());
		v2.speedDown();
		System.out.println("speed: " + v2.getSpeed());
	}
}
class Vehicle {
//	速度
	private int speed;
//	体积
	private double size;

	public Vehicle() {
	}

	public Vehicle(int speed, double size) {
		this.speed = speed;
		this.size = size;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
//	加速方法
	public void speedUp() {
		this.speed += 5;
	}
//	减速方法
	public void speedDown() {
		if(this.speed >= 5) {
			this.speed -= 5;
		}
	}
}
