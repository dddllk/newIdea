package jdbc;
/*
	ע����������һ�ַ�ʽ
*/
import java.sql.*;

public class JDBCTest03{
	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		try{
			//1.ע������
			Class.forName("com.mysql.jdbc.Driver");
			//2.��ȡ����
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","abc123");
			//3.��ȡ���ݿ��������
			stmt = conn.createStatement();
			// ����sql���
			String sql = "insert into dept values(80,'writer', 'cq')";
			// 4.ִ��sql���
			int count = stmt.executeUpdate(sql);
			System.out.println(count == 1 ? "success" : "fail");
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			// 6.�ͷ���Դ
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