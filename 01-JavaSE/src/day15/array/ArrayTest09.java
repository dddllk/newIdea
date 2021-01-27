package day15.array;
/*
	java中的二维数组：
		1.二维数组其实是一个特殊的一维数组，特殊在这个一维数组当中的每一个元素都是一维数组
 		2.二维数组静态初始化
 */
public class ArrayTest09 {
	public static void main(String[] args) {
		// 一维数组
		int[] array = {1, 2, 3};
		// 二维数组
		int [][] a = {
				{1, 2, 3},
				{1, 2, 3},
				{2, 3, 4},
				{0}
		};

		System.out.println(a[1].length);
	}
}
