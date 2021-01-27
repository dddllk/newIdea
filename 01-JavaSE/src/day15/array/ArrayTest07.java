package day15.array;
/*
	一维数组的深入：数据中存储类型为引用数据类型
	对于数组来说：实际上只能存储java对象的“内存地址”，数据中存储的每个元素是“引用”
 */
public class ArrayTest07 {
	public static void main(String[] args) {
		// 创建一个Animal对象
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal[] animals = {a1, a2};

		for (int i = 0; i < animals.length; i++) {
		  animals[i].move();
		}
	}
}
class Animal {
	public void move() {
		System.out.println("Animal move...");
	}
}
