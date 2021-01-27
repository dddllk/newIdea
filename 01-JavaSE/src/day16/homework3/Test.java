package day16.homework3;

public class Test {
	public static void main(String[] args) {
		// 构建一个军队
		Army army = new Army(5);
		// 创建武器对象
		Fighter fighter = new Fighter();
		Fighter fighter2 = new Fighter();
		Fighter fighter3 = new Fighter();
		Tank tank = new Tank();
		Weapon tank1 = new Tank();
		Flack flack = new Flack();
		Refuelling refuelling = new Refuelling();
		// 添加武器
		try {
			army.addWeapon(fighter);
			army.addWeapon(fighter2);
			army.addWeapon(fighter3);
			army.addWeapon(tank);
			army.addWeapon(flack);
			army.addWeapon(refuelling);
			army.addWeapon(tank1);
		} catch (MyException e) {
			// 输出异常信息
			System.out.println(e.getMessage());
		}

		// 可移动的移动
		army.moveAll();

		// 可攻击的攻击
		army.attackAll();
	}
}
