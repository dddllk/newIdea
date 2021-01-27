package day05;
/*
  关于Switch语句
    1：switch语句也属于选择结构，也是分支语句
    2.switch语句的语法结构：
      一个比较完整的switch语句应该这样写：
        switch(int或String类型的字面值或变量) {
          case int或String类型的字面值或变量：
            java语句;
            java语句;
            ...
            break;
          case int或String类型的字面值或变量：
           java语句;
           java语句;
           ...
           break;
          ...(可以有多个case)
          default:
           java语句;
           java语句;
           ...
        }
    3.switch语句的执行原理：
      switch后面的小括号当中的“数据”和case后面的“数据”进行一一匹配，匹配成功分支执行。
      按照自上而下顺序依次匹配。
    4.匹配成功，分支当中最后有“break;”语句的话，整个switch语句终止。
    5.匹配成功的分支执行，分支当中没有“break;”语句的话，直接进入下一个分支执行（不进行匹配），
      这种现象被称为case穿透现象，【提供break语句避免穿透】
    6.所有分支都没有匹配成功，当有default的语句的话，会执行default分支当中的程序。
    7.switch后面只能是int类型或者String的类型的数据，不能是探测其他类型。
      当然byte，short，char也可以直接写到switch和case的后面，因为它们可以进行自动类型转换。
      byte short char可以自动转换成int类型
      JDK6的，switch和case后面只能探测int类型。
      JDK7之后包括7版本在内，引入新特性，switch关键字和case关键字可以探测int或String类型的数据。
    8.case可以合并：
      例：
      int i = 10;
      switch(i) {
        case 1: case 2: case 3: case4:
          System.out.println("Test Code!");
      }
 */
public class SwitchTest01 {
  public static void main(String[] args) {
		// eg
	  // 接收用户输入
	  java.util.Scanner s = new java.util.Scanner(System.in);
	  System.out.println("请输入数字：");
	  int num = s.nextInt();
	  switch(num) {
		  case 1:
		  	System.out.println("星期一");
		  	break;
		  case 2:
		  	System.out.println("星期二");
		  	break;
		  case 3:
			  System.out.println("星期三");
			  break;
		  case 4:
			  System.out.println("星期四");
			  break;
		  case 5:
			  System.out.println("星期五");
			  break;
		  case 6:
			  System.out.println("星期六");
			  break;
		  case 7:
			  System.out.println("星期日");
			  break;
		  default:
		  	System.out.println("您输入的数字非法！");
	  }
  }
}
