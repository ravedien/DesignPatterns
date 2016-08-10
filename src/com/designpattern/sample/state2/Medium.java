package com.designpattern.sample.state2;

public class Medium implements State {

	@Override
	public void pull(CeilingFanPullContext ctx) {
		ctx.setState(new High());
		System.out.println(" high speed");
	}

}
