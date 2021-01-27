package day04;
/*
  System.out.println(); 负责向控制台输出【从内存到控制台】
  接收用户键盘输入，从“键盘”到“内存”
 */
public class KeyInputTest {
  public static void main(String[] args) {
    // 第一步：创建键盘扫描器对象
    java.util.Scanner s = new java.util.Scanner(System.in);
    // 第二步：调用Scanner对象的next()方法开始接收用户键盘输入
    // 程序执行到这里会停下来等待用户输入
    // 当用户输入的时候，并且最终敲回车的时候，键入的信息会自动赋值给userInputContent
    String userInputContent = s.next(); // 标识符命名规范：见名知义

    // 将内存中的数据输出到控制台
    int num = s.nextInt();

    // 将内存中的数据输出到控制台
    // System.out.println("您输入了：" + userInputContent);

    System.out.println("您输入的数字是：" + num);
  }
}
