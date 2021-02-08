package com.bjpowernode.serviceImpl;

import com.bjpowernode.service.Engine;

/**
 * Created by dlkyy on 2021-02-08 13:45
 */
public class SportEngine implements Engine {

	@Override
	public void run() {
		System.out.println("0-100km加速时间4秒钟！");
	}
}
