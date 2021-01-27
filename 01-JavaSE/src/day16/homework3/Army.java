package day16.homework3;
/*
	开放型题口：随意发挥
		写一个类Army，代表一支军队，这个类有一个属性Weapon数组w（用来存储该军队所有的武器）
 		该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来限定该类所能拥有的最大武器数，
 		并用这一大小来初始化数组w

 		该类还提供一个方法addWeapon(Weapon wa), 表示把参数wa所代表的武器加入到数组w中。
 		在这个类中还定义两个方法attackAll() 让w数组中的所有武器攻击；
 		以及moveAll()让w数组中的所有可移动武器移动。

 		写一个主方法去测试以上程序。

 		提示：
 			Weapon是一个父类。应该有很多子武器。
 			这些子武器应该有一些是可移动的，有一些是可攻击的。
 */
/*
	类在强制类型转换过程中，如果是类转换成接口类型。
	那么类和接口之间不需要存在继承关系，也可以转换，
	java中允许
 */
public class Army {
	// Weapon数组
	private Weapon[] weapons;

	/**
	 * 创建军队的构造方法
	 * @param count 武器数量
	 */
	public Army(int count) {
		// 动态初始化数组中每一个元素默认值是null
		// 武器数组是有了，但是武器数组中没有放武器。
		weapons = new Weapon[count];
	}

	/**
	 * 将武器加入数组
	 * @param weapon
	 */
	public void addWeapon(Weapon weapon) throws MyException {
		// 添加武器
		for(int i = 0; i < weapons.length; i++) {
			if(null == weapons[i]) {
				weapons[i] = weapon;
				return;
			}
		}
		// 程序执行到此处说明，武器没有添加成功
		throw new MyException("武器数量已达上限！");
	}

	/**
	 * 所有可攻击的武器攻击
	 */
	public void attackAll() {
		// 遍历数组
		for(int i = 0; i < weapons.length; i++) {
			if(weapons[i] instanceof Shootable) {
				// 调用子类的方法，向下转型
				Shootable shootable = (Shootable)weapons[i];
				shootable.shoot();
			}
		}
	}

	/**
	 * 所有可移动的武器移动
	 */
	public void moveAll() {
		// 遍历数组
		for(int i = 0; i < weapons.length; i++) {
			if(weapons[i] instanceof Moveable) {
				Moveable moveable = (Moveable)weapons[i];
				moveable.move();
			}
		}
	}

}
