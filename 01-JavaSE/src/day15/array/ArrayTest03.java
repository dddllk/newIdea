package day15.array;
/*
	方法是数组的传参方式
 */
public class ArrayTest03 {
	public static void main(String[] args) {
		int[] x = {1, 2, 3, 4, 5};
		printArray(x);
		String[] s = {"xixi", "hehe"};
		printArray(s);
	}
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	public static void printArray(String[] args) {
	  for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
