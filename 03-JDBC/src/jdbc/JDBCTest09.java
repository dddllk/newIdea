package jdbc;
// ��ϰ

import java.sql.*;
import java.util.*;

public class JDBCTest09{
	public static void main(String[] args){

		System.out.println("��ӭ");
		Connection conn;
		Statement stmt = null;
		ResultSet rs = null;

		ResourceBundle rb = ResourceBundle.getBundle("jdbc");
		String driver = rb.getString("driver");
		String url = rb.getString("url");
		String user = rb.getString("user");
		String password = rb.getString("password");
		try{
			//1.ע�����ݿ�����
			Class.forName(driver);
			//2.�������ݿ�����
			conn = DriverManager.getConnection(url,user,password);
			//3.�������ݿ��������
			stmt = conn.createStatement();
			//4.ִ��sql
			String sql = "select empno,ename,job from emp";
			rs = stmt.executeQuery(sql);
			//5.��������
			while(rs.next()){// ���������
				int id = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				// ���
				System.out.println(id + " |" + ename + " |" + job);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//6.�ͷ���Դ
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