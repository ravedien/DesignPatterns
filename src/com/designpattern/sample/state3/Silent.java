package com.designpattern.sample.state3;

public class Silent implements MobileAlertState{

	@Override
	public void alert(AlertStateContext ctx) {
		System.out.println("Silent...");
	}

}
