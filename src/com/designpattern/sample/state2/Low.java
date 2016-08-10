package com.designpattern.sample.state2;

public class Low implements State{

	@Override
	public void pull(CeilingFanPullContext ctx) {
		ctx.setState(new Medium());
		System.out.println(" medium speed");
	}
	
}
