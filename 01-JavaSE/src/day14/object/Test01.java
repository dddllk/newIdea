package day14.object;

/*
1.Object类中的toString()方法：
	toString() 方法的作用：通过调用这个方法可以将一个”java对象“转换成”字符串“
	其实SUN公司在开发的java语言的时候，建议所有的子类都去重写toString()方法
2.Object类中的equals方法：
	public boolean equals(Object obj) {
		return (this == obj);
	}
	equals()方法判断两个对象是否相等

	判断两个java对象是否相等，不能使用“==”，因为“==”比较的是两个对象的内存地址。
	Object类中默认提供的方法是 “return (this == obj)” 来判断两个对象是否相等，
	而“==”判断的是两个java对象的内存地址。不能满足使用，需要重写equals方法

	IDEA 可以自动生成toString()方法和equals()方法
 */
public class Test01 {
	public static void main(String[] args) {
		MyTime myTime = new MyTime(1991, 9, 1);
		String s1 = myTime.toString();
		System.out.println(s1); // 没有重写toString()方法的结果：day14.tostring.MyTime@6e8dacdf

		MyTime myTime1 = new MyTime(1991, 9, 1);

		System.out.println(myTime == myTime1); // false

		System.out.println(myTime.equals(myTime1));// true
	}
}
class MyTime extends Object{ // 所有类都继承Object类（extends Object 可以省略）
	int year;
	int month;
	int day;

	public MyTime() {}
	public MyTime(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// 重写Object类中toString方法
	public String toString() {
	  return this.year + " 年 " + this.month + " 月 " + this.day + " 日";
	}
 // 重写Object类中的equals方法
// 重写equals方法要看方法具体实现的业务
//	public boolean equals(Object obj) {
//		/*
//			不能这样写 Object中不含有year，month，day等属性，要判断Object的话，需要进行向下转型
//		if(this.year == obj.year && this.month == obj.month && this.day == obj.day) {
//			return true;
//		}else {
//			return false;
//		}
//		 */
//		// 当前对象
//		int year1 = this.year;
//		int month1 = this.month;
//		int day1 = this.day;
//
//		// obj是不是传进去的的参数的实例
//		if(obj instanceof MyTime) {
//			// 如果是的话，将obj强制转换为传进去的参数类型
//			MyTime t = (MyTime)obj;
//			int year2 = t.year;
//			int month2 = t.month;
//			int day2 = t.day;
//			if(year1 == year2 && month1 == month2 && day1 == day2) {
//				return true;
//			}
//		}
//		return false;
//	}
//


	// 改良equals()方法一
//	public boolean equals(Object obj) {
//		// 如果obj是空，直接返回false
//		if(obj == null) return false;
//		// 如果obj不是一个MyTime，直接返回false
//		if(!(obj instanceof MyTime)) return true;
//		// 如果this和obj保存的内存地址相同，两个对象肯定是同一个对象，则直接返回true
//		if(this == obj) return true;
//		// 程序执行到这里说明obj不是null，obj是MyTime类型
//		MyTime t = (MyTime)obj;
//		if(this.year == t.year && this.month == t.month && this.day == t.day) return true;
//		// 程序执行到这里返回一个false
//		// 什么都没用则返回false
//		return false;
//	}

	// 再次改良equals()方法
//	public boolean equals(Object obj) {
//		// 如果obj是空 或者 如果obj不是一个MyTime，直接返回false
//		if(obj == null || !(obj instanceof MyTime)) return false;
//		// 如果this和obj保存的内存地址相同，两个对象肯定是同一个对象，则直接返回true
//		if(this == obj) return true;
//		// 程序执行到这里说明obj不是null，obj是MyTime类型
//		MyTime t = (MyTime)obj;
//		return (this.year == t.year && this.month == t.month && this.day == t.day);
//	}

	// IDEA 自动生成equal方法

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MyTime myTime = (MyTime) o;
		return year == myTime.year && month == myTime.month && day == myTime.day;
	}
}