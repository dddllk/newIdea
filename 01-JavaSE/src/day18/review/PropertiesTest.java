package day18.review;

import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		// 创建Properties对象
		Properties p = new Properties();
		// 传入参数必须是String类型的
		// p.setProperty(1,2);
		p.setProperty("name", "ddd");
		p.setProperty("password", "1234");

		String value = p.getProperty("name");
		System.out.println(value);

		String value1 = p.getProperty("password");
		System.out.println(value1);
	}
}
