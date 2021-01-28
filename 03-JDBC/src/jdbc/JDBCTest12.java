package jdbc;

import java.sql.*;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Created by dlkyy on 2021-01-28 12:35
 *
 * 	当业务需要sql注入的时候，即需要sql语句拼串的时候，必须使用Statement
 */
public class JDBCTest12 {
	public static void main(String[] args) {
		// 用户在控制台输出desc就是降序，输入asc就是升序；
		Scanner s = new Scanner(System.in);

		System.out.println("用户在控制台输出desc就是降序，输入asc就是升序");
		System.out.println("请输入：");
		String keyWord = s.nextLine();

		// 方案一、使用PreparedStatement拼串
		// 报异常 You have an error in your SQL syntax;
		// check the manual that corresponds to your MySQL server version for the right syntax to use near ''asc''
		// psOrder(keyWord);

		// 方案二、使用Statement拼串
		// 不会报错
		stmtOrder(keyWord);
	}

	/**
	 * 使用Statement拼串
	 * @param keyWord 用户输入
	 */
	private static void stmtOrder(String keyWord) {
		ResourceBundle rb = ResourceBundle.getBundle("jdbc");
		String driver =rb.getString("driver");
		String url = rb.getString("url");
		String user = rb.getString("user");
		String password = rb.getString("password");

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 获取数据库驱动
			Class.forName(driver);
			// 获取数据库连接
			conn = DriverManager.getConnection(url, user, password);
			// 创建数据库操作对象
			stmt = conn.createStatement();
			// 执行sql
			String sql = "select ename from emp order by ename " + keyWord;
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString("ename"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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

	/**
	 * PreparedStatement用于字符串拼串
	 * @param keyWord 用户输入
	 */
	private static void psOrder(String keyWord) {
		ResourceBundle rb = ResourceBundle.getBundle("jdbc");
		String driver =rb.getString("driver");
		String url = rb.getString("url");
		String user = rb.getString("user");
		String password = rb.getString("password");

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// 获取数据库驱动
			Class.forName(driver);
			// 获取数据库连接
			conn = DriverManager.getConnection(url, user, password);
			// 创建预编译的数据库操作对象
			String sql = "select ename from emp order by ename ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, keyWord);
			// 执行sql
			rs = ps.executeQuery();
			while(rs.next()){
				System.out.print(rs.getString("ename"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
	}
}
