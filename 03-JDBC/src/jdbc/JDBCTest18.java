package jdbc;

import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by dlkyy on 2021/1/28 22:10
 *
 * 这个程序负责修改被锁定的记录
 */
public class JDBCTest18 {
  public static void main(String[] args) {
    Connection conn = null;
    PreparedStatement ps = null;

    try {
      conn = DBUtil.getConnection();
      // 开启事务
      conn.setAutoCommit(false);
      // sql
      String sql = "update emp set sal = sal*1.1 where job = ?";
      ps = conn.prepareStatement(sql);
      ps.setString(1, "MANAGER");
      // 执行sql
      int count = ps.executeUpdate();
      System.out.println(count);
    } catch (SQLException e) {
      if(conn != null){
        try {
          conn.rollback();
        } catch (SQLException e1) {
          e1.printStackTrace();
        }
      }
    }finally {
        DBUtil.close(conn, ps, null);
    }
  }
}
