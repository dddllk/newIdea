package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * Created by dlkyy on 2021-01-28 14:15
 *
 * PreparedStatement 完成INSERT、DELETE、UPDATE
 */
public class JDBCTest13 {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("jdbc");
		String driver = rb.getString("driver");
		String url = rb.getString("url");
		String user = rb.getString("user");
		String password = rb.getString("password");

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			// 注册驱动
			Class.forName(driver);
			// 获取数据库连接
			conn = DriverManager.getConnection(url, user, password);
			// 获取预编译的数据库执行对象
			// 插入
			String sql = "insert  into dept(deptno, dname, loc) values(?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 66);
			ps.setString(2, "人事部");
			ps.setString(3, "BEIJING");
			/*
			// 修改
			String sql = "update dept set dname=?, loc=? where deptno=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "财务部");
			ps.setString(2, "重庆");
			ps.setInt(3, 66);
			 */
			/*
			// 删除
			String sql = "delete from dept where deptno = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 66);
			 */
			// 执行sql
			int count = ps.executeUpdate();
			System.out.println(count);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 释放资源
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
	}
}
