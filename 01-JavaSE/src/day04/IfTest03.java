package day04;
/*
  需求：
    判断当前的天气：
      当外面下雨的时候：
        带雨伞：
          判断性别：
            当性别为男：带一把大黑伞
            当性别为女：带一把小花伞
      当外边是晴天的时候：
        判断天气的温度：
          当天气温度在30度以上：
            当性别为男：带墨镜
            当性别为女：擦防嗮霜
   提示：
    1.一定会用到嵌套
    2.天气状况、温度、性别都需要从键盘输入。
 */
public class IfTest03 {
  public static void main(String[] args) {
    // 从键盘输入
    java.util.Scanner s = new java.util.Scanner(System.in);
    // 提示用户输入当前天气
    System.out.print("请输入当前天气【下雨或晴天】：");
    // 接收天气：
    String weather = s.next();
    // 提示用户输入性别
    System.out.print("请输入您的性别【男或女】：");
    // 接收性别：
    String sex = s.next();
    // 逻辑判断
    if(weather.equals("晴天")) {
      System.out.print("请输入当前温度：");
      double temperature = s.nextDouble();
      if(temperature >= 30) {
        if(sex.equals("男")) {
          System.out.println("请戴墨镜");
        }else {
          System.out.println("请擦防晒霜");
        }
      }else {
        System.out.println("请穿好衣服再出门");
      }
    }else if(weather.equals("下雨")) {
      if(sex.equals("男")) {
        System.out.println("请您带一把大黑伞");
      }else {
        System.out.println("请您带一把小花伞");
      }
    }else {
      System.out.println("您输入的天气错误！");
    }
  }
}
