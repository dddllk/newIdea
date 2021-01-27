package jdbc;
/*
JDBC���6��
*/
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class JDBCTest01{
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try{
			//1.ע������
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			//2.��ȡ����
			/*
				url: ͳһ��Դ��λ����������ĳ����Դ�ľ���·��
					����Э�顢IP��PORT����Դ��
					127.0.0.1��localhost���Ǳ���IP��ַ��
			*/
			String url = "jdbc:mysql://127.0.0.1:3306/bjpowernode";
			String user = "root";
			String password = "abc123";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("���ݿ����Ӷ��� = " + conn);// ���ݿ����Ӷ��� = com.mysql.jdbc.JDBC4Connection@1060b431
			//3.��ȡ���ݿ��������
			stmt = conn.createStatement();
			//4.ִ��sql
			String sql = "insert into dept(deptno,dname,loc) values(50,'���²�','BEIJING')";
			// ר��ִ��DML���ģ�insert delete update��
			// ����ֵ��Ӱ�죬���ݿ��еļ�¼����
			int count = stmt.executeUpdate(sql);
			System.out.println(count == 1 ? "success":"fail");
			// �����ѯ�����
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			//6.�ͷ���Դ
			// Ϊ�˱�֤��Դһ���ͷţ���finally�����йر���Դ
			// ����Ҫ��ѭ��С��������ִ�С�
			// �ֱ����try...catch
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