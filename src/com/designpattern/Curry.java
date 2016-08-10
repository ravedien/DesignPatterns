package com.designpattern;

public class Curry extends Player{
	
	ShootingBehaviour shooting;
	
	public Curry(ShootingBehaviour shooting){
		this.shooting = shooting;
	}
	
	public void doShooting(){
		shooting.shoot();
	}
}
