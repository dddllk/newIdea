package day15.arraystools;

import java.util.Arrays;

public class ArraysTest01 {
	public static void main(String[] args) {
		int[] arr = {9, 2, 3, 4, 6, 10};
		Arrays.sort(arr);
		for(int i:arr) System.out.print(i + " ");
	}
}
