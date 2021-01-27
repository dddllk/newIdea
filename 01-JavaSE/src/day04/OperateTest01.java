package day04;
/*
  赋值类运算符包括两种：
    基本的赋值运算符：
      =
    扩展的赋值运算符：+= -= *= /= %=
  赋值类的运算符的优先级：先执行等号右边的表达式，将执行结果赋值给左边的变量。
  注意以下代码：
    byte y = 10;
    y += 5; 等同于 y = (byte)(y + 5)

    int k = 10;
    k += 5;等同于 k = (int)(k + 5);

    long d = 10L;
    int y = 12;
    y += d;等同于 y = (int)(y + d);

    重要结论：扩展类的赋值运算符不改变运算结果类型，假设 最初是byte类型，运算结果还是byte类型
 */
public class OperateTest01 {
  public static void main(String[] args) {
    // 基本的赋值运算符
    int a = 12;
    System.out.println(a);

    a = a + 5;
    System.out.println(a);

    // 扩展运算符[+= 运算符可翻译为“追加/累加”]
    a += 5; //等同 a = a + 5;
    System.out.println(a);
    a -= 5; //等同 a = a - 5;
    System.out.println(a);

    a *= 25; //等同a = a * 25
    System.out.println(a);

    a /= 4; //等同 a = a / 4
    System.out.println(a);

    a %= 3; //等同 a = a % 3
    System.out.println(a);

    //------------------------------------------
    byte ab = 10; //可以正常运行，没有超出byte的取值范围
    // ab = 15 可以正常运行 15没有超出byte的取值范围
    // ab = ab + 2; // 编译报错
    // 原因：ab是byte类型，2是int类型， ab + 2是int类型， 大容量向小容量转换需要加强制类型转换符，语法编译报错。
    // 编译只检查语法，不运行程序
    // 纠正：
    ab = (byte)(ab + 2);
    System.out.println(ab);

    byte cd = 12;
    cd += 2; // 等同于 cd = (byte)(cd + 2);其实并不等同于：cd = cd + 5
    System.out.println(cd);
  }
}
