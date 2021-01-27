package day15.arraystools;

import java.util.Arrays;

/*
 ArraysTools
 */
public class Test01 {
	public static void main(String[] args) {
		int [] arr = {11, 2, 3, 4, 5};
		Arrays.sort(arr);

		// 遍历输出
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
