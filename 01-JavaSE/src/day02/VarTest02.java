package day02;
/*
  关于java语言当中的变量：
    1.在方法体当中的java代码，是遵守自上而下的顺序依次执行的。逐行逐行执行
      特点：第二行的代码必须完整的结束之后，第三行程序才能执行。
    2.在同一个“作用域”当中，变量名不能重名，但是变量名可以重新赋值。
*/
public class VarTest02 {
  public static void main(String[] args) {
    int i = 100;
    System.out.println(i); // 100
    i = 200;
    System.out.println(i); // 200

    // 以下代码顺序有错误，先声明然后赋值再访问
    /*
      System.out.println(k);
      int k = 100
     */
  }
}
