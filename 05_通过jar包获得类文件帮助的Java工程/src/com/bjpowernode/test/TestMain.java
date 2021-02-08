package com.bjpowernode.test;

import com.bjpowernode.entity.Dept;

/**
 * Created by dlkyy on 2021-02-08 12:29
 */
public class TestMain {
	public static void main(String[] args) {
		Dept d = new Dept(10,"金融部","重庆");
		System.out.println("部门的位置是：" + d.getLoc());
	}
}
