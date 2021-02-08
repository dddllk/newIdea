package com.bjpowernode.test;

import com.bjpowernode.entity.Car;
import com.bjpowernode.service.Engine;
import com.bjpowernode.serviceImpl.SportEngine;
import com.bjpowernode.serviceImpl.SuvEngine;

/**
 * Created by dlkyy on 2021-02-08 13:53
 */
public class TestMain {
	public static void main(String[] args) {
		// 运动汽车
		Engine engine = new SportEngine();
		Car car = new Car(engine);
		car.run();

		// Suv
		Engine engine1 = new SuvEngine();
		Car car1 = new Car(engine1);
		car1.run();
	}
}
