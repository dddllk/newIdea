package day03;
/*
  关于java中的整数型
    数据类型         占用空间大小            默认值             取值范围
    -------------------------------------------------------------
    byte                1                 0                【-128~127】
    short               2                 0
    int                 4                 0                -2147183648 ~ 2147183647
    long                8                 0L

  1.java语言当中“整数型字面值”默认被当做int类型来处理。要让这个”整数型字面值“被当做long类型
  来处理，需要在“整数型字面值”后面添加"l/L"。建议使用L
  2.java语言中的整数型字面字有三中表示方式：
    十进制 【默认的方式】
    八进制 【以0开始】
    十六进制 【以0x开始】

 */
public class DataTypeTest04 {
  public static void main(String[] args) {
    int a = 16;
    int b = 012;
    int c = 0x11;

    System.out.print(a);

    // 123这个整数型字面值是int类型
    // i 变量声明的时候也是int类型
    // int 类型的123赋值给int类型的变量i，不存在类型转换
    int i = 123;
    System.out.println(i);

    // 456整数型字面值是int类型，占用4个字节
    // x 变量在声明的时候是long类型，占用8个字节
    // int类型的字面值456赋值给long类型变量x，存在类型转换
    // int 类型转换成long类型
    // int 类型是小容量
    // long 类型是大容量
    // 小容量可以自动转换成大容量，称为自动类型转换机制
    long x = 456;
    System.out.println(x);

    // 2147483647字面值是int类型，占用4个字节
    // y 是long类型，占用8个字节，自动类型转换
    long y = 2147483647;
    System.out.println(y);

//    long z = 2147483648;
//    编译错误，过大的整数2147483648
//    2147483648 被当作int类型四个字节来处理，但是这个字面值超出了int类型范围
//    System.out.println(z);

//    解决错误
//    2147483648字面值一上来就当作long类型来处理，在字面值后面添加L
//    2147483648L是long类型
//    z是long类型变量，一下程序不存在类型转换。
    long z = 2147483648L;
    System.out.println(z);
    /*
      byte x = (byte)120;
      当一个整数型字面值没有超出byte、short、char的取值范围，这个字面值
      可以直接赋值给byte、short、char类型的变量，这种机制sun公司允许了，目的是为了方便程序员编程
     */
  }
}
