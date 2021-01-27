package jdbc;
/*
	JDBC完成delete
*/
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class JDBCTest02{
	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		try{
			// 1.注册驱动
			Driver driver  = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			// 2.获取连接
			String url = "jdbc:mysql://127.0.0.1:3306/bjpowernode";
			String user = "root";
			String password = "abc123";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
			// 3.获取数据库操作对象
			stmt = conn.createStatement();
			// 4.执行sql语句
			String sql = "delete from dept where deptno = '50'";
			int count = stmt.executeUpdate(sql);
			System.out.println(count == 1 ? "success" : "fail");
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			// 6.释放资源
			try{
				if(stmt != null){
					stmt.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
			try{
				if(conn != null){
					conn.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}