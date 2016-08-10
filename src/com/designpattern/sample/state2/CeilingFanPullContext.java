package com.designpattern.sample.state2;

public class CeilingFanPullContext {
	private State currentState;
	
	public CeilingFanPullContext(){
		currentState = new Off();
	}
	
	public void setState(State state){
		this.currentState = state;
	}
	
	public void pull(){
		 currentState.pull(this);
	}
}
