package day15.array;
/*
	一维数组的扩容：（数据新建好了长度不变）
		java中扩容是先新建一个大容量数组，然后将小容量数组中的数组一个一个拷贝到大数组当中。

		结论：数组扩容效率较低
 */
public class ArrayTest08 {
	public static void main(String[] args) {
		int[] src = {1, 11, 111, 1111};
		int[] dest = new int[20];
		// 数组拷贝（Ctrl + p提示参数）
		System.arraycopy(src, 1, dest,3,2);

		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
	}
}
