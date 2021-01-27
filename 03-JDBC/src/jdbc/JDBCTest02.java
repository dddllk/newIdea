package jdbc;
/*
	JDBC���delete
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
			// 1.ע������
			Driver driver  = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			// 2.��ȡ����
			String url = "jdbc:mysql://127.0.0.1:3306/bjpowernode";
			String user = "root";
			String password = "abc123";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
			// 3.��ȡ���ݿ��������
			stmt = conn.createStatement();
			// 4.ִ��sql���
			String sql = "delete from dept where deptno = '50'";
			int count = stmt.executeUpdate(sql);
			System.out.println(count == 1 ? "success" : "fail");
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			// 6.�ͷ���Դ
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