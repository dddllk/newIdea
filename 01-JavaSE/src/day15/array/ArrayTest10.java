package day15.array;

/*
	二维数组的遍历
 */
public class ArrayTest10 {
	public static void main(String[] args) {
		String [][] arr = {
				{"java", "oracle", "c++", "js"},
				{"张三", "dd", "ll"},
				{"jack", "marry", "lose"}
		};
		// 遍历二维数组
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
			  System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
