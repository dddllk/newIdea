package day19.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
	java.io.DataOutputStream:数据专属的流
	这个流可以将数据联通数据的类型一并写入文件。
	注意：这个文件不是普通文本文档。（不能用记事本打开）
 */
public class DataOutputStreamTest01 {
	public static void main(String[] args) throws Exception{
		// 创建数据专属的字节输出流
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("data"));
		// 写数据
		byte b = 100;
		short s = 101;
		int i = 102;
		long l = 103L;
		float f = 103.3F;
		double d = 3.14;
		boolean sex = false;
		char c = 'd';
		// 写数据
		dos.writeByte(b);
		dos.writeShort(s);
		dos.writeInt(i);
		dos.writeFloat(f);
		dos.writeLong(l);
		dos.writeDouble(d);
		dos.writeBoolean(sex);
		dos.writeChar(c);
		// 刷新流
		dos.flush();
		// 关闭流
		dos.close();
	}
}
