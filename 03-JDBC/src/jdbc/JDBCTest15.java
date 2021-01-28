package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by dlkyy on 2021-01-28 15:10
 *
 * 重点三行代码：
 * 	conn.setAutoCommit(boolean flag); flag为false，改为手动提交事务
 * 	conn.commit(); 提交事务
 * 	conn.rollback(); 回滚事务
 */
public class JDBCTest15 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			//注册数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取数据库连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","123456");
			// 将自动提交机制修改为手动提交
			// 如果不改为自动提交(会丢失10000)
			conn.setAutoCommit(false);
			//获取预编译的数据库操作对象
			String sql = "update t_act set balance= ? where actno = ?";
			ps = conn.prepareStatement(sql);
			// 给?传值
			ps.setInt(1, 10000);
			ps.setInt(2, 111);
			int count = ps.executeUpdate();
			System.out.println(count);

			// String s = null;
			// s.toString();

			// 给?传值
			ps.setInt(1, 10000);
			ps.setInt(2, 222);
			count += ps.executeUpdate();
			System.out.println(count);
			// 执行sql
			System.out.println(count == 2 ? "转账成功" : "转账失败");

			// 程序能够走到这里说明以上程序没有异常，事务结束，手动提交数据
			// 提交事务
			conn.commit();

		} catch (Exception e) {
			// 回滚事务
			if(conn != null){
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
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
