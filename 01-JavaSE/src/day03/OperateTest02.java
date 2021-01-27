package day03;
/*
  >
  >=
  <
  <=
  ==
  !=

  = 是赋值运算符
  == 是关系运算符

  关系运算符的运算结果一定是布尔类型  false/true

  关系运算符原理：
  int a = 10;
  int b = 10
  a > b 比较的时候，比较的是a中保存的10这个值和b中保存的10这个值之间的大小
  a == b也是如此
 */
public class OperateTest02 {
  public static void main(String[] args) {
    int a = 10;
    int b = 10;
    System.out.println(a > b); //false
    System.out.println(a >= b); //true
  }
}
