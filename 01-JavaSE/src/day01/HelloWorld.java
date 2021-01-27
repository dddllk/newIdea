package day01;
// public 表示公开的
// class 表示一个类
// HelloWorld 表示一个类名
public class HelloWorld { // 表示定义一个公开的类，起名HelloWord

  // 实体【记住】
  // 实体中不允许直接编写java语句【除声明变量之外】

  /*
   public 表示公开
   static 表示静态
   void 表示空
   main 表示方法名是main
   (String[] args) 是一个main方法的形式参数列表

   需要记住的是：
    以下的方法是一个程序的主方法，是程序的执行入口
    是sun公司规定的，固定编写方式
  */
  public static void main(String[] args) { //表示定义一个公开的静态主方法
    // 方法体
    // 方法体
    // 方法体
    // 方法体

    // java语句【java语句以";"终止，必须是半角的分号】
    // 以下语句的作用：向控制台输出一段消息
    System.out.println("Hello World！");
  }
}

  /*
    public class 和 class 的区别
    一个java源文件当中可以定义多个class
    一个java源文件中public的class不是必须的
    一个java源文件会对应生成一个xxx.class字节码文件
    一个java源文件当中定义公开类的话，public的class只能有一个，并且该类名必须和java源文件一致
    每一个class中都可以编写main方法，都可以设定程序的入口，想执行B.class中main方法：java B，想执行X.class中的main方法java X
    注意：当在命令窗口中执行java Hello, 那么要求Hello.class中必须有主方法，没有主方法会出现运行阶段的错误
  */

  /*
    总结第一章需要掌握的内容
    0.理解java的加载与执行
    1.能够独立搭建java开发环境
    2.能够独立编写HelloWorld程序，编译并运行
    3.掌握环境变量path的原理以及如何配置
    4.java中的注释
    5.public class和class的区别
  */