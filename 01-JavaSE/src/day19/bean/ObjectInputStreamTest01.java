package day19.bean;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputStreamTest01 {
	public static void main(String[] args) throws Exception{
		// 创建ObjectInputStream对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student"));

		// 反序列化
		Object obj = ois.readObject();
		// System.out.println(obj instanceof List);
		if(obj instanceof List){
			// 强转
			List<Student> stuList = (List<Student>)obj;
			// foreach遍历
			for (Student stu : stuList) {
				System.out.println(stu);
			}
		}

		// 关闭
		ois.close();
	}
}
