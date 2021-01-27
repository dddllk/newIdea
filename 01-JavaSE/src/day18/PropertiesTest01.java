package day18;

import java.util.Properties;

/*
	目前只需要掌握Properties属性类对象的相关方法即可。
	Properties是一个Map集合，继承Hashtable，Properties的key和value都是String类型。
	Properties被称为属性类对象。
 */
public class PropertiesTest01 {
	public static void main(String[] args) {
		// 创建一个Properties对象
		Properties props = new Properties();
		// Properties的两个方法，一个存，一个取
		props.setProperty("123", "123");
		props.setProperty("123", "456");

		props.setProperty("999","1234");
		props.setProperty("999","1234");
		props.setProperty("999","1234");
		props.setProperty("999","1234");
		props.setProperty("999","1234");
		props.setProperty("999","1234");
		
		// 通过值获取value
		String value1 = props.getProperty("123");
		System.out.println(value1);
	}
}
