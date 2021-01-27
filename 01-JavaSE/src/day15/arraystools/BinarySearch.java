package day15.arraystools;
/*
	查找算法的二分法查找：基于排序的基础之上，没有排序的数组是无法查找的
	二分法查找终止的条件：一直折半，直到中间的那个元素恰好是被查找的元素
 */
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int index = arraySearch(arr, 9);
		System.out.println(index == -1 ? "该元素不存在" : "该元素下标：" + index);
	}
	public static int arraySearch(int[] arr, int ele) {
		int beginIndex = 0 ;
		int endIndex = arr.length - 1;
		while(beginIndex <= endIndex) {
			int middleIndex = (beginIndex + endIndex)/2;
			if(arr[middleIndex] > ele) { // 在中间元素的左边
				endIndex = middleIndex - 1; // 一直减
			}else if (arr[middleIndex] < ele) { // 在中间元素的右边
				// 开始元素下标重新赋值
				beginIndex = middleIndex + 1; // 一直增
			}else {
				return middleIndex;
			}
		}
		return -1;
	}
}
