package day15.array;
/*
	方法的参数是数组的另外一种传参方法
 */
public class ArrayTest04 {
	public static void main(String[] args) {
		// 直接传递一个静态数组
		printArray(new int[]{1, 2, 3});
	}
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
