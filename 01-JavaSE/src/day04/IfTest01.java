package day04;
/*
  关于java语言中的if语句，属于选择结构，if语句又称分支语句/条件控制语句：
    1.if语句的语法结构：四种编写方式
      第一种：
        if(布尔表达式) {
          java语句;
            ...
            ...
            ...
        }
     第二种：
      if(布尔表达式) {
        java语句;
        ...
        ...
        ...
      }else {
        java语句;
        ...
        ...
        ...
      }
    第三种：（可写多个else if）
      if(布尔表达式) {
        java语句;
        ...
        ...
        ...
      }else if(布尔表达式) {
        java语句;
        ...
        ...
        ...
      }else if(布尔表达式){
        java语句;
        ...
        ...
      }
   第四种：(可写多个else if)
      if(布尔表达式) {
        java语句;
        ...
        ...
        ...
      }else if(布尔表达式) {
        java语句;
        ...
        ...
        ...
      }else if(布尔表达式){
        java语句;
        ...
        ...
      }else {
        java语句;
        ...
        ...
      }
    2.重点：对于java中的if语句来说，只要有一个分支执行，整个if语句全部结束。
    3.主语：以上第二种和第四种编写方式都带有else分支，这种方式可以保证100%的会有一个分支执行。
    4.所有控制语句都是可以嵌套使用的，只要合理嵌套就行
    5.if语句的分支中只有一条java语句的话，大括号可以省略不写。
      if(布尔表达式) {
        一条java语句;
      }
      等价于
      if(布尔表达式) 一条java语句;
 */
public class IfTest01 {
  public static void main(String[] args) {
    // 需求所在位置五公里范围之内有肯德基，去kfc吃午饭了
    double distance = 6.0; //单位km，距离数据类型是double
    if(distance < 5) {
      System.out.println("去kfc吃午饭");
    }
    /*
      需求：
        假设系统给定学生的成绩，成绩可能带有小数点
        根据学生成绩判定学生的成绩等级：
        [90 - 100] A级
        [80 - 90)  B级
        [70 - 80)  C级
        [60 - 70)  D级
        [0  - 60)  E级
        以上逻辑判断采用if语句完成
     */
    /*
    double score = 52.5;
    if (score < 0 || score > 100) {
      System.out.println("您提供的成绩不合法");
    }else if (score >=90 & score <= 100) { //没有必要判断成绩是否小于等于100,能执行到这里，成绩一定是小于等于100的
      System.out.println("成绩为A级别");
    }else if (score >=80 & score < 90) {
      System.out.println("成绩为B级别");
    }else if (score >=70 & score < 80) {
      System.out.println("成绩为C级别");
    }else if (score >=60 & score < 70) {
      System.out.println("成绩为D级别");
    }else{
      System.out.println("成绩为E级别");
    }
  }
  */
    double score = 100;
    String s = "成绩为E级别";
    if (score < 0 || score > 100) {
      s = "您提供的成绩不合法";
    }else if (score >= 90) {
      s = "成绩为A级别";
    }else if (score >= 80) { //能够判断到这里说明成绩一定是 < 90的
      s = "成绩为B级别";
    }else if (score >= 70) {
      s = "成绩为C级别";
    }else if (score >= 60) {
      s = "成绩为D级别";
    }
    System.out.println(s);
  }
}
