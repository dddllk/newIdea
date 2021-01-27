
// ��ϰ
import java.sql.*;

public class JDBCTest04{
	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		try{
			//1.ע�����ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			//2.��ȡ���ݿ�����
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bjpowernode","root","abc123");
			//3.�������ݿ����Ӷ���
			stmt = conn.createStatement();
			// ����sql���
			String sql = "delete from dept where deptno = 80";
			//4.ִ�����ݿ����
			int count = stmt.executeUpdate(sql);
			System.out.println(count == 1 ? "success" : "fail");
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			//6.�ͷ���Դ
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