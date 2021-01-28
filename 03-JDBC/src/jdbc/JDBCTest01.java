package jdbc;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Created by dlkyy on 2021-01-27 16:37
 */
public class JDBCTest01 {
	public static void main(String[] args) {
		// 初始化用户界面
		Map<String, String> userMap =  InitUI();
		// 登录
		boolean flag = login(userMap);

		System.out.println(flag ? "success" : "fail");
	}

	/**
	 *
	 * @param userMap 用户登录信息
	 * @return true表示登录成功，false表示登录失败
	 */
	private static boolean login(Map<String, String> userMap) {

		// 定义标识
		boolean loginSuccess = false;

		ResourceBundle bd = ResourceBundle.getBundle("jdbc");
		String driver = bd.getString("driver");
		String url = bd.getString("url");
		String user = bd.getString("user");
		String password = bd.getString("password");

		String loginName = userMap.get("loginName");
		String loginPwd = userMap.get("loginPwd");

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 注册驱动
			Class.forName(driver);
			// 获取数据库连接
			conn = DriverManager.getConnection(url, user, password);
			// 创建数据库操作对象
			stmt = conn.createStatement();
			// 执行sql
			String sql = "select *from t_user where loginName='"+ loginName + "' and loginPwd ='" + loginPwd + "'";

			rs = stmt.executeQuery(sql);
			// 操作数据
			if(rs.next()){
				loginSuccess = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null){
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(stmt != null){
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return loginSuccess;
	}

	/**
	 *  初始化用户界面
	 * @return 用户输入用户名密码等信息
	 */
	private static Map<String, String> InitUI() {

		System.out.println("欢迎！");
		Scanner sc = new Scanner(System.in);

		System.out.print("用户名：");
		String username = sc.nextLine();

		System.out.print("密码：");
		String password = sc.nextLine();

		Map<String, String> userInfo = new HashMap<>();
		userInfo.put("loginName", username);
		userInfo.put("loginPwd", password);

		return userInfo;
	}
}
