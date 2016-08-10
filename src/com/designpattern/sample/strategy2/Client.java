package com.designpattern.sample.strategy2;

public class Client {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println(context.executeStrategy(10, 20));
		context = new Context(new OperationSubtract());
		System.out.println(context.executeStrategy(10, 20));
	}
}
