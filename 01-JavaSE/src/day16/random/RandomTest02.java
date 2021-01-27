package day16.random;

import java.util.Arrays;
import java.util.Random;

/*
	生成五个不重复的随机数。重复的话重新生成
	最终生成的5个随机数放入数组中
	要求：5个随机数不重复
 */
public class RandomTest02 {
	public static void main(String[] args) {
		// 创建数组
		int[] arr = new int[5]; // 数组的默认值是0, 随机数可能也是0
		// 创建Random对象
		Random random = new Random();
		
		// 将arr数组的值全部改为-1，区分是默认0，还是随机产生的0
		Arrays.fill(arr, -1);

		// 下标
		int index = 0;
		while(index < arr.length) {
			// 生成随机数
			int num = random.nextInt(6);
			// 判断数组中是否有这个num
			// 如果没有，就放进去
			if(!contains(arr, num)) {
				arr[index++] = num;// index = 0
				// index = 1
			}
		}
		// 变量数组
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	// 该方法用来判断数组中是否包含这个元素
	public static boolean contains(int[] arr, int key) {
		// 对数组进行升序
		// Arrays.sort(arr); 不能进行排序
		for(int i = 0; i < arr.length; i++) {
		   if(arr[i] == key) {
		     return true;
		   }
		}
		return false;
		// 进行二分法查找
		//return Arrays.binarySearch(arr, key) >= 0;
	}
}
