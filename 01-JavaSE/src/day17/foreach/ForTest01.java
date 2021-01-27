package day17.foreach;
/*
	增强for循环，foreach
 */
public class ForTest01 {
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 5, 6};
		// 遍历，增强for循环
		// foreach有个缺点，是没有下标。在需要使用下标的时候不建议使用增强for循环
		for(int data : arr) { // data代表的是数组中的每个元素 arr表示数组
			System.out.println(data);
		}
	}
}
