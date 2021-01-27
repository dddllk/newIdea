package day19.io;

import java.io.DataInputStream;
import java.io.FileInputStream;

/*
	DataInputStream:数据字节输入流
	DataOutputStream写的文件，只能使用DataInputStream去读，并且读的时候需要知道写入的顺序
	读写顺序一致，才能取出数据。
 */
public class DataInputStreamTest01 {
	public static void main(String[] args) throws Exception{
		// 创建数据专属字节输出流
		DataInputStream dis = new DataInputStream(new FileInputStream("data"));
		// 读
		byte b = dis.readByte();
		short s = dis.readShort();
		int i = dis.readInt();
		float f = dis.readFloat();
		long l = dis.readLong();
		double d = dis.readDouble();
		boolean sex = dis.readBoolean();
		char c = dis.readChar();

/*	dos.writeByte(b);
		dos.writeShort(s);
		dos.writeInt(i);
		dos.writeFloat(f);
		dos.writeLong(l);
		dos.writeDouble(d);
		dos.writeBoolean(sex);
		dos.writeChar(c);*/
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(sex);
		System.out.println(c);
	}
}
