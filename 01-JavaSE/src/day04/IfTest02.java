package day04;
/*
  需求：
    假设系统给定一个人的年龄，根据年龄来判断这个人所处生命的哪个阶段，年龄必须在【0-150】
    【0-5】    幼儿
    【6-10】   少儿
    【11-18】  青少年
    【19-35】  青年
    【36-55】  中年
    【56-150】 老年
 */
public class IfTest02 {
  public static void main(String[] args) {
    // 1.接收键盘输入：年龄【输入的时候必须输入数字】
    java.util.Scanner s = new java.util.Scanner(System.in);
    System.out.println("请输入年龄："); // 输出提示信息，提示用户进行数据输入
    int age = s.nextInt(); //等待用户输入，输入之后自动接收，赋值给age变量

    // 根据年龄进行逻辑判断
    String str = "老年";
    if(age < 0 || age > 150) {
      str = "您输入的年龄有误";
    }else if(age <= 5) {
      str = "幼儿";
    }else if(age <= 10) {
      str = "少儿";
    }else if(age <= 18) {
      str = "青少年";
    }else if(age <= 35) {
      str = "青年";
    }else if(age <= 55) {
      str = "中年";
    }
    System.out.println(str);
  }
}
