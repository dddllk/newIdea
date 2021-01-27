package day19.bean;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamTest02 {
	public static void main(String[] args) throws Exception{
		// 创建List集合
		List<Student> list = new ArrayList<>();
		//向list集合里添加数据
		list.add(new Student("dd", 16));
		list.add(new Student("ll", 17));
		list.add(new Student("kk", 18));

		// 创建ObjectOutputStream对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student"));
		// 序列化
		oos.writeObject(list);
		// 关闭流
		oos.close();
	}
}
