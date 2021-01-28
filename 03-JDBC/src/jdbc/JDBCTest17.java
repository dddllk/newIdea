package jdbc;

import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by dlkyy on 2021/1/28 21:36
 *  这个程序开启一个事务，这个事务专门进行查询，并且使用行级锁/悲观锁，锁住相关记录
 */
public class JDBCTest17 {
  public static void main(String[] args) {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
      conn = DBUtil.getConnection();
      // 开启事务
      conn.setAutoCommit(false);

      String sql = "select ename,job,sal from emp where job = ? for update";
      ps = conn.prepareStatement(sql);
      ps.setString(1, "MANAGER");

      rs = ps.executeQuery();
      while(rs.next()) {
        System.out.println(rs.getString("ename") + ", " + rs.getString("job")
            + ", " + rs.getDouble("sal"));
      }
      // 提交事务（事务结束）
      conn.commit();
    } catch (SQLException e) {
      if(conn != null){
        try {
          // 回滚事务
          conn.rollback();
        } catch (SQLException e1) {
          e1.printStackTrace();
        }
      }
    } finally {
        DBUtil.close(conn, ps, rs);
    }
  }
}
