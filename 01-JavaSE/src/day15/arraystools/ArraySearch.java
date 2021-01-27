package day15.arraystools;

/*
	一个一个挨着赵
 */
public class ArraySearch {
	public static void main(String[] args) {
		int[] arr = {99, 22, 3, 110, 26};
		
		int index = arraySearch(arr, 5);
		System.out.println(index == -1 ? "元素不存在" : "该元素下标是：" + index);
	}
	public static int arraySearch(int[] arr, int ele) {
		for (int i = 0; i < arr.length; i++) {
		  if (ele == arr[i]) {
		  	return i;
			}
		}
		return -1;
	}
}
