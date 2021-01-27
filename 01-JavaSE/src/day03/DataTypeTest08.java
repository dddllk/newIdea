package day03;
/*
  关于基本数据类型之间的相互转换：转换规则
    * 1.八种基本数据类型中除布尔类型之外，剩余的7中类型之间都可以相互转换。
    * 2.小容量向大容量转换，称为自动类型转换，容量从小到大排序：
      byte < short < int < long < float < double
             char
      注：任何浮点类型不管占用多少个字节，都比整数类型容量大。
      char和short可表示的种类数量相同，但是char可以取更大的正整数。
    * 3.大容量转换成小容量，叫做强制转换，需要加强制类型转换符，程序才能编译通过
      但是在运行阶段可能会损失精度，所以谨慎使用。
    * 4.但整数字面值没有超出byte、short、char的取值范围，可以直接赋值给byte、short、char类型的变量
    * 5.byte、short、char混合运算的时候，各自先转换成int类型再做运算
    * 6.多种数据类型混合运算，先转成容量最大的那种类型再做运算
    注意：
    byte b = 3; 可以编译通过，3没有超出byte类型取值范围
    int i = 10;
    byte b = i / 3; 编译报错，编译器只检查语法，不会”运算“ i/3

    程序编译是编译，运行是运行！！！
 */
public class DataTypeTest08 {
  public static void main(String[] args) {
    double d = 10 / 3; //先算10/3 = 3，然后再赋值给double，dd变成3.0
    System.out.println(d); // 3.0

    d = 10.0 / 3; //先将3转换成3.0再计算
    System.out.println(d); // 3.3333333333333335
  }
}
