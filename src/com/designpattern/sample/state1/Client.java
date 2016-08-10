package com.designpattern.sample.state1;

public class Client {
	public static void main(String[] args) {
		Context ctx = new Context();
		
		StartState startState = new StartState();
		startState.doAction(ctx);
		System.out.println(ctx.getState().toString());
		
		StopState stopState = new StopState();
		stopState.doAction(ctx);
		System.out.println(ctx.getState().toString());
		
	}
}
