package com.designpattern.sample.state1;

public class StartState implements State {

	@Override
	public void doAction(Context ctx) {
		System.out.println("Player is in start state");
		ctx.setState(this);
	}

	public String toString() {
		return "Start State";
	}
}
