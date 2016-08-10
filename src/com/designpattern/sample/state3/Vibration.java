package com.designpattern.sample.state3;

public class Vibration implements MobileAlertState {

	@Override
	public void alert(AlertStateContext ctx) {
		System.out.println("vibration...");
	}

}
