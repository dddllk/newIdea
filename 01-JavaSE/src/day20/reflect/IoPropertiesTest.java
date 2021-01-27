package day20.reflect;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class IoPropertiesTest {
	public static void main(String[] args) throws Exception{
/*		String path = Thread.currentThread().getContextClassLoader()
					.getResource("day20/classinfo.properties").getPath();
		FileReader reader = new FileReader(path);
 */
		// 以流的形式返回
		InputStream reader = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("day20/classinfo.properties");
		Properties pro = new Properties();
		pro.load(reader);
		reader.close();
		// 通过key获取value
		String className = pro.getProperty("classname");
		System.out.println(className);
		Class c = Class.forName(className);
		// 通过类创建对象
		//Object o = c.newInstance();
		//System.out.println(o);
	}
}
