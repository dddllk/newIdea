package jdbc;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Created by dlkyy on 2021/1/27 19:58
 *
 * 解决SQL注入问题('or '1'='1)
 * 如何解决：
 *  只要用户提供的信息不参与sql语句的编译过程
 */
public class JDBCTest11 {
  public static void main(String[] args) {
    // 初始化界面
    Map<String,String> userLoginMap = initUI();
    // 验证用户名密码
    boolean loginSuccess = login(userLoginMap);
    // 输出结果
    System.out.println(loginSuccess ? "success" : "fail");
  }

  /**
   *
   * @param userLoginMap 用户登录
   * @return false表示失败，true表示成功
   */
  private static boolean login(Map<String, String> userLoginMap) {
    // 定义标记
    boolean loginSuccess = false;

    // 定义变量
    String loginName = userLoginMap.get("loginName");
    String loginPwd = userLoginMap.get("loginPwd");

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    ResourceBundle rb = ResourceBundle.getBundle("jdbc");
    String driver = rb.getString("driver");
    String url = rb.getString("url");
    String user = rb.getString("user");
    String password = rb.getString("password");

    // 1.注册驱动
    try {
      Class.forName(driver);
      // 2.获取数据库连接
      conn = DriverManager.getConnection(url, user, password);
      // 3.获取预编译的数据库操作对象
      String sql = "select *from t_user where loginName = ? and loginPwd = ?"; // ?是占位符，一个问号接收一个值，不能使用单引号括起来
      // 程序执行到此处，会发送sql语句给DBMS，然后DBMS进行sql语句的预编译。
      ps = conn.prepareStatement(sql);
      // 给占位符传值(第一个问号下标是1，第二个问号下标是2，JDBC中下标从1开始)
      ps.setString(1, loginName);
      ps.setString(2, loginPwd);
      // 4.执行sql
      rs = ps.executeQuery(); // 不需要在传入sql语句
      // 5.处理结果集
      if(rs.next()) {
        // 登录成功！
        loginSuccess = true;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }finally {
      // 6.释放资源
      if(rs != null){
        try {
          rs.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if(ps != null){
        try {
          ps.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if(conn != null){
        try {
          conn.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    return loginSuccess;
  }

  /**
   * 初始化用户界面
   * @return 用户输入的用户名和密码等信息
   */
  private static Map<String, String> initUI() {
    System.out.println("欢迎使用！");
    Scanner sc = new Scanner(System.in);
    
    System.out.print("用户名：");
    String loginName = sc.nextLine();
    
    System.out.print("密码：");
    String loginPassword = sc.nextLine();
    
    Map<String, String> userLoginMap = new HashMap<>();
    userLoginMap.put("loginName", loginName);
    userLoginMap.put("loginPwd", loginPassword);
    
    return userLoginMap;
  }
}

/*
  绿色，已经加入控制暂未提交
  红色，未加入版本控制
  蓝色，加入，已提交，有改动
  白色，加入，已提交，无改动
  灰色：版本控制已忽略文件。
 */