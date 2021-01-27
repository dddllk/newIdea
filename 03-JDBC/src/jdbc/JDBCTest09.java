package jdbc;
// 练习

import java.sql.*;
import java.util.*;

public class JDBCTest09{
	public static void main(String[] args){

		System.out.println("欢迎");
		Connection conn;
		Statement stmt = null;
		ResultSet rs = null;

		ResourceBundle rb = ResourceBundle.getBundle("jdbc");
		String driver = rb.getString("driver");
		String url = rb.getString("url");
		String user = rb.getString("user");
		String password = rb.getString("password");
		try{
			//1.注册数据库驱动
			Class.forName(driver);
			//2.创建数据库连接
			conn = DriverManager.getConnection(url,user,password);
			//3.创建数据库操作对象
			stmt = conn.createStatement();
			//4.执行sql
			String sql = "select empno,ename,job from emp";
			rs = stmt.executeQuery(sql);
			//5.操作数据
			while(rs.next()){// 如果有数据
				int id = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				// 输出
				System.out.println(id + " |" + ename + " |" + job);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//6.释放资源
			try{
				if(rs != null){
					rs.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
			try{
				if(stmt != null){
					stmt.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
			try{
				if(stmt != null){
					stmt.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}