package day10;
/*
	自定义的日期类
	 this可以使用在哪里：
	 	1. 可以使用在实例方法当中，代表当前对象【语法格式：this.】
	 	2. 可以使用在构造方法当中，通过当前的构造方法可以调用其他构造方法【语法格式：this(实参)】
	注意：Call to 'this()' must be first statement in constructor body（this()只能出现在构造函数的第一行）
 */
public class Date {
	// 属性
	private int year;
	private int month;
	private int day;
	// 构造函数
	/*
		需求：当程序员调用无参数构造方法的时候，默认创建的日期是1970-01-01
	 */
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public Date() {
		/*
		this.year = 1970;
		this.month = 1;
		this.day = 1;
		 */
		// 以上代码可以通过调用另外一个构造方法来完成
		// 但是前提是不能通过创建新的对象。以下代码表示创建了一个全新的对象
		// new Date(1970, 1, 1);
		// 需要采用以下的语法来完成构造方法的调用
		// 这种方式不会创建新的java对象，但同时又可以达到调用其他的构造方法。
		// System.out.println("dd");
		this(1970,1,1);
	}
	// setter and getter
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
	  this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}

	// 对外提供一个方法可以将日期打印输出到控制台
	public void print() {
		System.out.println("系统的日期是：" + this.year + "年" + this.month + "月" + this.day + "日");
	}
}
