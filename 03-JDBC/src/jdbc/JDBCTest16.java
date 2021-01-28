package jdbc;

import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by dlkyy on 2021-01-28 16:05
 *  任务：
 *  	调试DBUtil是否好用
 *  	模糊查询
 */
public class JDBCTest16 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// 获取连接
			conn = DBUtil.getConnection();
			// 获取预编译的数据库操作对象
			// 错误的写法
			/*
				String sql = "select ename from emp where ename like '_?%'";
				ps = conn.prepareStatement(sql);
				ps.setString(1, "A");
			 */
			// 正确的写法
			String sql = "select ename from emp where ename like ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "_A%");

			// 执行sql
			rs = ps.executeQuery();
			// 处理结果集
			while(rs.next()){
				System.out.println(rs.getString("ename"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		    DBUtil.close(conn, ps, rs);
		}
	}
}
