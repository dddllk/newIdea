package day08;

/*
	需求：定义一个计算机类【电脑/笔记本】，计算机的属性：
		* 品牌
		* 型号
		* 颜色
  定义一个学生类：
  	* 学号
  	* 姓名
  	* 学生有一台笔记本
  请编写程序来表示以上的类，然后分别将类创建为对象，
  对象数量不限，然后让其中的一个学生去使用其中的一台笔记本电脑

  然后编译并运行，并且将整个指向过程采用图形的方式描述出来，所有代码全部写到当前java源文件中。
 */

// 测试类
public class OOTest06 {
	public static void main(String[] args) {

		// 创建笔记本对象
		Computer c = new Computer();
		c.brand = "Apple";
		c.type = "q123";
		c.color = "银灰色";

		// 创建学生对象
		Students dlk = new Students();
		dlk.name = "yy";
		dlk.No = 26;
		dlk.hp = c;
		// 笔记本电脑的品牌
		System.out.println(dlk.hp.brand);

	}
}
// 计算机类
class Computer {
	// 品牌
	String brand;
	// 型号
	String type;
	// 颜色
	String color;
}
// 学生类
class Students {
	// 学号
	int No;
	// 姓名
	String name;
	Computer hp;
}
