package day05;
/*
	假设系统给定考生的成绩，请判断该考生的成绩等级：
		1.有效成绩范围：【0-100】
		2.考试成绩可能带有小数
		3.考试成绩和等级之间的对照关系：
			【90-100】 ------  等级A
			【80-90】  ------  等级B
			【70-80】  ------  等级C
			【60-70】  ------  等级D
			【0 -60】  ------  等级E
		4.以上需求必须采用switch语句完成，不能采用if语句。
 */
public class SwitchTest03 {
	public static void main(String[] args) {
		// 创建键盘扫描对象
		java.util.Scanner s = new java.util.Scanner(System.in);
		// 欢迎进入成绩判定系统
		System.out.println("欢迎进入成绩判定系统！");
		System.out.print("请输入学生的成绩：");
		// 接收学生成绩
		double score = s.nextDouble();
		if(score >= 0 & score <= 100) {
			// 成绩/10
			int grade = (int)(score / 10);
			// switch判断
			switch (grade) {
				case 10: case 9:
					System.out.println("该考生的成绩等级为A");
					break;
				case 8:
					System.out.println("该考生的成绩等级为B");
					break;
				case 7:
					System.out.println("该考生的成绩等级为C");
					break;
				case 6:
					System.out.println("该考生的成绩等级为D");
					break;
				default:
					System.out.println("该考生的成绩等级为E");
			}
		}else {
		    System.out.println("您输入的成绩无效！");
		}
	}
}
