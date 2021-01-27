package day16.enumtest;

/*
	枚举类：
		1.枚举是一种引用数据类型
		2.语法：
		enum 枚举类型名 {
			枚举值1,枚举值2
		}
		3.结果有两种情况的建议使用布尔类型
			结果超过三种结果的，使用枚举类型
			例如：四季，颜色。。。等
 */
public class EnumTest01 {
	public static void main(String[] args) {
		Result r = divide(10, 0);
		System.out.println(r == Result.SUCCESS ? "成功" : "失败");
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static Result divide(int a, int b) {
		try {
			int c = a / b;
			return Result.SUCCESS;
		} catch (Exception e) {
			return Result.FAIL;
		}
	}
}

// 枚举：一枚一枚可以列举出来的，才建议使用枚举类型
// 枚举编译之后也是生成class文件
// 枚举也是一种引用数据类型
// 枚举中的每一个值都可以看做是常量
enum Result {
	// SUCCESS, 和FAIL都是Result的一个值
	SUCCESS, FAIL
}