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

