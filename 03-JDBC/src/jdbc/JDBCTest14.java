package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by dlkyy on 2021-01-28 14:42
 *
 * JDBC事务机制：
 * 	1.JDBC中的事务是自动提交的，什么是自动提交？
 * 		只要执行任意一条DML语句，则自动提交一次。这是JDBC默认的事务行为。
 * 		但是在实际业务当中，通常都是N条DML语句共同联合才能完成，必须
 * 		保证他们这些DML语句在同一个事务中同时完成或者同时失败
 * 	2.以下程序来验证JDBC的事务是否自动提交机制
 * 		测试结果，JDBC中只要执行任意一条DML语句，就提交一次。
 */
public class JDBCTest14 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			//注册数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取数据库连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","123456");
			//获取预编译的数据库操作对象
			String sql = "update dept set dname=? where deptno = ?";
			ps = conn.prepareStatement(sql);
			// 执行sql
			// 第一次占位符传值
			ps.setString(1, "x部门");
			ps.setInt(2, 30);
			int count = ps.executeUpdate();
			System.out.println(count);

			// 重薪给占位符传值
			ps.setString(1, "y部门");
			ps.setInt(2, 40);
			count = ps.executeUpdate();
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
