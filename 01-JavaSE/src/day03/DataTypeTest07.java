package day03;
/*
  关于布尔数据类型
    boolean
  在java语言中boolean类型只有两个值：true和false，没有其他值。
  不像C语言中，0和1表示假和真

  在底层存储的时候Boolean类型占用一个字节，因为实际存储的时候false底层是0，
  true底层是1。

  布尔类型在实际开发当中非常重要，经常使用在逻辑判断和条件控制语句中。
 */
public class DataTypeTest07 {
  public static void main(String[] args) {
//    boolean flag = 1; 不兼容类型
    boolean loginSuccess = true;
//    if 语句以后讲
    if(loginSuccess) {
      System.out.println("恭喜你，登录成功");
    }else {
      System.out.println("对不起，用户名不存在或密码错误");
    }
  }
}
