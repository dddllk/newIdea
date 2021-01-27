package day07;
/*
	方法重载：
		1.方法重载即：overload
		2.什么时候考虑使用方法重载？
			* 功能相似的时候，尽可能让方法名相同。
			【但是：功能不同、不相似的时候，尽可能让方法名不同】
		3.什么条件满足了之后构成了方法重载？
			* 在同一个类中
			* 尽可能让方法名相同
			* 参数列表不同：
				- 数量不同
				- 顺序不同
				- 类型不同
		4.方法重载和什么有关系，和什么没有关系？
 */
public class OverloadTest03 {
	// 以下两个方法构成方法重载
	public static void m1(){}
	public static void m1(int a){}
	// 以下两个方法构成方法重载
	public static void m2(int a, double b){}
	public static void m2(double a, int b){}
	// 以下两个方法构成方法重载
	public static void m3(int x){}
	public static void m3(double x){}
	// 编译错误，以下不是方法重载，是发生了方法重复了
	/*
	public static void m4(int a, int b) {}
	public static void m4(int b, int a) {}
	 */
}
