package jdbc;
/*
	注册驱动的另一种方式
*/
import java.sql.*;

public class JDBCTest03{
	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		try{
			//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.获取连接
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","abc123");
			//3.获取数据库操作对象
			stmt = conn.createStatement();
			// 创建sql语句
			String sql = "insert into dept values(80,'writer', 'cq')";
			// 4.执行sql语句
			int count = stmt.executeUpdate(sql);
			System.out.println(count == 1 ? "success" : "fail");
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			// 6.释放资源
			try{
				if(conn != null){
					conn.close();
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