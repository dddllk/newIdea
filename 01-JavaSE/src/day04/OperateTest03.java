package day04;
/*
  三元运算符/三目运算符/条件运算符
  1.语法规则：
    布尔表达式 ？ 表达式1 : 表达式2
  2.三元运算符的执行原理？
    当布尔表达式的执行结果是true时，选择表达式1作为整个表达式的执行结果
    当布尔表达式的执行结果是false是，选择表达式2作为整个表达式的执行结果
 */
public class OperateTest03 {
  public static void main(String[] args) {
//    编译报错，因为不是一个完整的java语句
//    sex ? 'male': 'female'
    boolean sex = true;
    char c = sex ? '男' : '女';
    System.out.println(c);

//    语法错误，编译报错，结果可能是String，也可能是char，但是不能用char来接收数据。
//    类型不兼容
//    char c1 = sex ? "男" : '女';

//    编译错误，类型不兼容
//    char c2 = sex ? "男" : "女";

//    可以执行
    System.out.println(sex ? 'm' : 'f');

    String s = sex ? "男的" : "女的";
    System.out.println(s);
  }
}
