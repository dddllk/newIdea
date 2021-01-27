
// 练习
import java.sql.*;

public class JDBCTest04{
	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		try{
			//1.注册数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.获取数据库连接
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bjpowernode","root","abc123");
			//3.创建数据库连接对象
			stmt = conn.createStatement();
			// 创建sql语句
			String sql = "delete from dept where deptno = 80";
			//4.执行数据库操作
			int count = stmt.executeUpdate(sql);
			System.out.println(count == 1 ? "success" : "fail");
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			//6.释放资源
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