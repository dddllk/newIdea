package day10;

public class ChineseTest {
	public static void main(String[] args) {
		// 创建中国人对象1
		Chinese dd = new Chinese("1", "dd");
		System.out.println(dd.id + "," + dd.name + "," + Chinese.country);
		// 创建中国人对象2
		Chinese dd1 = new Chinese("2", "dd1");
		System.out.println(dd1.id + "," + dd1.name + "," + Chinese.country);

		// 所有静态的数据都是可以采用”类名.“，也可以采用”引用.“，建议采用前者
		// 采用”引用.“的方式访问的时候，即使引用是null，也不会出现空指针异常。
		// 因为访问静态的数据不需要对象的存在
		System.out.println(Chinese.country);
		System.out.println(dd.country);
		dd = null;
		System.out.println(dd.country);
	}
}
