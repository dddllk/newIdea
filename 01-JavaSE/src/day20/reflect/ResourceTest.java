package day20.reflect;

import java.util.ResourceBundle;

/*
	Java.util包下提供了一个资源绑定器，便于获取属性配置文件中的内容
		使用这种方式的时候，属性配置文件xx.properties必须放到类路径下。
 */
public class ResourceTest {
	public static void main(String[] args) {
		// 资源绑定器，只能绑定xx.properties文件，并且这个文件必须放在类路径下。文件扩展名必须是.properties。
		// 并且在写路径的时候，路径后面的扩展名(.properties)不能写。
		ResourceBundle bundle = ResourceBundle.getBundle("day20/classinfo");
		String className = bundle.getString("classname");
		System.out.println(className);
	}
}
