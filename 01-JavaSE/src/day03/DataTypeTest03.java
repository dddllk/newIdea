package day03;
/*
  关于java字符中的转义字符
    转义字符 \
    转义字符出现在特殊字符之前，会将特殊字符转换成普通字符
    \n 换行符
    \t 制表符
    \r
    \' 普通的单引号
    \" 普通的双引号
    \\ 普通的反斜杠
 */
public class DataTypeTest03 {
  public static void main(String[] args) {
    // 普通字符
    char c1 = 'n';
    System.out.println(c1);
    // 依照目前所学知识，以下程序无法编译通过，因为显然是一个字符串，不能使用单引号括起来
    // 但是进过编译，发现编译通过了。这说明以下并不是一个字符串，而是一个字符
    // 这是一个“换行符”，属于char类型的数据。
    // 反斜杠在java语言中具有转义功能。
    char c2 = '\n';
    // System.out.println()和System.out.print()区别：
    // println输出之后换行，print表示输出，但是不换行。

    // 普通t字符
    char x = 't';
    System.out.println(x);
    // 制表符tab
    // 制表符和空格不同，他们的ASCII码不同，体现在键盘上两个不同的按键。
    char y = 't';
    System.out.print("A");
    System.out.println(y);
    System.out.println("B");
    // 要求在控制台上输出反斜杠字符
    // 反斜杠加后面的单引号转义成不具备特殊含义的普通单引号字符
    // 左边的单引号缺少了结束的单引号字符，编译报错。
    //    char k = '\';
    //    System.out.println(k);
    // \\ 第一个反斜杠具有转义功能，将后面的反斜杠转义为普通的反斜杠字符
    // 结论：在java当中两个反斜杠代表一个普通的反斜杠字符
    char k = '\\';
    System.out.println(k);

    // 在控制台输出一个普通的单引号字符
    // char a = ''; 在java中不允许这样编写，编译报错
    // char a = '''; 第一个单引号和第二个单引号配对，多了一个单引号
    // 反斜杠具有转义功能 ，将第二个单引号转换成普通的单引号字符
    char a = '\'';
    System.out.println(a);
    char f = '"';
    System.out.println(f);

    System.out.println("\"HelloWorld\"");

    // jdk中自带的native2ascii.exe命令，可以将文字转换成ASCII码
    // 怎么使用这个命令
    // 在命令行输入native2ascii命令，回车，然后再输入文字自后回车，即可输出ASCII码

    char n = '\u4e2d'; // ‘中’对应的ASCII码是4e2d
    System.out.println(n);
    // char g = '4e2d'; 编译错误
    // char g = 'u4e2d'; 编译错误
    // 通过：反斜杠u联合起来后面的一串数字是某个文字的Unicode编码
    char g = '\u4e2d';
    System.out.println(g);
  }
}

