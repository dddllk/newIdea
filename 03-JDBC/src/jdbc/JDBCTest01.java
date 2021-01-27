package jdbc;
/*
JDBC编程6步
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
			//1.注册驱动
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			//2.获取连接
			/*
				url: 统一资源定位符，网络中某个资源的绝对路径
					包括协议、IP、PORT、资源名
					127.0.0.1和localhost都是本机IP地址。
			*/
			String url = "jdbc:mysql://127.0.0.1:3306/bjpowernode";
			String user = "root";
			String password = "abc123";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("数据库连接对象 = " + conn);// 数据库连接对象 = com.mysql.jdbc.JDBC4Connection@1060b431
			//3.获取数据库操作对象
			stmt = conn.createStatement();
			//4.执行sql
			String sql = "insert into dept(deptno,dname,loc) values(50,'人事部','BEIJING')";
			// 专门执行DML语句的（insert delete update）
			// 返回值是影响，数据库中的记录条数
			int count = stmt.executeUpdate(sql);
			System.out.println(count == 1 ? "success":"fail");
			// 处理查询结果集
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			//6.释放资源
			// 为了保证资源一定释放，在finally语句块中关闭资源
			// 并且要遵循从小到大依次执行。
			// 分别对其try...catch
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