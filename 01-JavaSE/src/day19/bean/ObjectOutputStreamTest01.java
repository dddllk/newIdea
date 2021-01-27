package day19.bean;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest01 {
	public static void main(String[] args) throws IOException {
		// 创建Student对象
		Student stu = new Student("wanger", 17);
		// 创建ObjectOutputStream对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));
		 // 序列化
		oos.writeObject(stu);
	}
}
