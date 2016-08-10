package com.designpattern.sample.state3;

public class Client {
	public static void main(String[] args) {
		AlertStateContext ctx = new AlertStateContext();
		ctx.alert();
		ctx.setState(new Silent());
		ctx.alert();
	}
}
