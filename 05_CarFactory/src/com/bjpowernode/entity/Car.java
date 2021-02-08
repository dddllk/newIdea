package com.bjpowernode.entity;

import com.bjpowernode.service.Engine;

/**
 * Created by dlkyy on 2021-02-08 13:40
 */
public class Car {
	private Engine engine;

	public Car(Engine engine) {
	    this.engine = engine;
	}

	public void run() {
		engine.run();
	}
}
