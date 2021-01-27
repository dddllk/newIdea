package day15.array;
/*
	动态初始化二维数组
 */
public class ArrayTest11 {
	public static void main(String[] args) {
		int [][] arr = new int[3][4];
		// 调用打印二维数组方法
		printArray(arr);
		System.out.println();

		int[][] a = {
			{1, 2, 3, 4},
			{3, 4, 5, 6},
			{2, 3}
		};
		printArray(a);

		System.out.println();
		printArray(new int[][]{{1, 2, 3}, {4, 5}});

	}
	// 打印二维数组
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
