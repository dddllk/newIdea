package day11;
/*
	主人
 */
/*
// 这种方式没有使用java语言当中的多态机制，存在的缺点：Mater的扩展能力很差，
// 因为只要加一个新的宠物，Master类就需要添加新的方法
public class Master {
	// 喂养宠物的方法
	public void feed(Dog d) {
		d.eat();
	}
	public void feed(Wolf f) {
		f.eat();
	}
}
*/
// 降低程序的耦合度【解耦合】，提高程序的扩展力【软件开发的一个很重要的目标】
public class Master {
	// Master主人类面向的是一个抽象的Pet，不再面向具体的宠物
	// 提倡：面向抽象编程，不要面向具体编程。
	// 面向抽象编程的好处是，耦合度低，扩展能力强。
	public void feed(Pet p) {
		p.eat();
	}
}

