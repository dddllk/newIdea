package day15.arraystools;
/*
	选择排序：
		循环一次，然后找出参加比较的这堆数据中最小的，拿着这个最小的值和最前面的数据交换位置

		选择排序比冒泡排序的效率高。
		高在交换位置的次数上。
		选择排序的交换位置是有意义的。

		关键点：怎么找出一堆数据中最小的
			假设

	eg：（5条数据循环4次）
		参加循环的原始数据 （这堆参加比较的数据中最左边的元素下标是0）
			3 2 1 4 6
		第一次循环之后的结果是：
			1 3 2 4 6

		参与比较的数据是 （这堆参加比较的数据中最左边的元素下标是1）
			3 2 4 6
		第二次循环之后的结果是：
			2 3 4 6

		参与比较的数据是 （这堆参加比较的数据中最左边的元素下标是2）
			3 4 6
		第三次循环之后的结果是：
			3 4 6

		参与比较的数据是 （这堆参加比较的数据中最左边的元素下标是3）
		  4 6
		第四次循环之后的结果是
			4 6
 */
public class SelectSort {
	public static void main(String[] args) {
		int[] arr = {5, 8, 2, 4, 6, 9};
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i < arr.length; i++) {
			// i的值正好是 0 1 2 3
			// i 正好是”参与比较的这堆数据中“最左边的那个元素的下标
			// 假设起点坐标是最小的
			int min = i;
		  for(int j = i + 1; j < arr.length; j++) {
		  	count1++;
		  	if(arr[j] < arr[min]) {
		  		min = j; // 最小值下标是j
				}
			}
		  // 当最小的元素下标不是i的时候才交换位置
			// 当i和min相等时，猜测是对的，不需要交换位置
			// 当i和min不相等时，表示最初猜测是错的，有比这个元素更小的元素
			// 需要拿着这个元素和最左边的元素(arr[i])交换位置
		  if(min != i) {
		  	// 表示存在更小的数据
				// arr[min] 最小的数据
				// arr[i] 最前面的数据
		  	int temp = arr[i];
		  	arr[i] = arr[min];
		  	arr[min] = temp;
				count2++;
			}
		}
		System.out.println("比较次数count1: " + count1);
		System.out.println("交换次数count2: " + count2);
		// 输出排序之后的数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

/*
	比较 选择排序和冒泡排序：
		选择排序比冒泡排序的交换更有意义，选择排序的交换次数更少。比较次数不变
 */
