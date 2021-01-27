package day15.integer;
/*
	1.java中为8中基本数据类型有对应准备了8中包装类型，8中包装类属于引用数据类型，父类是Object。
	2.为什么要提供8种包装类型？
	3.8中基本数据类型对应的包装类型：
				基本数据类型                 包装类型
				---------------------------------
				byte                       java.lang.Byte(父类Number)
				short                      java.lang.Short(父类Number)
				int                        java.lang.Integer(父类Number)
				long                       java.lang.Long(父类Number)
				float                      java.lang.Float(父类Number)
				double                     java.lang.Double(父类Number)
				boolean                    java.lang.Boolean(父类Object)
				char                       java.lang.Character(父类Object)

		Number是抽象类，无法实例化对象
 */
public class IntegerTest01 {
	public static void main(String[] args) {
		Byte b;
		Character c;
		// 100这个基本数据类型，进行构造方法的包装达到了：基本数据类型向引用数据类型的转换
		Integer i = new Integer(100);//int ---> Integer
		float f = i.floatValue();
		System.out.print(f);

		Integer y = new Integer("123"); //String --> Integer
		System.out.println(y);

		Double b1 = new Double(1.23); // double --> Double

		Double e = new Double("1.23"); // String --> Double
		System.out.println(e);
	}
}
/*
	基本数据类型转换为引用数据类型：装箱
	引用数据类型转换为基本数据类型：拆箱
 */