package jdbc;
/**
 * Created by dlkyy on 2021-01-27 12:27
 */

import java.sql.*;
import java.util.ResourceBundle;

public class JDBCTest10 {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		ResourceBundle bd = ResourceBundle.getBundle("jdbc");
		String driver = bd.getString("driver");
		String url = bd.getString("url");
		String user = bd.getString("user");
		String password = bd.getString("password");
		try {
			
			//1.创建数据库驱动
			Class.forName(driver);
			//2.获取数据库连接
			conn = DriverManager.getConnection(url, user, password);
			//3.创建数据库操作对象
			stmt = conn.createStatement();
			//4.执行sql
			String sql = "select empno, ename, sal from emp";
			rs = stmt.executeQuery(sql);
			//5.操作数据
			while(rs.next()) {
			    int empno = rs.getInt("empno");
			    String ename = rs.getString("ename");
			    double sal = rs.getDouble("sal");
				System.out.println(empno + " |" + ename + " |" + sal);
			}
			//6.释放资源
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null){
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(stmt != null){
				try {
					stmt.close();
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
/*
SQL注入问题：
	1.解决SQL注入问题：
		只要用户提供的信息不参与SQL语句的编译过程，问题就解决了。
		即使用户提供的信息中含有SQL语句的关键字，但是没有参与编译、不起作用
		要想用户信息不参与SQL语句的编译，那么必须使用java.sql.PreparedStatement
		PreparedStatement接口继承了java.sql.Statement
		PreparedStatement属于预编译的数据库操作对象
		PreparedStatement的原理是：预先对SQL语句的框架进行编译，然后再给SQL语句传值。
	2.解决SQL注入问题的关键是：
		用户提供的信息中即使含有sql语句的关键字，也不参与sql语句的编译。
 */

