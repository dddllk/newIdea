package day15.homework2;

import java.util.Scanner;

public class Customer {
	private Function function;

	public Customer() {
	}

	public Customer(Function function) {
		this.function = function;
	}

	public Function getFunction() {
		return function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}

	public boolean order(int roomNo) {
		return function.Order(roomNo);
	}
	public boolean unsubscribe(int roomNo) {
		return function.Unsubscribe(roomNo);
	}
}
