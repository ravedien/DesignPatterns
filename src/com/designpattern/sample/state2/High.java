package com.designpattern.sample.state2;

public class High implements State {

	@Override
	public void pull(CeilingFanPullContext ctx) {
		ctx.setState(new Low());
		System.out.println(" turning off");
	}

}
