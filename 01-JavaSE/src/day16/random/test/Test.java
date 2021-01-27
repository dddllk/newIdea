package day16.random.test;

import java.util.Arrays;
import java.util.Random;

/*
	模拟随机点名
 */
public class Test {
	public static void main(String[] args) {
		// 创建6个学生对象
		Student[] st = new Student[6];
		for (int i = 0; i < st.length; i++) {
			if (i%2 == 0) {
				st[i] = new Student(i, true);
			}else {
				st[i] = new Student(i, false);
			}
			System.out.println(st[i]);
		}
		// 创建随机数对象
		Random random = new Random();
		int no = random.nextInt(6);
		System.out.print("随机学号学生出勤情况：");
		System.out.println(st[no]);
	}
}
