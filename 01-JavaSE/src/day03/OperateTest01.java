package day03;
/*
  关于java编程中运算符之算术运算符
    +
    -
    *
    /
    % 求余数【取模】
    ++
    --
    注意：
      一个表达式中有多个运算符，运算符有优先级，不确定的加小括号，优先级得到提升。
      没必要专门记忆运算符的优先级
 */
public class OperateTest01 {
  public static void main(String[] args) {
    int i = 10;
    int j = 3;
    System.out.println(i + j);

    // 以下以++为例，--自学
    // ++
    int k = 10;
    // ++运算符可以出现在变量后面【单目运算符】
    k++;
    System.out.println(k);
    int y = 10;
    ++y;
    System.out.println(y);

    // 小结：
    // ++运算符可以出现在变量之前，也可以出现在变量后，无论是变量之前还是在变量之后
    // ++ 出现在变量后
    // 规则：先做赋值运算，再对变量中保存的值进行自加1

    int a = 100;
    int b = a++;
    System.out.println(a); //101
    System.out.println(b); //100

    // ++ 出现在变量之前
    int c = 100;
    int d = ++c;
    System.out.println(c);//101
    System.out.println(d);//101

    int mm = 500;
    System.out.println(mm ++); // 100
    System.out.println(mm); //101

    int x = 100;
    System.out.println(++x); //101
    System.out.println(x); //101

    System.out.println(--x); //100
    System.out.println(x++); //100
    System.out.println(x--); //101
    System.out.println(x--); //100
    System.out.println(x--); //99
    System.out.println(x); //98
  }
}
