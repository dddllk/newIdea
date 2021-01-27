package day08;

public class OOTest04 {
	public static void main(String[] args) {
		// 创建一个丈夫对象
		Husband dd = new Husband();
		dd.name = "dd";

		// 创建一个妻子对象
		Wife baby = new Wife();
		baby.name = "baby";

		// 结婚【能通过丈夫找到妻子，通过妻子也能找到丈夫】
		dd.w = baby;
		baby.h = dd;

		// 得到以上“dd”的妻子的名称
		System.out.println(dd.name + "妻子名叫：" + baby.name);
		System.out.println(dd.name + "妻子名叫：" + dd.w.name);
		System.out.println(baby.h.name);
	}
}
