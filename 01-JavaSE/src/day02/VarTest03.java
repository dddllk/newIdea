package day02;
/*
  关于java中的变量
    变量的作用域
    1.什么是作用域？
      变量的作用域，其实描述的就是变量的有效范围。
      在什么范围之内是可以被访问的，只要出了这个范围该变量就无法访问了。
    2.变量的作用域只要记住一句话：
      出了大括号就不认识了
 */
public class VarTest03 {

  // 注意：这里static不要去掉
  static int k = 90;

  public static void main(String[] args) {
    // 变量i的作用域是main方法
    // 在整个main方法中是有效的，可见的，可访问的
    int i = 100;
    System.out.println(i); // 100
    System.out.println(k); // 90
  }
  public static void doSome() {
    // 这里无法访问main方法中的变量
    // 已经超出了i变量的作用域
    // System.out.println(i);

    System.out.println(k); // 90
  }
}
