package day15.arraystools;
/*
	冒泡排序（eg）
	1.每一次循环结束后，都要找出最大的数据，放到参与比较这堆数据的最右边
	2.核心：
			拿着左边的数字和右边的数字比对，当左边 > 右边的时候（升序），交换位置
			即使原始数据是左边 > 右边（升序）但仍要做比较
		原始数据：
			5, 8, 2, 4, 6, 9
		第一次循环：（比较的数据是 5, 8, 2, 4, 6, 9）
			5 8 2 4 6 9
			5 2 8 4 6 9
			5 2 4 8 6 9
			5 2 4 6 8 9
			5 2 4 6 8 9
		第二次循环：（比较的数据是 5 2 4 6 8）
			2 5 4 6 8
			2 4 5 6 8
			2 4 5 6 8
			2 4 5 6 8
		第三次循环：（比较的数据是 2 4 5 6）
			2 4 5 6
			2 4 5 6
			2 4 5 6
		第四次循环：（比较的数据是 2 4 5）
			2 4 5
			2 4 5
		第五次循环：（比较的数据是2 4）
			2 4
 */
public class BubbleSort {
	public static void main(String[] args) {
		int [] arr = {5, 8, 2, 4, 6, 9};
		int count1 = 0;
		int count2 = 0;
		for(int i = arr.length - 1; i > 0; i--) { // 6条数据循环5次
			// System.out.println("i: " + i);
			for(int j = 0; j < i; j++) { // 6条数据比较5次
				// System.out.println("j: " + j);
				// 不论是否需要交换位置，总之是要比较一次的
				count1++;
				if(arr[j] > arr[j+1]) {
					// 定义临时变量交互位置
					// a[j] 和 a[j+1]交换位置
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					count2++;
				}
			}
		}
		// 输出比较次数
		System.out.println("比较次数count1: " + count1);
		System.out.println("交换次数count2: " + count2);
		// 输出排序后的数组
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
